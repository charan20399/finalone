package com.sprint1.fms1.dao;

import java.util.HashMap;
import java.util.List;

import com.sprint1.fms1.model.ScheduleDetails;

public interface ViewDetailsDao {
	
	//public void addDetails ();
 public ScheduleDetails getFlightDetails(long id);
 public List<ScheduleDetails> getFlights();
 //public boolean displayAddDetails(long id);
 //public HashMap<Long,ScheduleDetails> getFlightMap();
}
