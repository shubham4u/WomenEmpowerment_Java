package com.wep.womenempowerment.services;

import java.util.ArrayList;

import com.wep.womenempowerment.entities.StepRegister;
import com.wep.womenempowerment.exceptions.WpException;


public interface StepRegService {

	public ArrayList<StepRegister> getStepRegister() throws WpException;
	
	public boolean postStepRegister(StepRegister reg) throws WpException;
}
