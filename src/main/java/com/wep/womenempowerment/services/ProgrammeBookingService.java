package com.wep.womenempowerment.services;

import java.util.ArrayList;

import com.wep.womenempowerment.entities.ProgrammeBooking;
import com.wep.womenempowerment.exceptions.WpException;




public interface ProgrammeBookingService {

	public ArrayList<ProgrammeBooking> getProgrammeBooking() throws WpException;
	public boolean postProgrammeBooking(ProgrammeBooking reg) throws WpException;
}
