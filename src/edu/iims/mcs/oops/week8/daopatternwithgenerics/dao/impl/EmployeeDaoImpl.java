package edu.iims.mcs.oops.week8.daopatternwithgenerics.dao.impl;

import edu.iims.mcs.oops.week8.daopatternwithgenerics.dao.EmployeeDao;
import edu.iims.mcs.oops.week8.daopatternwithgenerics.model.Employee;

import java.util.ArrayList;

public class EmployeeDaoImpl extends GenericDaoImpl<Employee> implements EmployeeDao {

    public EmployeeDaoImpl() {
        super(new ArrayList<>());
    }

}