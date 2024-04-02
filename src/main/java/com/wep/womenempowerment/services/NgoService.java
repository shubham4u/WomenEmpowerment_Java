package com.wep.womenempowerment.services;

import java.util.ArrayList;

import com.wep.womenempowerment.entities.Ngo;
import com.wep.womenempowerment.exceptions.WpException;


public interface NgoService {

		public ArrayList<Ngo> getNgo() throws WpException;
}
