package com.vanguard.retail.myprivateequity.webservice.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Fund {

	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
		int fundId;
	  @NotNull
	  String versionId;
	  String status;
	  String funcode,shortname,legalName,fundfamily,fundprogram;

	  @NotBlank
	  String fundType;
	  String fundReportName;
	  @Pattern(regexp = "[A,Z]{3,3}" ,message = "should match pattern :[A,Z]{3,3}")
	  String fundCurrencyCode;
	  private  LocalDateTime formationDateTime;	
	
	
}
