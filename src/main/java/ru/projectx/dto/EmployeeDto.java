package ru.projectx.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import ru.projectx.entity.Employee;

import java.time.LocalDate;

@Data
@Builder
public class EmployeeDto {
    Integer id;
    String fullName;
    LocalDate birthday;
    String company;

    public static EmployeeDto fromEmployee(Employee employee) {
        return EmployeeDto.builder()
                .fullName(employee.getFirstName() + " " + employee.getLastName())
                .birthday(employee.getBirthday())
                .company(employee.getCompany().getName())
                .build();
    }
}
