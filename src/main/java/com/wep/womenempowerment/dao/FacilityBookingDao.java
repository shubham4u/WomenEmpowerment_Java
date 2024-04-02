package com.wep.womenempowerment.dao;

import java.util.ArrayList;

import com.wep.womenempowerment.entities.FacilityBooking;
import com.wep.womenempowerment.exceptions.WpException;


public interface FacilityBookingDao {

	public ArrayList<FacilityBooking> getFacilityBooking() throws WpException;
	public boolean postFacilityBooking(FacilityBooking reg) throws WpException;
}
