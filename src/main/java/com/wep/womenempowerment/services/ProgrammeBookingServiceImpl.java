package com.wep.womenempowerment.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wep.womenempowerment.dao.ProgrammeBookingDao;
import com.wep.womenempowerment.entities.ProgrammeBooking;
import com.wep.womenempowerment.exceptions.WpException;



@Service
public class ProgrammeBookingServiceImpl implements ProgrammeBookingService  {

	@Autowired
	public ProgrammeBookingDao dao;
	
	public ArrayList<ProgrammeBooking> getProgrammeBooking() throws WpException {
		return dao.getProgrammeBooking();
		
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public boolean postProgrammeBooking(ProgrammeBooking reg) throws WpException {
		
			return dao.postProgrammeBooking(reg);
	}

	

}
