package com.wep.womenempowerment.dao;

import java.util.ArrayList;

import com.wep.womenempowerment.entities.StepRegister;
import com.wep.womenempowerment.exceptions.WpException;



public interface StepRegDao {

	public ArrayList<StepRegister> getStepRegister() throws WpException;
	
	public boolean postStepRegister(StepRegister reg) throws WpException;
}
