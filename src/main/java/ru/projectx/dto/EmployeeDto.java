package ru.projectx.dto;

import lombok.Builder;
import lombok.Data;
import ru.projectx.entity.Employee;

import java.time.LocalDate;

@Data
@Builder
public class EmployeeDto {
    String fullName;
    LocalDate birthday;
    CompanyDto company;
    Integer salary;

    public static EmployeeDto fromEmployee(Employee employee) {
        return EmployeeDto.builder()
                .fullName(employee.getFirstName() + " " + employee.getLastName())
                .birthday(employee.getBirthday())
                .company(CompanyDto.fromCompany(employee.getCompany()))
                .salary(employee.getSalary())
                .build();
    }
}
