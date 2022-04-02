package ru.projectx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.projectx.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
