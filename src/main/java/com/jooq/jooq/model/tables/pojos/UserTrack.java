/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserTrack implements Serializable {

    private static final long serialVersionUID = 1L;

    private String    sessionId;
    private String    userId;
    private String    userName;
    private Integer   userTypeId;
    private String    loginIp;
    private String    serverIp;
    private LocalDate loginDate;
    private LocalTime loginTime;
    private LocalDate loggedDate;
    private LocalTime loggedTime;
    private String    userFlag;
    private String    accGrpCode;
    private String    userGrpCode;

    public UserTrack() {}

    public UserTrack(UserTrack value) {
        this.sessionId = value.sessionId;
        this.userId = value.userId;
        this.userName = value.userName;
        this.userTypeId = value.userTypeId;
        this.loginIp = value.loginIp;
        this.serverIp = value.serverIp;
        this.loginDate = value.loginDate;
        this.loginTime = value.loginTime;
        this.loggedDate = value.loggedDate;
        this.loggedTime = value.loggedTime;
        this.userFlag = value.userFlag;
        this.accGrpCode = value.accGrpCode;
        this.userGrpCode = value.userGrpCode;
    }

    public UserTrack(
        String    sessionId,
        String    userId,
        String    userName,
        Integer   userTypeId,
        String    loginIp,
        String    serverIp,
        LocalDate loginDate,
        LocalTime loginTime,
        LocalDate loggedDate,
        LocalTime loggedTime,
        String    userFlag,
        String    accGrpCode,
        String    userGrpCode
    ) {
        this.sessionId = sessionId;
        this.userId = userId;
        this.userName = userName;
        this.userTypeId = userTypeId;
        this.loginIp = loginIp;
        this.serverIp = serverIp;
        this.loginDate = loginDate;
        this.loginTime = loginTime;
        this.loggedDate = loggedDate;
        this.loggedTime = loggedTime;
        this.userFlag = userFlag;
        this.accGrpCode = accGrpCode;
        this.userGrpCode = userGrpCode;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.SESSION_ID</code>.
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.SESSION_ID</code>.
     */
    public UserTrack setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.USER_ID</code>.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.USER_ID</code>.
     */
    public UserTrack setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.USER_NAME</code>.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.USER_NAME</code>.
     */
    public UserTrack setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.USER_TYPE_ID</code>.
     */
    public Integer getUserTypeId() {
        return this.userTypeId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.USER_TYPE_ID</code>.
     */
    public UserTrack setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.LOGIN_IP</code>.
     */
    public String getLoginIp() {
        return this.loginIp;
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.LOGIN_IP</code>.
     */
    public UserTrack setLoginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.SERVER_IP</code>.
     */
    public String getServerIp() {
        return this.serverIp;
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.SERVER_IP</code>.
     */
    public UserTrack setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.LOGIN_DATE</code>.
     */
    public LocalDate getLoginDate() {
        return this.loginDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.LOGIN_DATE</code>.
     */
    public UserTrack setLoginDate(LocalDate loginDate) {
        this.loginDate = loginDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.LOGIN_TIME</code>.
     */
    public LocalTime getLoginTime() {
        return this.loginTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.LOGIN_TIME</code>.
     */
    public UserTrack setLoginTime(LocalTime loginTime) {
        this.loginTime = loginTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.LOGGED_DATE</code>.
     */
    public LocalDate getLoggedDate() {
        return this.loggedDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.LOGGED_DATE</code>.
     */
    public UserTrack setLoggedDate(LocalDate loggedDate) {
        this.loggedDate = loggedDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.LOGGED_TIME</code>.
     */
    public LocalTime getLoggedTime() {
        return this.loggedTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.LOGGED_TIME</code>.
     */
    public UserTrack setLoggedTime(LocalTime loggedTime) {
        this.loggedTime = loggedTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.USER_FLAG</code>.
     */
    public String getUserFlag() {
        return this.userFlag;
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.USER_FLAG</code>.
     */
    public UserTrack setUserFlag(String userFlag) {
        this.userFlag = userFlag;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.ACC_GRP_CODE</code>.
     */
    public String getAccGrpCode() {
        return this.accGrpCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.ACC_GRP_CODE</code>.
     */
    public UserTrack setAccGrpCode(String accGrpCode) {
        this.accGrpCode = accGrpCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.USER_GRP_CODE</code>.
     */
    public String getUserGrpCode() {
        return this.userGrpCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.USER_GRP_CODE</code>.
     */
    public UserTrack setUserGrpCode(String userGrpCode) {
        this.userGrpCode = userGrpCode;
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
        final UserTrack other = (UserTrack) obj;
        if (sessionId == null) {
            if (other.sessionId != null)
                return false;
        }
        else if (!sessionId.equals(other.sessionId))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
            return false;
        if (userName == null) {
            if (other.userName != null)
                return false;
        }
        else if (!userName.equals(other.userName))
            return false;
        if (userTypeId == null) {
            if (other.userTypeId != null)
                return false;
        }
        else if (!userTypeId.equals(other.userTypeId))
            return false;
        if (loginIp == null) {
            if (other.loginIp != null)
                return false;
        }
        else if (!loginIp.equals(other.loginIp))
            return false;
        if (serverIp == null) {
            if (other.serverIp != null)
                return false;
        }
        else if (!serverIp.equals(other.serverIp))
            return false;
        if (loginDate == null) {
            if (other.loginDate != null)
                return false;
        }
        else if (!loginDate.equals(other.loginDate))
            return false;
        if (loginTime == null) {
            if (other.loginTime != null)
                return false;
        }
        else if (!loginTime.equals(other.loginTime))
            return false;
        if (loggedDate == null) {
            if (other.loggedDate != null)
                return false;
        }
        else if (!loggedDate.equals(other.loggedDate))
            return false;
        if (loggedTime == null) {
            if (other.loggedTime != null)
                return false;
        }
        else if (!loggedTime.equals(other.loggedTime))
            return false;
        if (userFlag == null) {
            if (other.userFlag != null)
                return false;
        }
        else if (!userFlag.equals(other.userFlag))
            return false;
        if (accGrpCode == null) {
            if (other.accGrpCode != null)
                return false;
        }
        else if (!accGrpCode.equals(other.accGrpCode))
            return false;
        if (userGrpCode == null) {
            if (other.userGrpCode != null)
                return false;
        }
        else if (!userGrpCode.equals(other.userGrpCode))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.sessionId == null) ? 0 : this.sessionId.hashCode());
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.userName == null) ? 0 : this.userName.hashCode());
        result = prime * result + ((this.userTypeId == null) ? 0 : this.userTypeId.hashCode());
        result = prime * result + ((this.loginIp == null) ? 0 : this.loginIp.hashCode());
        result = prime * result + ((this.serverIp == null) ? 0 : this.serverIp.hashCode());
        result = prime * result + ((this.loginDate == null) ? 0 : this.loginDate.hashCode());
        result = prime * result + ((this.loginTime == null) ? 0 : this.loginTime.hashCode());
        result = prime * result + ((this.loggedDate == null) ? 0 : this.loggedDate.hashCode());
        result = prime * result + ((this.loggedTime == null) ? 0 : this.loggedTime.hashCode());
        result = prime * result + ((this.userFlag == null) ? 0 : this.userFlag.hashCode());
        result = prime * result + ((this.accGrpCode == null) ? 0 : this.accGrpCode.hashCode());
        result = prime * result + ((this.userGrpCode == null) ? 0 : this.userGrpCode.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserTrack (");

        sb.append(sessionId);
        sb.append(", ").append(userId);
        sb.append(", ").append(userName);
        sb.append(", ").append(userTypeId);
        sb.append(", ").append(loginIp);
        sb.append(", ").append(serverIp);
        sb.append(", ").append(loginDate);
        sb.append(", ").append(loginTime);
        sb.append(", ").append(loggedDate);
        sb.append(", ").append(loggedTime);
        sb.append(", ").append(userFlag);
        sb.append(", ").append(accGrpCode);
        sb.append(", ").append(userGrpCode);

        sb.append(")");
        return sb.toString();
    }
}