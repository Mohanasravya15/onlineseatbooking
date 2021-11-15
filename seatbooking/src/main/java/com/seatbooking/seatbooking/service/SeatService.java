package com.seatbooking.seatbooking.service;

import java.util.List;

import com.seatbooking.seatbooking.entity.Booking;
import com.seatbooking.seatbooking.entity.Seat;


public interface SeatService {
public boolean checkSeatAvailability(int seatNumber, String seatStatus);
public boolean bookSeat(Booking booking);
public boolean cancelSeat(int bookingNumber);
public boolean updateSeat(int bookingNumber,int seatNumber);

}
