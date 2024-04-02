package com.wep.womenempowerment.dao;


import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wep.womenempowerment.entities.ProgrammeBooking;
import com.wep.womenempowerment.exceptions.WpException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;




@Repository
public class ProgrammeBookingDaoImpl implements ProgrammeBookingDao {
	
	@PersistenceContext
	private EntityManager manager;

	public ArrayList<ProgrammeBooking> getProgrammeBooking() throws WpException {
		String strQry = "from ProgrammeBooking";
		Query qry = manager.createQuery(strQry);
		List<ProgrammeBooking> list = qry.getResultList();
		return (ArrayList<ProgrammeBooking>) list;
		
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean postProgrammeBooking(ProgrammeBooking reg) throws WpException {
		
		manager.persist(reg);
		return true;

	
	}
}
