package com.sprint1.fms1.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.sprint1.fms1.model.ScheduleDetails;

public class ViewDetailsDaoImpl implements ViewDetailsDao {
	
	public static Map<Long, ScheduleDetails> flightScheduleList=new HashMap<>();
	static List<ScheduleDetails> f= new ArrayList<ScheduleDetails>();
	//To get the id based flight schedule details.
	 public ViewDetailsDaoImpl() {
		ScheduleDetails sd1=new ScheduleDetails(11213L, "Bangalore", "Chennai", 200, "15:30", "17:30");	
		ScheduleDetails sd2=new ScheduleDetails(11256L, "Hyderabad", "Delhi", 300, "11:30", "12:30");
		ScheduleDetails sd3=new ScheduleDetails(15262L, "kolkata", "Delhi", 250, "10:30", "11:30");
		ScheduleDetails sd4=new ScheduleDetails(11251L, "america", "Delhi", 450, "9:50", "10:30");
		ScheduleDetails sd5=new ScheduleDetails(11255L, "dubai", "Delhi", 433, "10:30", "11:00");
//		ScheduleDetails sd1=new ScheduleDetails(11213L, "Bangalore", "Chennai", 200, LocalTime.now().plusHours(1), LocalTime.now().plusHours(1).plusMinutes(20));	

		flightScheduleList.put(sd1.getId(), sd1);
		flightScheduleList.put(sd2.getId(), sd2);
		flightScheduleList.put(sd3.getId(), sd3);
		flightScheduleList.put(sd4.getId(), sd4);
		flightScheduleList.put(sd5.getId(), sd5);
	}
	@Override
	public ScheduleDetails getFlightDetails(long id) {
		ScheduleDetails s=flightScheduleList.get(id);
		
		return s;
		}

	@Override
	public List<ScheduleDetails> getFlights() {
//		List<ScheduleDetails> f= new ArrayList<ScheduleDetails>();
		for(Long sd:flightScheduleList.keySet())
		{	
				f.add(flightScheduleList.get(sd));
		}
		return f;
	}
}
//	@Override
//	public boolean displayAddDetails(long id) {
//		if(!flightScheduleList.containsKey(id)) {
//			return false;
//		}
//		ScheduleDetails sd=flightScheduleList.get(id);
//		sd.setId(id);
//		sd.getSource();
//		sd.getDestination();
//		sd.getSeats();
//		sd.getArrival();
//		sd.getDeparture();
//		sd.getDeparture();
//		sd.setId(id);
//		sd.setSource(source);
		
//		ScheduleDetails sd=new ScheduleDetails();
//		System.out.println("=======================");
//		System.out.println("enter flight id :"+sd.getId());
//		System.out.println("enter source of the flight :"+sd.getSource());
//		System.out.println("enter destination of the flight :"+sd.getDestination());
//		System.out.println("enter number of seates :"+sd.getSeats());
//		System.out.println("enter arrival time :"+sd.getArrival());
//		System.out.println("enter departure time :"+sd.getDeparture());
//		return displayAddDetails();
//	}
//	} 
//	

	
	
	
	
	
//	public void ViewDetailsDaoImpl(){
//		
//		ScheduleDetails sd1=new ScheduleDetails(11213L, "Bangalore", "Chennai", 200, "15:30", "17:30");	
//		ScheduleDetails sd2=new ScheduleDetails(11256L, "Hyderabad", "Delhi", 300, "11:30", "12:30");
//		ScheduleDetails sd3=new ScheduleDetails(15262L, "kolkata", "Delhi", 250, "10:30", "11:30");
//		ScheduleDetails sd4=new ScheduleDetails(11251L, "america", "Delhi", 450, "9:50", "10:30");
//		ScheduleDetails sd5=new ScheduleDetails(11255L, "dubai", "Delhi", 433, "10:30", "11:00");
//		flightScheduleList.put(sd1.getId(), sd1);
//		flightScheduleList.put(sd2.getId(), sd2);
//		flightScheduleList.put(sd3.getId(), sd3);
//		flightScheduleList.put(sd4.getId(), sd4);
//		flightScheduleList.put(sd5.getId(), sd5);
//		
//	}
//	public ScheduleDetails getFlightDetails(long id) {
//		ScheduleDetails s=flightScheduleList.get(id);
//		return s;	
//	}
//	public HashMap<Long,ScheduleDetails> getFlightMap() {
//		return (HashMap<Long, ScheduleDetails>) flightScheduleList;
//	}
//	
//	@Override
//	//To get the list all listed flights.
//	public List<ScheduleDetails> getFlights() {
//		List<ScheduleDetails> f= new ArrayList<ScheduleDetails>();
//		for(Long sd:flightScheduleList.keySet())
//		{	
//				f.add(flightScheduleList.get(sd));
//		}
//		return f;
//	}


