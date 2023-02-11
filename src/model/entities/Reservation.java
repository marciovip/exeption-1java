package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date Checkin;
	private Date Checkout;
	
	public Reservation(){
		
	}
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		
		
		this.roomNumber = roomNumber;
		Checkin = checkin;
		Checkout = checkout;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckin() {
		return Checkin;
	}
	
	public Date getCheckout() {
		return Checkout;
	}
	public long duration() {
		long diff = Checkout.getTime() - Checkin.getTime();
	return	TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	
	}
	public void UpdateDate(Date checkin, Date checkOut) {
		this.Checkin = Checkin;
		this.Checkout = checkOut;
	}
	@Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(Checkin)
			+ ", check-out: "
			+ sdf.format(Checkout)
			+ ", "
			+ duration()
			+ " nights";
	

}
}