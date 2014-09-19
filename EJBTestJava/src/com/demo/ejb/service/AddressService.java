package com.demo.ejb.service;

import javax.ejb.Remote;
import javax.print.attribute.standard.PageRanges;

import com.demo.ejb.beans.address;
import com.demo.ejb.util.Pager;

@Remote
public interface AddressService {
	public Pager list(String username,int pageSize,int pageNo);
	
	public address select(Integer id);
	
	public Integer insert(address record);
	
	public boolean update(address record);
	
	public boolean delete(Integer id);
}
