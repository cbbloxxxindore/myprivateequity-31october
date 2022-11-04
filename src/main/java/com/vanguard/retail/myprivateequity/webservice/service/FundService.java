package com.vanguard.retail.myprivateequity.webservice.service;

import java.util.List;

import com.vanguard.retail.myprivateequity.webservice.models.Fund;
import com.vanguard.retail.myprivateequity.webservice.models.FundRequest;

public interface FundService {
 Fund saveFund(FundRequest fundRequest);
 Fund updateFund(FundRequest fundRequest, int fundId);
 Fund getFundById(int fundId);
 List<Fund> getAllFund();

}
