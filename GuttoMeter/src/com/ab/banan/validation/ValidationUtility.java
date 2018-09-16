package com.ab.banan.validation;

import com.google.gson.JsonElement;

public class ValidationUtility {
	
	private ValidationUtility() {
		// only static helper methods, this class should not be initiated
	}
	
	public static ValidationErrorCode validateJsonElement(JsonElement jsonElemen) {
		return ValidationErrorCode.OK;
	}

}
