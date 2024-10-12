package com.ironhack.labweek9.service;

import com.ironhack.labweek9.model.Employee;
import com.ironhack.labweek9.model.EmployeeStatusOnlyDTO;
import com.ironhack.labweek9.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployeeStatus(Integer id, EmployeeStatusOnlyDTO status) {
        Employee employee = employeeRepository.findById(id).get();
        employee.setStatus(status.getStatus());
        return employeeRepository.save(employee);
    }
}
