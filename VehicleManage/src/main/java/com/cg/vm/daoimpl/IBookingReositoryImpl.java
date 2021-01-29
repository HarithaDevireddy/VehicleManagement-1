package com.cg.vm.daoimpl;

import java.time.LocalDate;
import java.util.List;

import com.cg.vm.dao.IBookingRepository;
import com.cg.vm.domain.Booking;
import com.cg.vm.domain.Customer;
import com.cg.vm.domain.Vehicle;

public class IBookingReositoryImpl implements IBookingRepository{

	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking cancelBooking(Booking b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking updateBooking(Booking b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking viewBooking(Booking b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewAllBooking(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewAllBookingByDate(LocalDate bookingDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewAllBookingByVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

}
