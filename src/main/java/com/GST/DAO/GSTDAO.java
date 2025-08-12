package com.GST.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.GST.Entity.GSTEntity;
import com.GST.Repository.GSTRepository;
@Repository
public class GSTDAO {
@Autowired
GSTRepository gr;
	public String postpro(GSTEntity e) {
		// TODO Auto-generated method stub
		gr.save(e);
		return "save succesfully";
	}

	public String postAll(List<GSTEntity> e) {
		// TODO Auto-generated method stub
		gr.saveAll(e);
		return "saved successfully";
	}

	public List<GSTEntity> getall() {
		// TODO Auto-generated method stub
		return gr.findAll();
	}

	public Integer getquery(String a) {
		// TODO Auto-generated method stub
		return gr.getquery(a);
	}


}
