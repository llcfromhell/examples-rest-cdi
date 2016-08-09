package io.github.llcfromhell.examples.rest.cdi.dao;

import javax.ejb.Stateless;

@Stateless
public class MyDao {

	String prvtAttr = "bitch!";

	public String getPrvtAttr() {
		return prvtAttr;
	}

	public void setPrvtAttr(String prvtAttr) {
		this.prvtAttr = prvtAttr;
	}
	
}
