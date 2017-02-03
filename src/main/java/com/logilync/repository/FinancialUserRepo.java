package com.logilync.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logilync.domain.FinancialUser;

public interface FinancialUserRepo extends JpaRepository<FinancialUser,Long> {

}
