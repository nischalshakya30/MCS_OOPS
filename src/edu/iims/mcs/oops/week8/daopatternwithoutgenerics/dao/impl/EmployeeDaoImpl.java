package edu.iims.mcs.oops.week8.daopatternwithoutgenerics.dao.impl;

import edu.iims.mcs.oops.week8.daopatternwithoutgenerics.dao.EmployeeDao;
import edu.iims.mcs.oops.week8.daopatternwithoutgenerics.exception.NotFoundException;
import edu.iims.mcs.oops.week8.daopatternwithoutgenerics.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private static final List<Employee> employees = new ArrayList<>();

    @Override
    public void save(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void update(Employee employee, Long id) {

    }

    @Override
    public void delete(Long id) {
        Employee employee = findOne(id);
        employees.remove(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public Employee findOne(Long id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        throw new NotFoundException("Id not found");
    }
}
