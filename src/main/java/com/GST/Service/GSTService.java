package com.GST.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GST.DAO.GSTDAO;
import com.GST.Entity.GSTEntity;
@Service
public class GSTService {
@Autowired
GSTDAO gd;
	public String postpro(GSTEntity e) {
		// TODO Auto-generated method stub
		return gd.postpro(e);
	}

	public String postAll(List<GSTEntity> e) {
		// TODO Auto-generated method stub
		return gd.postAll(e);
	}

	public List<GSTEntity> getall() {
		// TODO Auto-generated method stub
		return gd.getall();
	}

	public Integer getquery(String a) {
		// TODO Auto-generated method stub
		return gd.getquery(a);
	}

}
