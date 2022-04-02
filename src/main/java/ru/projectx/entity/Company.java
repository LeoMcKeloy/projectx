package ru.projectx.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.projectx.dto.CompanyDto;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "company")
public class Company {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public static Company fromCompanyDto(CompanyDto companyDto) {
        return Company.builder()
                .id(companyDto.getId())
                .name(companyDto.getName())
                .build();
    }
}
