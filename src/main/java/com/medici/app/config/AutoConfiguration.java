package com.medici.app.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.medici.app.entity.Company;
import com.medici.app.repository.CompanyRepository;

@Configuration
@EntityScan(basePackageClasses = { Company.class })
@EnableJpaRepositories(basePackageClasses = { CompanyRepository.class })
@EnableAutoConfiguration
public class AutoConfiguration {

}
