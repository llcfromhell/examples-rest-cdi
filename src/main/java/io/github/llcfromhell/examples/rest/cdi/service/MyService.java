package io.github.llcfromhell.examples.rest.cdi.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import io.github.llcfromhell.examples.rest.cdi.dao.MyDao;


@Stateless
public class MyService {

	@Inject
	MyDao myDao;
	
	String prvtAttr = "hellyeah";

	public String getPrvtAttr() {
		return prvtAttr + " " + myDao.getPrvtAttr();
	}

	public void setPrvtAttr(String prvtAttr) {
		this.prvtAttr = prvtAttr;
	}
	
}