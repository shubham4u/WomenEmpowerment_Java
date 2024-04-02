package com.wep.womenempowerment.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wep.womenempowerment.entities.FacilityBooking;
import com.wep.womenempowerment.exceptions.WpException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;



@Repository
public class FacilityBookingDaoImpl implements FacilityBookingDao{

	@PersistenceContext
	private EntityManager manager;

	public ArrayList<FacilityBooking> getFacilityBooking() throws WpException {
		String strQry = "from FacilityBooking";
		Query qry = manager.createQuery(strQry);
		List<FacilityBooking> list = qry.getResultList();
		return (ArrayList<FacilityBooking>) list;
	}

	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean postFacilityBooking(FacilityBooking reg) throws WpException {
		
		manager.persist(reg);
		return true;

	}

	
	

	
}
