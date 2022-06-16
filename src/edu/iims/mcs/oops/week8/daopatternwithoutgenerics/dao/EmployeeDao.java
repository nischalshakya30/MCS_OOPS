package edu.iims.mcs.oops.week8.daopatternwithoutgenerics.dao;

import edu.iims.mcs.oops.week8.daopatternwithoutgenerics.model.Employee;

import java.util.List;

public interface EmployeeDao {

    void save(Employee employee);

    void update(Employee employee, Long id);

    void delete(Long id);

    List<Employee> findAll();

    Employee findOne(Long id);

}
