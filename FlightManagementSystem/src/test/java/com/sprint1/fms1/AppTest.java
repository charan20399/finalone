package com.sprint1.fms1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;import java.util.ArrayList;
import java.util.List;

import com.sprint1.fms1.dao.ViewDetailsDao;
import com.sprint1.fms1.dao.ViewDetailsDaoImpl;
import com.sprint1.fms1.model.ScheduleDetails;
import com.sprint1.fms1.service.ViewDetailsService;
import com.sprint1.fms1.service.ViewDetailsServiceImpl;
import com.sprint1.fms1.uitil.InvalidFlightIdException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AppTest 
{   static ViewDetailsDaoImpl view=new ViewDetailsDaoImpl();
    static ViewDetailsService view1= new ViewDetailsServiceImpl();
	 static Map<Long, ScheduleDetails> flightScheduleList=ViewDetailsDaoImpl.flightScheduleList;
	static ScheduleDetails sd1;
  
	@BeforeAll
	public static void ViewDetailsDaoImpl() {
		 sd1=new ScheduleDetails(11213L, "Bangalore", "Chennai", 200, "15:30", "17:30");
		flightScheduleList.put(sd1.getId(), sd1);
		System.out.println("Created");
	}	
	

		@Test
		public void testGetFlightInfo() throws InvalidFlightIdException {
			ScheduleDetails flightdetails=view1.getFlightDetails(11213l);
		assertEquals(sd1 , flightdetails);
		}
		}
