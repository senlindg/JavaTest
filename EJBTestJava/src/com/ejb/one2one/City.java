/**
 * 
 */
package com.ejb.one2one;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */

@SuppressWarnings("serial")
@Entity
@Table(name="city")
public class City implements Serializable
{
	private Integer cityid;
	private String cityname;
	private String cityman;
	private province province;
	
	@Id
	@GeneratedValue
	public Integer getCityid()
	{
		return cityid;
	}
	public void setCityid(Integer cityid)
	{
		this.cityid = cityid;
	}
	public String getCityname()
	{
		return cityname;
	}
	public void setCityname(String cityname)
	{
		this.cityname = cityname;
	}
	public String getCityman()
	{
		return cityman;
	}
	public void setCityman(String cityman)
	{
		this.cityman = cityman;
	}
	
	@OneToOne(optional=false,cascade=CascadeType.ALL)
	@JoinColumn(name="provinceid",referencedColumnName="provinceid",unique =true)
	public province getProvince()
	{
		return province;
	}
	public void setProvince(province province)
	{
		this.province = province;
	}
	
	
}
