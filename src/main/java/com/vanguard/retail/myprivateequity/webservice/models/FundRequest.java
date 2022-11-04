package com.vanguard.retail.myprivateequity.webservice.models;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//import com.vanguard.retail.privateequity10.webservice1.models.FundStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class FundRequest {
	
	@NotBlank
	int fundId;
String funcode,shortname,legalName,fundfamily,fundprogram;

@NotBlank
String fundType;
String fundReportName;
//private FundStatus fundStatus ;
//@Pattern(regexp = "[A,Z]{3,3}" ,message = "should match pattern :[A,Z]{3,3}")
String fundCurrencyCode;
}
