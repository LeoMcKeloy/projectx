package ru.projectx.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.projectx.dto.EmployeeDto;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Integer salary;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public static Employee fromEmployeeDto(EmployeeDto employeeDto) {
        String[] names = employeeDto.getFullName().split(" ");
        return Employee.builder()
                .firstName(names[0])
                .lastName(names[1])
                .birthday(employeeDto.getBirthday())
                .company(Company.fromCompanyDto(employeeDto.getCompany()))
                .salary(employeeDto.getSalary())
                .build();
    }
}
