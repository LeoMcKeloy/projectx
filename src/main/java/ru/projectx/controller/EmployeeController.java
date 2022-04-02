package ru.projectx.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.projectx.dto.EmployeeDto;
import ru.projectx.entity.Employee;
import ru.projectx.service.EmployeeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService service;

    @GetMapping("/{id}")
    public EmployeeDto findById(@PathVariable("id") Integer id) {
        return EmployeeDto.fromEmployee(service.findById(id));
    }

    @GetMapping
    public List<EmployeeDto> findAll() {
        List<Employee> employees = service.findAll();

        return employees.stream()
                .map(EmployeeDto::fromEmployee)
                .collect(Collectors.toList());
    }

    public void addNewEmployee(@RequestBody EmployeeDto request) {
        service.addNewEmployee(Employee.fromEmployeeDto(request));
    }
}
