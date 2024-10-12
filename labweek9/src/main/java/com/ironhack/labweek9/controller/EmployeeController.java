package com.ironhack.labweek9.controller;

import com.ironhack.labweek9.model.Employee;
import com.ironhack.labweek9.model.EmployeeStatusOnlyDTO;

public interface EmployeeController {

    public Employee createEmployee(Employee employee);

    public Employee updateEmployeeStatus(Integer id, EmployeeStatusOnlyDTO status);
}
