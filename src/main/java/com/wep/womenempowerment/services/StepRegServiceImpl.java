package com.wep.womenempowerment.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wep.womenempowerment.dao.StepRegDao;
import com.wep.womenempowerment.entities.StepRegister;
import com.wep.womenempowerment.exceptions.WpException;


@Service
public class StepRegServiceImpl implements StepRegService {

	@Autowired
	public StepRegDao dao;
	
	public ArrayList<StepRegister> getStepRegister() throws WpException {
		return dao.getStepRegister();
	}

	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public boolean postStepRegister(StepRegister reg) throws WpException {
		
		return dao.postStepRegister(reg);
	}

}
