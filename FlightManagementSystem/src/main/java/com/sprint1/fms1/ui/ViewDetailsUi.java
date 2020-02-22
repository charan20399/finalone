package com.sprint1.fms1.ui;
import java.util.Scanner;
import com.sprint1.fms1.model.ScheduleDetails;
import com.sprint1.fms1.service.ViewDetailsService;
import com.sprint1.fms1.service.ViewDetailsServiceImpl;
import com.sprint1.fms1.uitil.InvalidFlightIdException;

public class ViewDetailsUi {
							static ViewDetailsService view1= new ViewDetailsServiceImpl();
							static Scanner a=new Scanner(System.in);
public static void main(String[] args) {
	for(;;) {
	    	System.out.println("Enter your choice : ");
	    	System.out.println("1 - Flight details");
	    	System.out.println("2 - All flights");
	    	System.out.println("3 - Exit");
	    	int choice;
	    	choice=a.nextInt();
	    	switch (choice) {
	    	case 1:
	    		System.out.println("Enter the regestered flight id :");
	    		long id=a.nextLong();
	    		try {
					System.out.println(view1.getFlightDetails(id));
				} catch (InvalidFlightIdException e) {
					System.out.println("Error : "+e.getMessage());
					
				}
	    		break;
	    	case 2:
	    		System.out.println("List of All Flights :");
	    		for(ScheduleDetails sd:view1.getFlights()) {
	    			System.out.println(sd);
	    		}
	    		break;
	    	case 3:
	    		System.out.println("exit successful");
	    		System.exit(0);
	    		break;
	    	default:
	    		System.out.println("Invalid Choice");
	    		break;
		}
		}
		

	}

}
