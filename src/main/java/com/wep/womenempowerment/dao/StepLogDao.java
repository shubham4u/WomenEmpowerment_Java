package com.wep.womenempowerment.dao;

import java.util.ArrayList;

import com.wep.womenempowerment.entities.StepLogin;
import com.wep.womenempowerment.exceptions.WpException;


public interface StepLogDao {
	
	public ArrayList<StepLogin> getStepLogin() throws WpException;
	
	public boolean postStepLoign(StepLogin log) throws WpException;
}
