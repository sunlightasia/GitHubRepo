package model;

import java.io.Serializable;

public class Property implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5329762589702478784L;

	private Integer id;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
