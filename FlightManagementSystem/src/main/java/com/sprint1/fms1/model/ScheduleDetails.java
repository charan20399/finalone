package com.sprint1.fms1.model;
public class ScheduleDetails {
	long id;
    String source;
	String destination;
	int seats;
	String arrival;
	String departure;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public float getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
//	public List<ScheduleDetails> getDetails() {
//		return details;
//	}
//	public void setDetails(List<ScheduleDetails> details) {
//		this.details = details;
//	}
	public ScheduleDetails() {
		super();
	}
	public ScheduleDetails(long id, String source, String destination, int seats, String arrival, String departure) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.seats = seats;
		this.arrival = arrival;
		this.departure = departure;
	
	}
	@Override
	public String toString() {
		return "ScheduleDetails for flightid=" + id +" is"+"source=" + source + "destination=" + destination + "seats=" + seats
				+ "arrival=" + arrival + "departure=" + departure +"";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrival == null) ? 0 : arrival.hashCode());
		result = prime * result + ((departure == null) ? 0 : departure.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		//result = prime * result + ((details == null) ? 0 : details.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + Float.floatToIntBits(seats);
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScheduleDetails other = (ScheduleDetails) obj;
		if (arrival == null) {
			if (other.arrival != null)
				return false;
		} else if (!arrival.equals(other.arrival))
			return false;
		if (departure == null) {
			if (other.departure != null)
				return false;
		} else if (!departure.equals(other.departure))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (id != other.id)
			return false;
		if (Float.floatToIntBits(seats) != Float.floatToIntBits(other.seats))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		return true;
	}
//	public void displayAddDetails() {
//		System.out.print(=======================================);
//		
//	}


}
