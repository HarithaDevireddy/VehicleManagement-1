package com.cg.vm.serviceimpl;

import java.time.LocalDate;
import java.util.List;

import com.cg.vm.domain.Booking;
import com.cg.vm.domain.Payment;
import com.cg.vm.domain.Vehicle;
import com.cg.vm.service.IPaymentService;

public class IPaymentServiceImpl implements IPaymentService {

	@Override
	public Booking addPayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking cancelPayment(Payment p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking viewPayment(Booking b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewAllPayments(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateMonthlyRevenue(LocalDate d1, LocalDate d2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateTotalPayment(Vehicle v) {
		// TODO Auto-generated method stub
		return 0;
	}

}
