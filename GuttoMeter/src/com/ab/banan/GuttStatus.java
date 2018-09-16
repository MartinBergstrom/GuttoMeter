package com.ab.banan;

import java.time.LocalDateTime;

public class GuttStatus {
	
	private String name;
	private LocalDateTime date;
    private int guttValue;
    
	public GuttStatus(String name, LocalDateTime date, int guttValue) {
		if (guttValue < 0 || guttValue > 100) {
			throw new IllegalArgumentException("GuttValue can't be negative or higher than 100");
		}
		this.name = name;
		this.date = date;
		this.guttValue = guttValue;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public int getGuttValue() {
		return guttValue;
	}

}
