package com.wep.womenempowerment.services;

import java.util.ArrayList;

import com.wep.womenempowerment.entities.FacilityBooking;
import com.wep.womenempowerment.exceptions.WpException;


public interface FacilityBookingService {
	public ArrayList<FacilityBooking> getFacilityBooking() throws WpException;
	public boolean postFacilityBooking(FacilityBooking reg) throws WpException;
}

