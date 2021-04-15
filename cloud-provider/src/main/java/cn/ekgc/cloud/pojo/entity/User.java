package cn.ekgc.cloud.pojo.entity;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 341143335680013516L;
	private String name;
	private String cellphone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
}
