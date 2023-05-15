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

	public void setId(Integer Id) {

		this.Id = Id;

	}

	public CountryMasterResponseModel(String label, Integer Id) {

		super();

		Label = label;

		this.Id = Id;

	}

}
