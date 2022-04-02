package ru.projectx.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.projectx.dto.EmployeeDto;
import ru.projectx.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService service;

    @GetMapping("/{id}")
    public EmployeeDto findById(@PathVariable("id") Integer id) {
        return EmployeeDto.fromEmployee(service.findById(id));
    }
}
