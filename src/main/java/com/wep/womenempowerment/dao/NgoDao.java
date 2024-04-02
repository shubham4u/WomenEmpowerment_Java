package com.wep.womenempowerment.dao;

import java.util.ArrayList;

import com.wep.womenempowerment.entities.Ngo;
import com.wep.womenempowerment.exceptions.WpException;


public interface NgoDao {

	public ArrayList<Ngo> getNgo() throws WpException;
	
}
