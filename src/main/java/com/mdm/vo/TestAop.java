package com.mdm.vo;

import com.configration.annotation.MDM;

public class TestAop {
	@MDM(routeKey="city")
	public String cityCode;
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}
