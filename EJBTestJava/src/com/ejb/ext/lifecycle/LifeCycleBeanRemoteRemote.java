package com.ejb.ext.lifecycle;

import javax.ejb.Remote;

@Remote
public interface LifeCycleBeanRemoteRemote {
	public String sayHello(String world);
}
