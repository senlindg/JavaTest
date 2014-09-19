/**
 * 
 */
package com.ejb.one2one;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="province")
public class province implements Serializable
{
	private Integer provinceid;
	private String provincename;
	private String provinceman;
	private City city;
	
	@Id
	@GeneratedValue
	public Integer getProvinceid()
	{
		return provinceid;
	}
	public void setProvinceid(Integer provinceid)
	{
		this.provinceid = provinceid;
	}
	public String getProvincename()
	{
		return provincename;
	}
	public void setProvincename(String provincename)
	{
		this.provincename = provincename;
	}
	public String getProvinceman()
	{
		return provinceman;
	}
	public void setProvinceman(String provinceman)
	{
		this.provinceman = provinceman;
	}
	@OneToOne(optional=true,cascade=CascadeType.ALL,mappedBy="province")
	public City getCity()
	{
		return city;
	}
	public void setCity(City city)
	{
		this.city = city;
	}
	
	
	
}
