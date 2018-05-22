package com.tuacy.databindingdev.simple;

public class DataImportEntity {

	private String  name;
	private boolean visible;

	public DataImportEntity(String name, boolean visible) {
		this.name = name;
		this.visible = visible;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
