package com.wep.womenempowerment.dao;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wep.womenempowerment.entities.StepRegister;
import com.wep.womenempowerment.exceptions.WpException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;



@Repository
public class StepRegDaoImpl implements StepRegDao {

	@PersistenceContext
	private EntityManager manager;
	
	public ArrayList<StepRegister> getStepRegister() throws WpException {
		String strQry = "from StepRegister";
		Query qry = manager.createQuery(strQry);
		List<StepRegister> list = qry.getResultList();
		return (ArrayList<StepRegister>) list;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)

	public boolean postStepRegister(StepRegister reg) throws WpException {
		manager.persist(reg);
		return true;
	}

	


}
