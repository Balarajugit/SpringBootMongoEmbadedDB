package com.app.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	@Id
	private String id;
	private Integer pid;
	private String pcode;
	private Double pcost;
	public Product() {
		super();
	}
	public Product(Integer pid, String pcode, Double pcost) {
		super();
		this.pid = pid;
		this.pcode = pcode;
		this.pcost = pcost;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public Double getPcost() {
		return pcost;
	}
	public void setPcost(Double pcost) {
		this.pcost = pcost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pid=" + pid + ", pcode=" + pcode + ", pcost=" + pcost + "]";
	}

}
