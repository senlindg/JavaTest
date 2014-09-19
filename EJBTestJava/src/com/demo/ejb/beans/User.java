/**
 * 
 */
package com.demo.ejb.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name="user")
public class User implements Serializable
{
	private Integer id;
	private String password;
	private String email;
	private String username;
	private static final long serialVersionUID=1L;
	
	public User()
	{
		super();
	}
	
	@Id
	@GeneratedValue
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	
}
