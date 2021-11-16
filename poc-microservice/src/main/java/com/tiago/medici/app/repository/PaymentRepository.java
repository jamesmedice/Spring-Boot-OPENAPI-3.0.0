package com.tiago.medici.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tiago.medici.app.entity.Payment;

@Repository
public interface PaymentRepository extends PagingAndSortingRepository<Payment, Long> {

}
