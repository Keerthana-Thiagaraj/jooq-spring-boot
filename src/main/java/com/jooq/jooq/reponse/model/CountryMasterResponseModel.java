package com.jooq.jooq.reponse.model;

public class CountryMasterResponseModel {

	private String Label;

	private Integer Id;
	
	private String options[] = { };

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

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public CountryMasterResponseModel(String label, Integer id, String[] options) {
		super();
		Label = label;
		Id = id;
		this.options = options;
	}

	public CountryMasterResponseModel(String label, Integer id) {
		super();
		Label = label;
		Id = id;
	}
	
	

	
}
