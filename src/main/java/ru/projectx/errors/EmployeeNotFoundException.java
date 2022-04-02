package ru.projectx.errors;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class EmployeeNotFoundException extends RuntimeException {
    private final Integer[] ids;

    public  EmployeeNotFoundException(Integer... ids) {
        super(String.format("No employees with the following ids [%s] were found in the database", Arrays.toString(ids)));
        this.ids = ids;
    }
}
