package ru.projectx.dto;

import lombok.Builder;
import lombok.Data;
import ru.projectx.entity.Company;

@Data
@Builder
public class CompanyDto {
    private Integer id;
    private String name;

    public CompanyDto fromCompany(Company company) {
        return CompanyDto.builder()
                .id(company.getId())
                .name(company.getName())
                .build();
    }
}
