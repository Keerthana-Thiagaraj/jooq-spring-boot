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
public class CcmsSalaryHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        employeeCode;
    private String        salaryDate;
    private String        plantCode;
    private Double        basic;
    private Double        hra;
    private Double        allowance;
    private Double        perDayWage;
    private Double        specialAllowance;
    private Double        ot;
    private Double        nhFh;
    private Double        woff;
    private Double        total;
    private Double        canteen;
    private Double        pf;
    private Double        esi;
    private Double        netSalary;
    private Double        erPf;
    private Double        erEsi;
    private Double        bonusProvision;
    private Double        serviceCharge;
    private Double        netBillAmount;
    private String        billApproved;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;
    private Long          shiftId;
    private Double        motiAllowance;
    private Double        coldRoomAllowance;
    private Double        gross2;
    private Double        gross3;
    private Double        gross1;

    public CcmsSalaryHistory() {}

    public CcmsSalaryHistory(CcmsSalaryHistory value) {
        this.employeeCode = value.employeeCode;
        this.salaryDate = value.salaryDate;
        this.plantCode = value.plantCode;
        this.basic = value.basic;
        this.hra = value.hra;
        this.allowance = value.allowance;
        this.perDayWage = value.perDayWage;
        this.specialAllowance = value.specialAllowance;
        this.ot = value.ot;
        this.nhFh = value.nhFh;
        this.woff = value.woff;
        this.total = value.total;
        this.canteen = value.canteen;
        this.pf = value.pf;
        this.esi = value.esi;
        this.netSalary = value.netSalary;
        this.erPf = value.erPf;
        this.erEsi = value.erEsi;
        this.bonusProvision = value.bonusProvision;
        this.serviceCharge = value.serviceCharge;
        this.netBillAmount = value.netBillAmount;
        this.billApproved = value.billApproved;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
        this.shiftId = value.shiftId;
        this.motiAllowance = value.motiAllowance;
        this.coldRoomAllowance = value.coldRoomAllowance;
        this.gross2 = value.gross2;
        this.gross3 = value.gross3;
        this.gross1 = value.gross1;
    }

    public CcmsSalaryHistory(
        String        employeeCode,
        String        salaryDate,
        String        plantCode,
        Double        basic,
        Double        hra,
        Double        allowance,
        Double        perDayWage,
        Double        specialAllowance,
        Double        ot,
        Double        nhFh,
        Double        woff,
        Double        total,
        Double        canteen,
        Double        pf,
        Double        esi,
        Double        netSalary,
        Double        erPf,
        Double        erEsi,
        Double        bonusProvision,
        Double        serviceCharge,
        Double        netBillAmount,
        String        billApproved,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn,
        Long          shiftId,
        Double        motiAllowance,
        Double        coldRoomAllowance,
        Double        gross2,
        Double        gross3,
        Double        gross1
    ) {
        this.employeeCode = employeeCode;
        this.salaryDate = salaryDate;
        this.plantCode = plantCode;
        this.basic = basic;
        this.hra = hra;
        this.allowance = allowance;
        this.perDayWage = perDayWage;
        this.specialAllowance = specialAllowance;
        this.ot = ot;
        this.nhFh = nhFh;
        this.woff = woff;
        this.total = total;
        this.canteen = canteen;
        this.pf = pf;
        this.esi = esi;
        this.netSalary = netSalary;
        this.erPf = erPf;
        this.erEsi = erEsi;
        this.bonusProvision = bonusProvision;
        this.serviceCharge = serviceCharge;
        this.netBillAmount = netBillAmount;
        this.billApproved = billApproved;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
        this.shiftId = shiftId;
        this.motiAllowance = motiAllowance;
        this.coldRoomAllowance = coldRoomAllowance;
        this.gross2 = gross2;
        this.gross3 = gross3;
        this.gross1 = gross1;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.employee_code</code>.
     */
    public String getEmployeeCode() {
        return this.employeeCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.employee_code</code>.
     */
    public CcmsSalaryHistory setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.salary_date</code>.
     */
    public String getSalaryDate() {
        return this.salaryDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.salary_date</code>.
     */
    public CcmsSalaryHistory setSalaryDate(String salaryDate) {
        this.salaryDate = salaryDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.plant_code</code>.
     */
    public String getPlantCode() {
        return this.plantCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.plant_code</code>.
     */
    public CcmsSalaryHistory setPlantCode(String plantCode) {
        this.plantCode = plantCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.basic</code>.
     */
    public Double getBasic() {
        return this.basic;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.basic</code>.
     */
    public CcmsSalaryHistory setBasic(Double basic) {
        this.basic = basic;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.hra</code>.
     */
    public Double getHra() {
        return this.hra;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.hra</code>.
     */
    public CcmsSalaryHistory setHra(Double hra) {
        this.hra = hra;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.allowance</code>.
     */
    public Double getAllowance() {
        return this.allowance;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.allowance</code>.
     */
    public CcmsSalaryHistory setAllowance(Double allowance) {
        this.allowance = allowance;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.per_day_wage</code>.
     */
    public Double getPerDayWage() {
        return this.perDayWage;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.per_day_wage</code>.
     */
    public CcmsSalaryHistory setPerDayWage(Double perDayWage) {
        this.perDayWage = perDayWage;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.special_allowance</code>.
     */
    public Double getSpecialAllowance() {
        return this.specialAllowance;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.special_allowance</code>.
     */
    public CcmsSalaryHistory setSpecialAllowance(Double specialAllowance) {
        this.specialAllowance = specialAllowance;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.ot</code>.
     */
    public Double getOt() {
        return this.ot;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.ot</code>.
     */
    public CcmsSalaryHistory setOt(Double ot) {
        this.ot = ot;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.nh_fh</code>.
     */
    public Double getNhFh() {
        return this.nhFh;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.nh_fh</code>.
     */
    public CcmsSalaryHistory setNhFh(Double nhFh) {
        this.nhFh = nhFh;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.woff</code>.
     */
    public Double getWoff() {
        return this.woff;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.woff</code>.
     */
    public CcmsSalaryHistory setWoff(Double woff) {
        this.woff = woff;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.total</code>.
     */
    public Double getTotal() {
        return this.total;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.total</code>.
     */
    public CcmsSalaryHistory setTotal(Double total) {
        this.total = total;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.canteen</code>.
     */
    public Double getCanteen() {
        return this.canteen;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.canteen</code>.
     */
    public CcmsSalaryHistory setCanteen(Double canteen) {
        this.canteen = canteen;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.pf</code>.
     */
    public Double getPf() {
        return this.pf;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.pf</code>.
     */
    public CcmsSalaryHistory setPf(Double pf) {
        this.pf = pf;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.esi</code>.
     */
    public Double getEsi() {
        return this.esi;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.esi</code>.
     */
    public CcmsSalaryHistory setEsi(Double esi) {
        this.esi = esi;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.net_salary</code>.
     */
    public Double getNetSalary() {
        return this.netSalary;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.net_salary</code>.
     */
    public CcmsSalaryHistory setNetSalary(Double netSalary) {
        this.netSalary = netSalary;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.er_pf</code>.
     */
    public Double getErPf() {
        return this.erPf;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.er_pf</code>.
     */
    public CcmsSalaryHistory setErPf(Double erPf) {
        this.erPf = erPf;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.er_esi</code>.
     */
    public Double getErEsi() {
        return this.erEsi;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.er_esi</code>.
     */
    public CcmsSalaryHistory setErEsi(Double erEsi) {
        this.erEsi = erEsi;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.bonus_provision</code>.
     */
    public Double getBonusProvision() {
        return this.bonusProvision;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.bonus_provision</code>.
     */
    public CcmsSalaryHistory setBonusProvision(Double bonusProvision) {
        this.bonusProvision = bonusProvision;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.service_charge</code>.
     */
    public Double getServiceCharge() {
        return this.serviceCharge;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.service_charge</code>.
     */
    public CcmsSalaryHistory setServiceCharge(Double serviceCharge) {
        this.serviceCharge = serviceCharge;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.net_bill_amount</code>.
     */
    public Double getNetBillAmount() {
        return this.netBillAmount;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.net_bill_amount</code>.
     */
    public CcmsSalaryHistory setNetBillAmount(Double netBillAmount) {
        this.netBillAmount = netBillAmount;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.bill_approved</code>.
     */
    public String getBillApproved() {
        return this.billApproved;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.bill_approved</code>.
     */
    public CcmsSalaryHistory setBillApproved(String billApproved) {
        this.billApproved = billApproved;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.created_by</code>.
     */
    public CcmsSalaryHistory setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.created_on</code>.
     */
    public CcmsSalaryHistory setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.last_changed_by</code>.
     */
    public CcmsSalaryHistory setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.last_changed_on</code>.
     */
    public CcmsSalaryHistory setLastChangedOn(LocalDateTime lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.shift_id</code>.
     */
    public Long getShiftId() {
        return this.shiftId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.shift_id</code>.
     */
    public CcmsSalaryHistory setShiftId(Long shiftId) {
        this.shiftId = shiftId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.moti_allowance</code>.
     */
    public Double getMotiAllowance() {
        return this.motiAllowance;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.moti_allowance</code>.
     */
    public CcmsSalaryHistory setMotiAllowance(Double motiAllowance) {
        this.motiAllowance = motiAllowance;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.cold_room_allowance</code>.
     */
    public Double getColdRoomAllowance() {
        return this.coldRoomAllowance;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.cold_room_allowance</code>.
     */
    public CcmsSalaryHistory setColdRoomAllowance(Double coldRoomAllowance) {
        this.coldRoomAllowance = coldRoomAllowance;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.gross2</code>.
     */
    public Double getGross2() {
        return this.gross2;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.gross2</code>.
     */
    public CcmsSalaryHistory setGross2(Double gross2) {
        this.gross2 = gross2;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.gross3</code>.
     */
    public Double getGross3() {
        return this.gross3;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.gross3</code>.
     */
    public CcmsSalaryHistory setGross3(Double gross3) {
        this.gross3 = gross3;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_history.gross1</code>.
     */
    public Double getGross1() {
        return this.gross1;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_history.gross1</code>.
     */
    public CcmsSalaryHistory setGross1(Double gross1) {
        this.gross1 = gross1;
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
        final CcmsSalaryHistory other = (CcmsSalaryHistory) obj;
        if (employeeCode == null) {
            if (other.employeeCode != null)
                return false;
        }
        else if (!employeeCode.equals(other.employeeCode))
            return false;
        if (salaryDate == null) {
            if (other.salaryDate != null)
                return false;
        }
        else if (!salaryDate.equals(other.salaryDate))
            return false;
        if (plantCode == null) {
            if (other.plantCode != null)
                return false;
        }
        else if (!plantCode.equals(other.plantCode))
            return false;
        if (basic == null) {
            if (other.basic != null)
                return false;
        }
        else if (!basic.equals(other.basic))
            return false;
        if (hra == null) {
            if (other.hra != null)
                return false;
        }
        else if (!hra.equals(other.hra))
            return false;
        if (allowance == null) {
            if (other.allowance != null)
                return false;
        }
        else if (!allowance.equals(other.allowance))
            return false;
        if (perDayWage == null) {
            if (other.perDayWage != null)
                return false;
        }
        else if (!perDayWage.equals(other.perDayWage))
            return false;
        if (specialAllowance == null) {
            if (other.specialAllowance != null)
                return false;
        }
        else if (!specialAllowance.equals(other.specialAllowance))
            return false;
        if (ot == null) {
            if (other.ot != null)
                return false;
        }
        else if (!ot.equals(other.ot))
            return false;
        if (nhFh == null) {
            if (other.nhFh != null)
                return false;
        }
        else if (!nhFh.equals(other.nhFh))
            return false;
        if (woff == null) {
            if (other.woff != null)
                return false;
        }
        else if (!woff.equals(other.woff))
            return false;
        if (total == null) {
            if (other.total != null)
                return false;
        }
        else if (!total.equals(other.total))
            return false;
        if (canteen == null) {
            if (other.canteen != null)
                return false;
        }
        else if (!canteen.equals(other.canteen))
            return false;
        if (pf == null) {
            if (other.pf != null)
                return false;
        }
        else if (!pf.equals(other.pf))
            return false;
        if (esi == null) {
            if (other.esi != null)
                return false;
        }
        else if (!esi.equals(other.esi))
            return false;
        if (netSalary == null) {
            if (other.netSalary != null)
                return false;
        }
        else if (!netSalary.equals(other.netSalary))
            return false;
        if (erPf == null) {
            if (other.erPf != null)
                return false;
        }
        else if (!erPf.equals(other.erPf))
            return false;
        if (erEsi == null) {
            if (other.erEsi != null)
                return false;
        }
        else if (!erEsi.equals(other.erEsi))
            return false;
        if (bonusProvision == null) {
            if (other.bonusProvision != null)
                return false;
        }
        else if (!bonusProvision.equals(other.bonusProvision))
            return false;
        if (serviceCharge == null) {
            if (other.serviceCharge != null)
                return false;
        }
        else if (!serviceCharge.equals(other.serviceCharge))
            return false;
        if (netBillAmount == null) {
            if (other.netBillAmount != null)
                return false;
        }
        else if (!netBillAmount.equals(other.netBillAmount))
            return false;
        if (billApproved == null) {
            if (other.billApproved != null)
                return false;
        }
        else if (!billApproved.equals(other.billApproved))
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
        if (shiftId == null) {
            if (other.shiftId != null)
                return false;
        }
        else if (!shiftId.equals(other.shiftId))
            return false;
        if (motiAllowance == null) {
            if (other.motiAllowance != null)
                return false;
        }
        else if (!motiAllowance.equals(other.motiAllowance))
            return false;
        if (coldRoomAllowance == null) {
            if (other.coldRoomAllowance != null)
                return false;
        }
        else if (!coldRoomAllowance.equals(other.coldRoomAllowance))
            return false;
        if (gross2 == null) {
            if (other.gross2 != null)
                return false;
        }
        else if (!gross2.equals(other.gross2))
            return false;
        if (gross3 == null) {
            if (other.gross3 != null)
                return false;
        }
        else if (!gross3.equals(other.gross3))
            return false;
        if (gross1 == null) {
            if (other.gross1 != null)
                return false;
        }
        else if (!gross1.equals(other.gross1))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.employeeCode == null) ? 0 : this.employeeCode.hashCode());
        result = prime * result + ((this.salaryDate == null) ? 0 : this.salaryDate.hashCode());
        result = prime * result + ((this.plantCode == null) ? 0 : this.plantCode.hashCode());
        result = prime * result + ((this.basic == null) ? 0 : this.basic.hashCode());
        result = prime * result + ((this.hra == null) ? 0 : this.hra.hashCode());
        result = prime * result + ((this.allowance == null) ? 0 : this.allowance.hashCode());
        result = prime * result + ((this.perDayWage == null) ? 0 : this.perDayWage.hashCode());
        result = prime * result + ((this.specialAllowance == null) ? 0 : this.specialAllowance.hashCode());
        result = prime * result + ((this.ot == null) ? 0 : this.ot.hashCode());
        result = prime * result + ((this.nhFh == null) ? 0 : this.nhFh.hashCode());
        result = prime * result + ((this.woff == null) ? 0 : this.woff.hashCode());
        result = prime * result + ((this.total == null) ? 0 : this.total.hashCode());
        result = prime * result + ((this.canteen == null) ? 0 : this.canteen.hashCode());
        result = prime * result + ((this.pf == null) ? 0 : this.pf.hashCode());
        result = prime * result + ((this.esi == null) ? 0 : this.esi.hashCode());
        result = prime * result + ((this.netSalary == null) ? 0 : this.netSalary.hashCode());
        result = prime * result + ((this.erPf == null) ? 0 : this.erPf.hashCode());
        result = prime * result + ((this.erEsi == null) ? 0 : this.erEsi.hashCode());
        result = prime * result + ((this.bonusProvision == null) ? 0 : this.bonusProvision.hashCode());
        result = prime * result + ((this.serviceCharge == null) ? 0 : this.serviceCharge.hashCode());
        result = prime * result + ((this.netBillAmount == null) ? 0 : this.netBillAmount.hashCode());
        result = prime * result + ((this.billApproved == null) ? 0 : this.billApproved.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        result = prime * result + ((this.shiftId == null) ? 0 : this.shiftId.hashCode());
        result = prime * result + ((this.motiAllowance == null) ? 0 : this.motiAllowance.hashCode());
        result = prime * result + ((this.coldRoomAllowance == null) ? 0 : this.coldRoomAllowance.hashCode());
        result = prime * result + ((this.gross2 == null) ? 0 : this.gross2.hashCode());
        result = prime * result + ((this.gross3 == null) ? 0 : this.gross3.hashCode());
        result = prime * result + ((this.gross1 == null) ? 0 : this.gross1.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsSalaryHistory (");

        sb.append(employeeCode);
        sb.append(", ").append(salaryDate);
        sb.append(", ").append(plantCode);
        sb.append(", ").append(basic);
        sb.append(", ").append(hra);
        sb.append(", ").append(allowance);
        sb.append(", ").append(perDayWage);
        sb.append(", ").append(specialAllowance);
        sb.append(", ").append(ot);
        sb.append(", ").append(nhFh);
        sb.append(", ").append(woff);
        sb.append(", ").append(total);
        sb.append(", ").append(canteen);
        sb.append(", ").append(pf);
        sb.append(", ").append(esi);
        sb.append(", ").append(netSalary);
        sb.append(", ").append(erPf);
        sb.append(", ").append(erEsi);
        sb.append(", ").append(bonusProvision);
        sb.append(", ").append(serviceCharge);
        sb.append(", ").append(netBillAmount);
        sb.append(", ").append(billApproved);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);
        sb.append(", ").append(shiftId);
        sb.append(", ").append(motiAllowance);
        sb.append(", ").append(coldRoomAllowance);
        sb.append(", ").append(gross2);
        sb.append(", ").append(gross3);
        sb.append(", ").append(gross1);

        sb.append(")");
        return sb.toString();
    }
}