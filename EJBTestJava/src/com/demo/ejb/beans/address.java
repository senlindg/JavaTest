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
@Table(name="address")
public class address implements Serializable
{
	private Integer id;
	private String company;
	private String postcode;
	private String name;
	private String username;
	private String qq;
	private String email;
	private String mobile;
	private String address;
	private String sex;
	private static final long serialVersionUID=1L;
	
	public address()
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

	public String getCompany()
	{
		return company;
	}

	public void setCompany(String company)
	{
		this.company = company;
	}

	public String getPostcode()
	{
		return postcode;
	}

	public void setPostcode(String postcode)
	{
		this.postcode = postcode;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getQq()
	{
		return qq;
	}

	public void setQq(String qq)
	{
		this.qq = qq;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getMobile()
	{
		return mobile;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getSex()
	{
		return sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}
	
	
}
