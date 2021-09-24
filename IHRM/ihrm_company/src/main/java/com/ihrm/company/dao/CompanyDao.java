package com.ihrm.company.dao;

import com.ihrm.domain.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *  JpaRepository<实体类，主键>
 *  JpaSpecificationExecutor<实体类>
 */
public interface CompanyDao extends JpaRepository<Company,String> , JpaSpecificationExecutor<Company> {
}
