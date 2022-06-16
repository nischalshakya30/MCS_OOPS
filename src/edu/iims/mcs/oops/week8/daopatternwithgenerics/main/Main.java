package edu.iims.mcs.oops.week8.daopatternwithgenerics.main;

import edu.iims.mcs.oops.week8.daopatternwithgenerics.dao.EmployeeDao;
import edu.iims.mcs.oops.week8.daopatternwithgenerics.dao.impl.EmployeeDaoImpl;
import edu.iims.mcs.oops.week8.daopatternwithgenerics.model.Employee;

public class Main {

    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();

        Employee employeeOne = new Employee(1L, "Nischal", "Shakya", 1000.0);
        Employee employeeTwo = new Employee(2L, "Uzumaki", "Naruto", 2000.0);
        Employee employeeThree = new Employee(3L, "Uchia", "Sasuke", 3000.0);
        Employee employeeFour = new Employee(4L, "Haruna", "Sakura", 4000.0);

        employeeDao.save(employeeOne);
        employeeDao.save(employeeTwo);
        employeeDao.save(employeeThree);
        employeeDao.save(employeeFour);

        System.out.println("----Getting All Employee-----");
        System.out.println(employeeDao.findAll());

        System.out.println("----Getting Single Employee-----");
        System.out.println(employeeDao.findOne(4L));

        System.out.println("-----Updating Single Employee-------s");
        Employee employeeToBeUpdate = new Employee(4L, "Nara", "Shikamaru", 4000.0);
        employeeDao.update(employeeToBeUpdate, 4L);
        System.out.println(employeeDao.findOne(4L));

        System.out.println("----Deleting Employee with id 3L-----");
        employeeDao.delete(3L);
        System.out.println(employeeDao.findAll());

    }

}
