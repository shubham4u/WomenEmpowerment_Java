package com.wep.womenempowerment.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wep.womenempowerment.dao.NgoDao;
import com.wep.womenempowerment.entities.Ngo;
import com.wep.womenempowerment.exceptions.WpException;



@Service
public class NgoServiceImpl implements NgoService {
	
	@Autowired
	public NgoDao dao;
	
	public ArrayList<Ngo> getNgo() throws WpException {
		
		return dao.getNgo();
	}
}
