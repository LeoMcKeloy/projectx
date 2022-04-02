package ru.projectx.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.projectx.entity.Employee;
import ru.projectx.errors.EmployeeNotFoundException;
import ru.projectx.repository.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository repository;

    public Employee findById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    public void addNewEmployee(Employee employee) {
        repository.save(employee);
    }

    public List<Employee> findAll() {
        return repository.findAll();
    }
}
