package com.vanguard.retail.myprivateequity.webservice.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanguard.retail.myprivateequity.webservice.dao.FundRepository;
import com.vanguard.retail.myprivateequity.webservice.models.Fund;
import com.vanguard.retail.myprivateequity.webservice.models.FundRequest;
@Service
public class FundServiceImpl implements FundService {

	

	@Autowired
	FundRepository fundRepository;
	public Fund saveFund(FundRequest fundRequest) {
		try {
			Fund fund= getFund( fundRequest);
			fund=fundRepository.save(fund);
			return fund;
		} catch (Exception e) {
			throw (new NullPointerException());
		}
		
	}

	
	public Fund updateFund(FundRequest fundRequest,int fundId) {
		Fund fund= getFund1( fundRequest,fundId);
		fund=fundRepository.save(fund);
		return fund;
	}

	
	public Fund getFundById(int fundId) {
		Optional<Fund> optional=fundRepository.findById(fundId);
		Fund fund=	optional.get();
		return fund;
	}

	
	public List<Fund> getAllFund() {
		return fundRepository.findAll();
		
	}

	Fund getFund(FundRequest fundRequest)
	{
		Fund fund = new Fund();
		fund.setFormationDateTime(LocalDateTime.now());
		fund.setFundType(fundRequest.getFundType());
		fund.setFuncode(fundRequest.getFuncode());
		fund.setFundCurrencyCode(fundRequest.getFundCurrencyCode());
		fund.setFundfamily(fundRequest.getFundfamily());
		fund.setFundprogram(fundRequest.getFundprogram());
		fund.setFundReportName(fundRequest.getFundReportName());
		//fund.setFundStatus(fundRequest.getFundStatus().ACTIVE);
		fund.setFundId(fundRequest.getFundId());
		fund.setLegalName(fundRequest.getLegalName());
		fund.setShortname(fundRequest.getShortname());
		fund.setVersionId("V1");
		return fund;
	}
	
	Fund getFund1(FundRequest fundRequest,int fundId)
	{
		Fund fund = new Fund();
		fund.setFormationDateTime(LocalDateTime.now());
		fund.setFundType(fundRequest.getFundType());
		fund.setFuncode(fundRequest.getFuncode());
		fund.setFundCurrencyCode(fundRequest.getFundCurrencyCode());
		fund.setFundfamily(fundRequest.getFundfamily());
		fund.setFundprogram(fundRequest.getFundprogram());
		fund.setFundReportName(fundRequest.getFundReportName());
		//fund.setFundStatus(fundRequest.getFundStatus().ACTIVE);
		fund.setFundId(fundId);
		fund.setLegalName(fundRequest.getLegalName());
		fund.setShortname(fundRequest.getShortname());
		fund.setVersionId("V1");
		return fund;
	}
}
