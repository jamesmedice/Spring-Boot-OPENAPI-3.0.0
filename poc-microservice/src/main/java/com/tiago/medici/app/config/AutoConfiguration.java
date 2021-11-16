package com.tiago.medici.app.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.tiago.medici.app.entity.Payment;
import com.tiago.medici.app.repository.PaymentRepository;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackageClasses = { Payment.class })
@EnableJpaRepositories(basePackageClasses = { PaymentRepository.class })
public class AutoConfiguration {

}
