package ru.projectx.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.projectx.entity.Employee;
import ru.projectx.errors.EmployeeNotFoundException;
import ru.projectx.repository.EmployeeRepository;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository repository;

    public Employee findById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }
}
