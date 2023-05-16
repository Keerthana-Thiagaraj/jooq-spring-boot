package com.jooq.jooq.reponse.model;

import java.util.ArrayList;
import java.util.List;

public class TabForm {
private String label;
private String name;
private String value;
private String type;
private Integer tabId;
private String tabLabel;
private Integer sNo;
private List<TabFormValidator> validations;
private List<FieldOptions> options=new ArrayList<FieldOptions>();

public String getLabel() {
	return label;
}
public void setLabel(String label) {
	this.label = label;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Integer getTabId() {
	return tabId;
}
public void setTabId(Integer tabId) {
	this.tabId = tabId;
}
public String getTabLabel() {
	return tabLabel;
}
public void setTabLabel(String tabLabel) {
	this.tabLabel = tabLabel;
}

public List<TabFormValidator> getValidations() {
	return validations;
}
public void setValidations(List<TabFormValidator> validations) {
	this.validations = validations;
}
public TabForm(String label, String name, String value, String type, Integer tabId, String tabLabel,Integer sNo) {
	super();
	this.label = label;
	this.name = name;
	this.value = value;
	this.type = type;
	this.tabId = tabId;
	this.tabLabel = tabLabel;
	this.sNo=sNo;
}
public TabForm(String label, String name, String value, String type, Integer tabId, String tabLabel,
		Integer sNo,List<TabFormValidator> validations) {
	super();
	this.label = label;
	this.name = name;
	this.value = value;
	this.type = type;
	this.tabId = tabId;
	this.tabLabel = tabLabel;
	this.sNo=sNo;
	this.validations = validations;
}


public TabForm(String label, String name, String value, String type, Integer tabId, String tabLabel,
		Integer sNo,List<TabFormValidator> validations,List<FieldOptions> options) {
	super();
	this.label = label;
	this.name = name;
	this.value = value;
	this.type = type;
	this.tabId = tabId;
	this.tabLabel = tabLabel;
	this.sNo=sNo;
	this.validations = validations;
	this.options=options;
}
public Integer getsNo() {
	return sNo;
}
public void setsNo(Integer sNo) {
	this.sNo = sNo;
}
public List<FieldOptions> getOptions() {
	return options;
}
public void setOptions(List<FieldOptions> options) {
	this.options = options;
}

}
