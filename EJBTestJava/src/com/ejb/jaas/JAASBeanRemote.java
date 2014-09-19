package com.ejb.jaas;

import javax.ejb.Remote;

@Remote
public interface JAASBeanRemote {
	public String init();
	
	public String insertOrUpdateOrDelete();
	
	public String view();
	
	public String open();
}
