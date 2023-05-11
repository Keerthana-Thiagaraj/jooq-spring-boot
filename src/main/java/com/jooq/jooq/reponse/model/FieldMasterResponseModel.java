package com.jooq.jooq.reponse.model;

public class FieldMasterResponseModel {
//	"tabId": 1,
//    "tabLable": "General Data",
//    "tabName": "generalData",
//    "status": "A"
	private int sno;
	private String fieldid;
	private String filedlabel;
	private int tabid;
	private String tablabel;
	private String tabname;


	public FieldMasterResponseModel(int sno, String fieldid, String filedlabel, int tabid, String tablabel,
			String tabname) {
		super();
		this.sno = sno;
		this.fieldid = fieldid;
		this.filedlabel = filedlabel;
		this.tabid = tabid;
		this.tablabel = tablabel;
		this.tabname = tabname;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getFieldid() {
		return fieldid;
	}

	public void setFieldid(String fieldid) {
		this.fieldid = fieldid;
	}

	public int getTabid() {
		return tabid;
	}

	public void setTabid(int tabid) {
		this.tabid = tabid;
	}

	public String getFiledlabel() {
		return filedlabel;
	}

	public void setFiledlabel(String filedlabel) {
		this.filedlabel = filedlabel;
	}

	public String getTablabel() {
		return tablabel;
	}

	public void setTablabel(String tablabel) {
		this.tablabel = tablabel;
	}

	public String getTabname() {
		return tabname;
	}

	public void setTabname(String tabname) {
		this.tabname = tabname;
	}

}
