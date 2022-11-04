package com.vanguard.retail.myprivateequity.webservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vanguard.retail.myprivateequity.webservice.models.Fund;

@Repository
public interface FundRepository extends JpaRepository<Fund, Integer> {

}
