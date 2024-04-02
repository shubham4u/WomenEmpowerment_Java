package com.wep.womenempowerment.dao;

import java.util.ArrayList;

import com.wep.womenempowerment.entities.ProgrammeBooking;
import com.wep.womenempowerment.exceptions.WpException;


public interface ProgrammeBookingDao {

	public ArrayList<ProgrammeBooking> getProgrammeBooking() throws WpException;
	public boolean postProgrammeBooking(ProgrammeBooking reg) throws WpException;
}
