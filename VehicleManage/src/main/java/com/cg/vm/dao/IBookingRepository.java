package com.cg.vm.dao;

import java.time.LocalDate;
import java.util.List;

import com.cg.vm.domain.*;

public interface IBookingRepository {

	public Booking addBooking(Booking booking);
	public Booking cancelBooking(Booking b);
	public Booking updateBooking(Booking b);
	public Booking viewBooking(Booking b);
	public List<Booking> viewAllBooking(Customer customer);
	public List<Booking> viewAllBookingByDate
	(LocalDate bookingDate);
	public List<Booking> viewAllBookingByVehicle(Vehicle vehicle);

}
