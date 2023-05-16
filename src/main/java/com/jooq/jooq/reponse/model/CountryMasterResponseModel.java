package com.jooq.jooq.reponse.model;

public class CountryMasterResponseModel {
	private String Label;
	private Integer Id;

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public CountryMasterResponseModel(String label, Integer id) {
		super();
		Label = label;
		Id = id;
	}

}
