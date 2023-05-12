package com.jooq.jooq.reponse.model;

public class TabFormValidator {
private String name;
private String validator;
private String message;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getValidator() {
	return validator;
}
public void setValidator(String validator) {
	this.validator = validator;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public TabFormValidator(String name, String validator, String message) {
	super();
	this.name = name;
	this.validator = validator;
	this.message = message;
}

}
