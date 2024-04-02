package com.wep.womenempowerment.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wep.womenempowerment.dao.StepLogDao;
import com.wep.womenempowerment.entities.StepLogin;
import com.wep.womenempowerment.exceptions.WpException;


@Service
public class StepLogServiceImpl implements StepLogService {

	@Autowired
	private StepLogDao dao;

	public ArrayList<StepLogin> getStepLogin() throws WpException {
		return dao.getStepLogin();

	}

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public boolean postStepLoign(StepLogin log) throws WpException {
		
		return dao.postStepLoign(log);
	}
	
	

}
