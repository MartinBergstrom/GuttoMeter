package com.ab.banan;


public interface DaoConnection {
	
	// save to database
	public GuttStatus saveNewGuttStatus(GuttStatus status);
	
	// get all statuses 
	public GuttStatus getAll();
	
	// get from database with id
	public GuttStatus getForId(String id);
	
	public GuttStatus getAllForId(String id);

}
