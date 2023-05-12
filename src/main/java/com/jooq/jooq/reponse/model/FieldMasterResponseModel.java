package com.jooq.jooq.reponse.model;

import java.util.List;

public class FieldMasterResponseModel {

	private Integer tadId;
	private String tabLabel;
	private List<TabForm> forms;
	public Integer getTadId() {
		return tadId;
	}
	public void setTadId(Integer tadId) {
		this.tadId = tadId;
	}
	public String getTabLabel() {
		return tabLabel;
	}
	public void setTabLabel(String tabLabel) {
		this.tabLabel = tabLabel;
	}
	public List<TabForm> getForms() {
		return forms;
	}
	public void setForms(List<TabForm> forms) {
		this.forms = forms;
	}
	public FieldMasterResponseModel(Integer tadId, String tabLabel) {
		super();
		this.tadId = tadId;
		this.tabLabel = tabLabel;
	}
	public FieldMasterResponseModel(Integer tadId, String tabLabel, List<TabForm> forms) {
		super();
		this.tadId = tadId;
		this.tabLabel = tabLabel;
		this.forms = forms;
	}
	
}
