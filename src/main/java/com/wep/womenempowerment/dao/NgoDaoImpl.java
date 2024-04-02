package com.wep.womenempowerment.dao;

import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Repository;

import com.wep.womenempowerment.entities.Ngo;
import com.wep.womenempowerment.exceptions.WpException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;




@Repository
public class NgoDaoImpl implements NgoDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public ArrayList<Ngo> getNgo() throws WpException {
		String strQry= "from Ngo";
		Query qry=manager.createQuery(strQry);
		List<Ngo> list=qry.getResultList();
		System.out.println("list"+list);
		return (ArrayList<Ngo>) list;		
	}

	
}
