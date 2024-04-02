package com.wep.womenempowerment.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wep.womenempowerment.dao.FacilityBookingDao;
import com.wep.womenempowerment.entities.FacilityBooking;
import com.wep.womenempowerment.exceptions.WpException;



@Service
public class FacilityBookingServiceImpl implements FacilityBookingService {
	
	@Autowired
	public FacilityBookingDao dao;
	
	public ArrayList<FacilityBooking> getFacilityBooking() throws WpException {
		return dao.getFacilityBooking();
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public boolean postFacilityBooking(FacilityBooking reg) throws WpException {
		
			return dao.postFacilityBooking(reg);
	}

}
