/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DocTypeMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String docType;
    private String docTypeDesc;
    private String status;

    public DocTypeMaster() {}

    public DocTypeMaster(DocTypeMaster value) {
        this.docType = value.docType;
        this.docTypeDesc = value.docTypeDesc;
        this.status = value.status;
    }

    public DocTypeMaster(
        String docType,
        String docTypeDesc,
        String status
    ) {
        this.docType = docType;
        this.docTypeDesc = docTypeDesc;
        this.status = status;
    }

    /**
     * Getter for <code>vendor_portal_pbx.doc_type_master.DOC_TYPE</code>.
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.doc_type_master.DOC_TYPE</code>.
     */
    public DocTypeMaster setDocType(String docType) {
        this.docType = docType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.doc_type_master.DOC_TYPE_DESC</code>.
     */
    public String getDocTypeDesc() {
        return this.docTypeDesc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.doc_type_master.DOC_TYPE_DESC</code>.
     */
    public DocTypeMaster setDocTypeDesc(String docTypeDesc) {
        this.docTypeDesc = docTypeDesc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.doc_type_master.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.doc_type_master.STATUS</code>.
     */
    public DocTypeMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final DocTypeMaster other = (DocTypeMaster) obj;
        if (docType == null) {
            if (other.docType != null)
                return false;
        }
        else if (!docType.equals(other.docType))
            return false;
        if (docTypeDesc == null) {
            if (other.docTypeDesc != null)
                return false;
        }
        else if (!docTypeDesc.equals(other.docTypeDesc))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.docType == null) ? 0 : this.docType.hashCode());
        result = prime * result + ((this.docTypeDesc == null) ? 0 : this.docTypeDesc.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DocTypeMaster (");

        sb.append(docType);
        sb.append(", ").append(docTypeDesc);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}