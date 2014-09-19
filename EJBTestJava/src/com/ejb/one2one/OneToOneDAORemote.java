package com.ejb.one2one;

import javax.ejb.Remote;

@Remote
public interface OneToOneDAORemote {
	public void insert(String provincename,String provinceman,String cityname,String cityman);
	public province select(Integer provinceid);
	public void update(Integer provinceid,String provincename,String provinceman,String cityname,String cityman);
	public void delete(Integer provinceid);
}
