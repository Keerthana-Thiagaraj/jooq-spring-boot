package com.jooq.jooq.reponse.model;

public class FieldOptions {
private Integer Id;
private String Label;
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getLabel() {
	return Label;
}
public void setLabel(String label) {
	Label = label;
}
public FieldOptions(Integer id, String label) {
	super();
	Id = id;
	Label = label;
}

}
