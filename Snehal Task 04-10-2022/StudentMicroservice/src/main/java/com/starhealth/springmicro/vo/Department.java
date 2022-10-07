package com.starhealth.springmicro.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Department { //pojo or vo class

	private Long  departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;

}
