package com.GST.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gst_table")
public class GSTEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String hsncode;
	private int taxpercentage;
	public String getHsncode() {
		return hsncode;
	}
	public void setHsncode(String hsncode) {
		this.hsncode = hsncode;
	}
	public int getTaxpercentage() {
		return taxpercentage;
	}
	public void setTaxpercentage(int taxpercentage) {
		this.taxpercentage = taxpercentage;
	}
	

}
