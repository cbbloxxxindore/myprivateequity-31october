package com.vanguard.retail.myprivateequity.webservice.resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vanguard.retail.myprivateequity.webservice.models.Fund;
import com.vanguard.retail.myprivateequity.webservice.models.FundRequest;
import com.vanguard.retail.myprivateequity.webservice.service.FundService;

@RestController
public class FundResource {
	public  static final String  CLASS_NAME= FundResource.class.getName()  ; 
	private static final Logger log = LoggerFactory.getLogger(FundResource.class);
	private static final String SAVE_METHOD = "createInvestor";
	private static final String EXCEPTION = " Exception occurred while saving Investor";
@Autowired
	FundService fundService;
	@PostMapping("/funds")
	public ResponseEntity<Fund> createFund(@RequestBody FundRequest fundRequest  )
	{
		Fund fund=fundService.saveFund(fundRequest);
		return ResponseEntity.ok(fund);
	}
	@PutMapping("/funds/{fundId}")
	public ResponseEntity<Fund> updateFund(@RequestBody FundRequest fundRequest,@PathVariable int fundId )
	{
		Fund fund=fundService.updateFund(fundRequest,fundId);
		return ResponseEntity.ok(fund);
		
	}
	
	
	@GetMapping("/funds")
	public ResponseEntity<List<Fund>> getAllFund( )
	{
		List<Fund> funds =fundService.getAllFund();
		return ResponseEntity.ok( funds);
		
	}
	@GetMapping("/funds/{fundId}")
	public ResponseEntity<Fund> geFundById(@PathVariable int fundId )
	{
		Fund fund=	fundService.getFundById(fundId);
		return ResponseEntity.ok(fund);
	}
}
