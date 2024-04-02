package com.wep.womenempowerment.dao;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wep.womenempowerment.entities.StepLogin;
import com.wep.womenempowerment.exceptions.WpException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;


@Repository
public class StepLogDaoImpl implements StepLogDao {

	@PersistenceContext
	private EntityManager manager;


	public ArrayList<StepLogin> getStepLogin() throws WpException {
		String strQry = "from StepLogin";
		Query qry = manager.createQuery(strQry);
		List<StepLogin> list = qry.getResultList();
		return (ArrayList<StepLogin>) list;
	}


	@Transactional(propagation=Propagation.REQUIRED)
	public boolean postStepLoign(StepLogin log) throws WpException {
		manager.persist(log);
		return true;
	}
	
	

}
