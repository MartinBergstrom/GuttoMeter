package com.ab.banan;

import java.time.LocalDateTime;

public class GuttStatus {
	
	private String name;
	private LocalDateTime date;
    private int guttValue;
    
	public GuttStatus(String name, LocalDateTime date, int guttValue) {
		super();
		this.name = name;
		this.date = date;
		this.guttValue = guttValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public int getGuttValue() {
		return guttValue;
	}

	public void setGuttValue(int guttValue) {
		this.guttValue = guttValue;
	}

}
