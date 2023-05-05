/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    private String  compCode;
    private Integer roleId;
    private String  roleName;
    private String  block;

    public Role() {}

    public Role(Role value) {
        this.compCode = value.compCode;
        this.roleId = value.roleId;
        this.roleName = value.roleName;
        this.block = value.block;
    }

    public Role(
        String  compCode,
        Integer roleId,
        String  roleName,
        String  block
    ) {
        this.compCode = compCode;
        this.roleId = roleId;
        this.roleName = roleName;
        this.block = block;
    }

    /**
     * Getter for <code>vendor_portal_pbx.role.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.role.COMP_CODE</code>.
     */
    public Role setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.role.ROLE_ID</code>.
     */
    public Integer getRoleId() {
        return this.roleId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.role.ROLE_ID</code>.
     */
    public Role setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.role.ROLE_NAME</code>.
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.role.ROLE_NAME</code>.
     */
    public Role setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.role.BLOCK</code>.
     */
    public String getBlock() {
        return this.block;
    }

    /**
     * Setter for <code>vendor_portal_pbx.role.BLOCK</code>.
     */
    public Role setBlock(String block) {
        this.block = block;
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
        final Role other = (Role) obj;
        if (compCode == null) {
            if (other.compCode != null)
                return false;
        }
        else if (!compCode.equals(other.compCode))
            return false;
        if (roleId == null) {
            if (other.roleId != null)
                return false;
        }
        else if (!roleId.equals(other.roleId))
            return false;
        if (roleName == null) {
            if (other.roleName != null)
                return false;
        }
        else if (!roleName.equals(other.roleName))
            return false;
        if (block == null) {
            if (other.block != null)
                return false;
        }
        else if (!block.equals(other.block))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.roleId == null) ? 0 : this.roleId.hashCode());
        result = prime * result + ((this.roleName == null) ? 0 : this.roleName.hashCode());
        result = prime * result + ((this.block == null) ? 0 : this.block.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Role (");

        sb.append(compCode);
        sb.append(", ").append(roleId);
        sb.append(", ").append(roleName);
        sb.append(", ").append(block);

        sb.append(")");
        return sb.toString();
    }
}
