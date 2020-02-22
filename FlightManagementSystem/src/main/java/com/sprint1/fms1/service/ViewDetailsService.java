package com.sprint1.fms1.service;

import java.util.HashMap;
import java.util.List;

import com.sprint1.fms1.model.ScheduleDetails;
import com.sprint1.fms1.uitil.InvalidFlightIdException;

public interface ViewDetailsService {
	
	public ScheduleDetails getFlightDetails(long id) throws InvalidFlightIdException;
	public List<ScheduleDetails> getFlights();
//	public void addDetails ();
//	public HashMap<Long,ScheduleDetails> getFlightMap();
}
