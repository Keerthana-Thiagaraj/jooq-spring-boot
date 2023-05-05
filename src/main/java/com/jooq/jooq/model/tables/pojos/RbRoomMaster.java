/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RbRoomMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       rbLocationCode;
    private Integer       roomCode;
    private Integer       floorCode;
    private Integer       buildingCode;
    private String        roomName;
    private Integer       seatCount;
    private String        statusFlag;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public RbRoomMaster() {}

    public RbRoomMaster(RbRoomMaster value) {
        this.rbLocationCode = value.rbLocationCode;
        this.roomCode = value.roomCode;
        this.floorCode = value.floorCode;
        this.buildingCode = value.buildingCode;
        this.roomName = value.roomName;
        this.seatCount = value.seatCount;
        this.statusFlag = value.statusFlag;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public RbRoomMaster(
        Integer       rbLocationCode,
        Integer       roomCode,
        Integer       floorCode,
        Integer       buildingCode,
        String        roomName,
        Integer       seatCount,
        String        statusFlag,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.rbLocationCode = rbLocationCode;
        this.roomCode = roomCode;
        this.floorCode = floorCode;
        this.buildingCode = buildingCode;
        this.roomName = roomName;
        this.seatCount = seatCount;
        this.statusFlag = statusFlag;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_MASTER.RB_LOCATION_CODE</code>.
     */
    public Integer getRbLocationCode() {
        return this.rbLocationCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_MASTER.RB_LOCATION_CODE</code>.
     */
    public RbRoomMaster setRbLocationCode(Integer rbLocationCode) {
        this.rbLocationCode = rbLocationCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_MASTER.ROOM_CODE</code>.
     */
    public Integer getRoomCode() {
        return this.roomCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_MASTER.ROOM_CODE</code>.
     */
    public RbRoomMaster setRoomCode(Integer roomCode) {
        this.roomCode = roomCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_MASTER.FLOOR_CODE</code>.
     */
    public Integer getFloorCode() {
        return this.floorCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_MASTER.FLOOR_CODE</code>.
     */
    public RbRoomMaster setFloorCode(Integer floorCode) {
        this.floorCode = floorCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_MASTER.BUILDING_CODE</code>.
     */
    public Integer getBuildingCode() {
        return this.buildingCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_MASTER.BUILDING_CODE</code>.
     */
    public RbRoomMaster setBuildingCode(Integer buildingCode) {
        this.buildingCode = buildingCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_MASTER.ROOM_NAME</code>.
     */
    public String getRoomName() {
        return this.roomName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_MASTER.ROOM_NAME</code>.
     */
    public RbRoomMaster setRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_MASTER.SEAT_COUNT</code>.
     */
    public Integer getSeatCount() {
        return this.seatCount;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_MASTER.SEAT_COUNT</code>.
     */
    public RbRoomMaster setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_MASTER.STATUS_FLAG</code>.
     */
    public String getStatusFlag() {
        return this.statusFlag;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_MASTER.STATUS_FLAG</code>.
     */
    public RbRoomMaster setStatusFlag(String statusFlag) {
        this.statusFlag = statusFlag;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_MASTER.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_MASTER.CREATED_BY</code>.
     */
    public RbRoomMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_MASTER.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_MASTER.CREATED_ON</code>.
     */
    public RbRoomMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_MASTER.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_MASTER.LAST_CHANGED_BY</code>.
     */
    public RbRoomMaster setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_MASTER.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_MASTER.LAST_CHANGED_ON</code>.
     */
    public RbRoomMaster setLastChangedOn(LocalDateTime lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
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
        final RbRoomMaster other = (RbRoomMaster) obj;
        if (rbLocationCode == null) {
            if (other.rbLocationCode != null)
                return false;
        }
        else if (!rbLocationCode.equals(other.rbLocationCode))
            return false;
        if (roomCode == null) {
            if (other.roomCode != null)
                return false;
        }
        else if (!roomCode.equals(other.roomCode))
            return false;
        if (floorCode == null) {
            if (other.floorCode != null)
                return false;
        }
        else if (!floorCode.equals(other.floorCode))
            return false;
        if (buildingCode == null) {
            if (other.buildingCode != null)
                return false;
        }
        else if (!buildingCode.equals(other.buildingCode))
            return false;
        if (roomName == null) {
            if (other.roomName != null)
                return false;
        }
        else if (!roomName.equals(other.roomName))
            return false;
        if (seatCount == null) {
            if (other.seatCount != null)
                return false;
        }
        else if (!seatCount.equals(other.seatCount))
            return false;
        if (statusFlag == null) {
            if (other.statusFlag != null)
                return false;
        }
        else if (!statusFlag.equals(other.statusFlag))
            return false;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!createdBy.equals(other.createdBy))
            return false;
        if (createdOn == null) {
            if (other.createdOn != null)
                return false;
        }
        else if (!createdOn.equals(other.createdOn))
            return false;
        if (lastChangedBy == null) {
            if (other.lastChangedBy != null)
                return false;
        }
        else if (!lastChangedBy.equals(other.lastChangedBy))
            return false;
        if (lastChangedOn == null) {
            if (other.lastChangedOn != null)
                return false;
        }
        else if (!lastChangedOn.equals(other.lastChangedOn))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.rbLocationCode == null) ? 0 : this.rbLocationCode.hashCode());
        result = prime * result + ((this.roomCode == null) ? 0 : this.roomCode.hashCode());
        result = prime * result + ((this.floorCode == null) ? 0 : this.floorCode.hashCode());
        result = prime * result + ((this.buildingCode == null) ? 0 : this.buildingCode.hashCode());
        result = prime * result + ((this.roomName == null) ? 0 : this.roomName.hashCode());
        result = prime * result + ((this.seatCount == null) ? 0 : this.seatCount.hashCode());
        result = prime * result + ((this.statusFlag == null) ? 0 : this.statusFlag.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RbRoomMaster (");

        sb.append(rbLocationCode);
        sb.append(", ").append(roomCode);
        sb.append(", ").append(floorCode);
        sb.append(", ").append(buildingCode);
        sb.append(", ").append(roomName);
        sb.append(", ").append(seatCount);
        sb.append(", ").append(statusFlag);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
