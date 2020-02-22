package com.sprint1.fms1.service;

import java.util.HashMap;
import java.util.List;

import com.sprint1.fms1.dao.ViewDetailsDao;
import com.sprint1.fms1.dao.ViewDetailsDaoImpl;
import com.sprint1.fms1.model.ScheduleDetails;
import com.sprint1.fms1.uitil.InvalidFlightIdException;

public class ViewDetailsServiceImpl implements ViewDetailsService {
	ViewDetailsDao view=new ViewDetailsDaoImpl();
	@Override
	public ScheduleDetails getFlightDetails(long id)  throws InvalidFlightIdException{
		if(view.getFlightDetails(id)==null) {
			throw new InvalidFlightIdException("Entered flight id "+id+" is not valid one.");
		}
		return view.getFlightDetails(id);
	}
	@Override
	public List<ScheduleDetails> getFlights() {
		
		return view.getFlights();
	}
	
//	public void addDetails () {
//		view.addDetails();
//	}
//	
//	public HashMap<Long,ScheduleDetails> getFlightMap(){
//		return view.getFlightMap();
//	}

}
