package com.ab.banan.validation;

public enum ValidationErrorCode {
	OK("Ok"),
	INVALID_GUTT_STATUS("Gutt value can only be in the range [0, 100]"),
	;
	
	public String information;
	
	ValidationErrorCode(String info) {
		this.information = info;
	}
}
