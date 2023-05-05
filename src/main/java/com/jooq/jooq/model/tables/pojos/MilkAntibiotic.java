/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MilkAntibiotic implements Serializable {

    private static final long serialVersionUID = 1L;

    private String     werks;
    private LocalDate  crdat;
    private String     shift;
    private String     channel;
    private String     inspectionLot;
    private String     society;
    private String     milkCateg;
    private String     milkType;
    private String     j_1kftbus;
    private String     routeNo;
    private String     transporter;
    private String     transType;
    private String     truckNo;
    private BigDecimal erfmg;
    private String     truckTime;
    private String     noOfCans;
    private BigDecimal fatN;
    private BigDecimal snfN;
    private BigDecimal clrN;
    private String     mbrtMinutes;
    private BigDecimal conductivity;
    private BigDecimal temperature;
    private BigDecimal ph;
    private BigDecimal protien;
    private String     antibiotic;
    private String     aufnr;
    private String     spclean;
    private String     repgap;
    private Integer    damcans;
    private Integer    damlids;
    private Integer    canno;
    private String     adulteration;
    private String     eMatter;
    private String     ot;
    private String     acidity;
    private BigDecimal quan;

    public MilkAntibiotic() {}

    public MilkAntibiotic(MilkAntibiotic value) {
        this.werks = value.werks;
        this.crdat = value.crdat;
        this.shift = value.shift;
        this.channel = value.channel;
        this.inspectionLot = value.inspectionLot;
        this.society = value.society;
        this.milkCateg = value.milkCateg;
        this.milkType = value.milkType;
        this.j_1kftbus = value.j_1kftbus;
        this.routeNo = value.routeNo;
        this.transporter = value.transporter;
        this.transType = value.transType;
        this.truckNo = value.truckNo;
        this.erfmg = value.erfmg;
        this.truckTime = value.truckTime;
        this.noOfCans = value.noOfCans;
        this.fatN = value.fatN;
        this.snfN = value.snfN;
        this.clrN = value.clrN;
        this.mbrtMinutes = value.mbrtMinutes;
        this.conductivity = value.conductivity;
        this.temperature = value.temperature;
        this.ph = value.ph;
        this.protien = value.protien;
        this.antibiotic = value.antibiotic;
        this.aufnr = value.aufnr;
        this.spclean = value.spclean;
        this.repgap = value.repgap;
        this.damcans = value.damcans;
        this.damlids = value.damlids;
        this.canno = value.canno;
        this.adulteration = value.adulteration;
        this.eMatter = value.eMatter;
        this.ot = value.ot;
        this.acidity = value.acidity;
        this.quan = value.quan;
    }

    public MilkAntibiotic(
        String     werks,
        LocalDate  crdat,
        String     shift,
        String     channel,
        String     inspectionLot,
        String     society,
        String     milkCateg,
        String     milkType,
        String     j_1kftbus,
        String     routeNo,
        String     transporter,
        String     transType,
        String     truckNo,
        BigDecimal erfmg,
        String     truckTime,
        String     noOfCans,
        BigDecimal fatN,
        BigDecimal snfN,
        BigDecimal clrN,
        String     mbrtMinutes,
        BigDecimal conductivity,
        BigDecimal temperature,
        BigDecimal ph,
        BigDecimal protien,
        String     antibiotic,
        String     aufnr,
        String     spclean,
        String     repgap,
        Integer    damcans,
        Integer    damlids,
        Integer    canno,
        String     adulteration,
        String     eMatter,
        String     ot,
        String     acidity,
        BigDecimal quan
    ) {
        this.werks = werks;
        this.crdat = crdat;
        this.shift = shift;
        this.channel = channel;
        this.inspectionLot = inspectionLot;
        this.society = society;
        this.milkCateg = milkCateg;
        this.milkType = milkType;
        this.j_1kftbus = j_1kftbus;
        this.routeNo = routeNo;
        this.transporter = transporter;
        this.transType = transType;
        this.truckNo = truckNo;
        this.erfmg = erfmg;
        this.truckTime = truckTime;
        this.noOfCans = noOfCans;
        this.fatN = fatN;
        this.snfN = snfN;
        this.clrN = clrN;
        this.mbrtMinutes = mbrtMinutes;
        this.conductivity = conductivity;
        this.temperature = temperature;
        this.ph = ph;
        this.protien = protien;
        this.antibiotic = antibiotic;
        this.aufnr = aufnr;
        this.spclean = spclean;
        this.repgap = repgap;
        this.damcans = damcans;
        this.damlids = damlids;
        this.canno = canno;
        this.adulteration = adulteration;
        this.eMatter = eMatter;
        this.ot = ot;
        this.acidity = acidity;
        this.quan = quan;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.WERKS</code>.
     */
    public String getWerks() {
        return this.werks;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.WERKS</code>.
     */
    public MilkAntibiotic setWerks(String werks) {
        this.werks = werks;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.CRDAT</code>.
     */
    public LocalDate getCrdat() {
        return this.crdat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.CRDAT</code>.
     */
    public MilkAntibiotic setCrdat(LocalDate crdat) {
        this.crdat = crdat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.SHIFT</code>.
     */
    public String getShift() {
        return this.shift;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.SHIFT</code>.
     */
    public MilkAntibiotic setShift(String shift) {
        this.shift = shift;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.CHANNEL</code>.
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.CHANNEL</code>.
     */
    public MilkAntibiotic setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.INSPECTION_LOT</code>.
     */
    public String getInspectionLot() {
        return this.inspectionLot;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.INSPECTION_LOT</code>.
     */
    public MilkAntibiotic setInspectionLot(String inspectionLot) {
        this.inspectionLot = inspectionLot;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.SOCIETY</code>.
     */
    public String getSociety() {
        return this.society;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.SOCIETY</code>.
     */
    public MilkAntibiotic setSociety(String society) {
        this.society = society;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.MILK_CATEG</code>.
     */
    public String getMilkCateg() {
        return this.milkCateg;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.MILK_CATEG</code>.
     */
    public MilkAntibiotic setMilkCateg(String milkCateg) {
        this.milkCateg = milkCateg;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.MILK_TYPE</code>.
     */
    public String getMilkType() {
        return this.milkType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.MILK_TYPE</code>.
     */
    public MilkAntibiotic setMilkType(String milkType) {
        this.milkType = milkType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.J_1KFTBUS</code>.
     */
    public String getJ_1kftbus() {
        return this.j_1kftbus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.J_1KFTBUS</code>.
     */
    public MilkAntibiotic setJ_1kftbus(String j_1kftbus) {
        this.j_1kftbus = j_1kftbus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.ROUTE_NO</code>.
     */
    public String getRouteNo() {
        return this.routeNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.ROUTE_NO</code>.
     */
    public MilkAntibiotic setRouteNo(String routeNo) {
        this.routeNo = routeNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.TRANSPORTER</code>.
     */
    public String getTransporter() {
        return this.transporter;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.TRANSPORTER</code>.
     */
    public MilkAntibiotic setTransporter(String transporter) {
        this.transporter = transporter;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.TRANS_TYPE</code>.
     */
    public String getTransType() {
        return this.transType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.TRANS_TYPE</code>.
     */
    public MilkAntibiotic setTransType(String transType) {
        this.transType = transType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.TRUCK_NO</code>.
     */
    public String getTruckNo() {
        return this.truckNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.TRUCK_NO</code>.
     */
    public MilkAntibiotic setTruckNo(String truckNo) {
        this.truckNo = truckNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.ERFMG</code>.
     */
    public BigDecimal getErfmg() {
        return this.erfmg;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.ERFMG</code>.
     */
    public MilkAntibiotic setErfmg(BigDecimal erfmg) {
        this.erfmg = erfmg;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.TRUCK_TIME</code>.
     */
    public String getTruckTime() {
        return this.truckTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.TRUCK_TIME</code>.
     */
    public MilkAntibiotic setTruckTime(String truckTime) {
        this.truckTime = truckTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.NO_OF_CANS</code>.
     */
    public String getNoOfCans() {
        return this.noOfCans;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.NO_OF_CANS</code>.
     */
    public MilkAntibiotic setNoOfCans(String noOfCans) {
        this.noOfCans = noOfCans;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.FAT_N</code>.
     */
    public BigDecimal getFatN() {
        return this.fatN;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.FAT_N</code>.
     */
    public MilkAntibiotic setFatN(BigDecimal fatN) {
        this.fatN = fatN;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.SNF_N</code>.
     */
    public BigDecimal getSnfN() {
        return this.snfN;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.SNF_N</code>.
     */
    public MilkAntibiotic setSnfN(BigDecimal snfN) {
        this.snfN = snfN;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.CLR_N</code>.
     */
    public BigDecimal getClrN() {
        return this.clrN;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.CLR_N</code>.
     */
    public MilkAntibiotic setClrN(BigDecimal clrN) {
        this.clrN = clrN;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.MBRT_MINUTES</code>.
     */
    public String getMbrtMinutes() {
        return this.mbrtMinutes;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.MBRT_MINUTES</code>.
     */
    public MilkAntibiotic setMbrtMinutes(String mbrtMinutes) {
        this.mbrtMinutes = mbrtMinutes;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.CONDUCTIVITY</code>.
     */
    public BigDecimal getConductivity() {
        return this.conductivity;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.CONDUCTIVITY</code>.
     */
    public MilkAntibiotic setConductivity(BigDecimal conductivity) {
        this.conductivity = conductivity;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.TEMPERATURE</code>.
     */
    public BigDecimal getTemperature() {
        return this.temperature;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.TEMPERATURE</code>.
     */
    public MilkAntibiotic setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.PH</code>.
     */
    public BigDecimal getPh() {
        return this.ph;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.PH</code>.
     */
    public MilkAntibiotic setPh(BigDecimal ph) {
        this.ph = ph;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.PROTIEN</code>.
     */
    public BigDecimal getProtien() {
        return this.protien;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.PROTIEN</code>.
     */
    public MilkAntibiotic setProtien(BigDecimal protien) {
        this.protien = protien;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.ANTIBIOTIC</code>.
     */
    public String getAntibiotic() {
        return this.antibiotic;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.ANTIBIOTIC</code>.
     */
    public MilkAntibiotic setAntibiotic(String antibiotic) {
        this.antibiotic = antibiotic;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.AUFNR</code>.
     */
    public String getAufnr() {
        return this.aufnr;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.AUFNR</code>.
     */
    public MilkAntibiotic setAufnr(String aufnr) {
        this.aufnr = aufnr;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.SPCLEAN</code>.
     */
    public String getSpclean() {
        return this.spclean;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.SPCLEAN</code>.
     */
    public MilkAntibiotic setSpclean(String spclean) {
        this.spclean = spclean;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.REPGAP</code>.
     */
    public String getRepgap() {
        return this.repgap;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.REPGAP</code>.
     */
    public MilkAntibiotic setRepgap(String repgap) {
        this.repgap = repgap;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.DAMCANS</code>.
     */
    public Integer getDamcans() {
        return this.damcans;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.DAMCANS</code>.
     */
    public MilkAntibiotic setDamcans(Integer damcans) {
        this.damcans = damcans;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.DAMLIDS</code>.
     */
    public Integer getDamlids() {
        return this.damlids;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.DAMLIDS</code>.
     */
    public MilkAntibiotic setDamlids(Integer damlids) {
        this.damlids = damlids;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.CANNO</code>.
     */
    public Integer getCanno() {
        return this.canno;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.CANNO</code>.
     */
    public MilkAntibiotic setCanno(Integer canno) {
        this.canno = canno;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.ADULTERATION</code>.
     */
    public String getAdulteration() {
        return this.adulteration;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.ADULTERATION</code>.
     */
    public MilkAntibiotic setAdulteration(String adulteration) {
        this.adulteration = adulteration;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.E_MATTER</code>.
     */
    public String getEMatter() {
        return this.eMatter;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.E_MATTER</code>.
     */
    public MilkAntibiotic setEMatter(String eMatter) {
        this.eMatter = eMatter;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.OT</code>.
     */
    public String getOt() {
        return this.ot;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.OT</code>.
     */
    public MilkAntibiotic setOt(String ot) {
        this.ot = ot;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.ACIDITY</code>.
     */
    public String getAcidity() {
        return this.acidity;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.ACIDITY</code>.
     */
    public MilkAntibiotic setAcidity(String acidity) {
        this.acidity = acidity;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_antibiotic.QUAN</code>.
     */
    public BigDecimal getQuan() {
        return this.quan;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_antibiotic.QUAN</code>.
     */
    public MilkAntibiotic setQuan(BigDecimal quan) {
        this.quan = quan;
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
        final MilkAntibiotic other = (MilkAntibiotic) obj;
        if (werks == null) {
            if (other.werks != null)
                return false;
        }
        else if (!werks.equals(other.werks))
            return false;
        if (crdat == null) {
            if (other.crdat != null)
                return false;
        }
        else if (!crdat.equals(other.crdat))
            return false;
        if (shift == null) {
            if (other.shift != null)
                return false;
        }
        else if (!shift.equals(other.shift))
            return false;
        if (channel == null) {
            if (other.channel != null)
                return false;
        }
        else if (!channel.equals(other.channel))
            return false;
        if (inspectionLot == null) {
            if (other.inspectionLot != null)
                return false;
        }
        else if (!inspectionLot.equals(other.inspectionLot))
            return false;
        if (society == null) {
            if (other.society != null)
                return false;
        }
        else if (!society.equals(other.society))
            return false;
        if (milkCateg == null) {
            if (other.milkCateg != null)
                return false;
        }
        else if (!milkCateg.equals(other.milkCateg))
            return false;
        if (milkType == null) {
            if (other.milkType != null)
                return false;
        }
        else if (!milkType.equals(other.milkType))
            return false;
        if (j_1kftbus == null) {
            if (other.j_1kftbus != null)
                return false;
        }
        else if (!j_1kftbus.equals(other.j_1kftbus))
            return false;
        if (routeNo == null) {
            if (other.routeNo != null)
                return false;
        }
        else if (!routeNo.equals(other.routeNo))
            return false;
        if (transporter == null) {
            if (other.transporter != null)
                return false;
        }
        else if (!transporter.equals(other.transporter))
            return false;
        if (transType == null) {
            if (other.transType != null)
                return false;
        }
        else if (!transType.equals(other.transType))
            return false;
        if (truckNo == null) {
            if (other.truckNo != null)
                return false;
        }
        else if (!truckNo.equals(other.truckNo))
            return false;
        if (erfmg == null) {
            if (other.erfmg != null)
                return false;
        }
        else if (!erfmg.equals(other.erfmg))
            return false;
        if (truckTime == null) {
            if (other.truckTime != null)
                return false;
        }
        else if (!truckTime.equals(other.truckTime))
            return false;
        if (noOfCans == null) {
            if (other.noOfCans != null)
                return false;
        }
        else if (!noOfCans.equals(other.noOfCans))
            return false;
        if (fatN == null) {
            if (other.fatN != null)
                return false;
        }
        else if (!fatN.equals(other.fatN))
            return false;
        if (snfN == null) {
            if (other.snfN != null)
                return false;
        }
        else if (!snfN.equals(other.snfN))
            return false;
        if (clrN == null) {
            if (other.clrN != null)
                return false;
        }
        else if (!clrN.equals(other.clrN))
            return false;
        if (mbrtMinutes == null) {
            if (other.mbrtMinutes != null)
                return false;
        }
        else if (!mbrtMinutes.equals(other.mbrtMinutes))
            return false;
        if (conductivity == null) {
            if (other.conductivity != null)
                return false;
        }
        else if (!conductivity.equals(other.conductivity))
            return false;
        if (temperature == null) {
            if (other.temperature != null)
                return false;
        }
        else if (!temperature.equals(other.temperature))
            return false;
        if (ph == null) {
            if (other.ph != null)
                return false;
        }
        else if (!ph.equals(other.ph))
            return false;
        if (protien == null) {
            if (other.protien != null)
                return false;
        }
        else if (!protien.equals(other.protien))
            return false;
        if (antibiotic == null) {
            if (other.antibiotic != null)
                return false;
        }
        else if (!antibiotic.equals(other.antibiotic))
            return false;
        if (aufnr == null) {
            if (other.aufnr != null)
                return false;
        }
        else if (!aufnr.equals(other.aufnr))
            return false;
        if (spclean == null) {
            if (other.spclean != null)
                return false;
        }
        else if (!spclean.equals(other.spclean))
            return false;
        if (repgap == null) {
            if (other.repgap != null)
                return false;
        }
        else if (!repgap.equals(other.repgap))
            return false;
        if (damcans == null) {
            if (other.damcans != null)
                return false;
        }
        else if (!damcans.equals(other.damcans))
            return false;
        if (damlids == null) {
            if (other.damlids != null)
                return false;
        }
        else if (!damlids.equals(other.damlids))
            return false;
        if (canno == null) {
            if (other.canno != null)
                return false;
        }
        else if (!canno.equals(other.canno))
            return false;
        if (adulteration == null) {
            if (other.adulteration != null)
                return false;
        }
        else if (!adulteration.equals(other.adulteration))
            return false;
        if (eMatter == null) {
            if (other.eMatter != null)
                return false;
        }
        else if (!eMatter.equals(other.eMatter))
            return false;
        if (ot == null) {
            if (other.ot != null)
                return false;
        }
        else if (!ot.equals(other.ot))
            return false;
        if (acidity == null) {
            if (other.acidity != null)
                return false;
        }
        else if (!acidity.equals(other.acidity))
            return false;
        if (quan == null) {
            if (other.quan != null)
                return false;
        }
        else if (!quan.equals(other.quan))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.werks == null) ? 0 : this.werks.hashCode());
        result = prime * result + ((this.crdat == null) ? 0 : this.crdat.hashCode());
        result = prime * result + ((this.shift == null) ? 0 : this.shift.hashCode());
        result = prime * result + ((this.channel == null) ? 0 : this.channel.hashCode());
        result = prime * result + ((this.inspectionLot == null) ? 0 : this.inspectionLot.hashCode());
        result = prime * result + ((this.society == null) ? 0 : this.society.hashCode());
        result = prime * result + ((this.milkCateg == null) ? 0 : this.milkCateg.hashCode());
        result = prime * result + ((this.milkType == null) ? 0 : this.milkType.hashCode());
        result = prime * result + ((this.j_1kftbus == null) ? 0 : this.j_1kftbus.hashCode());
        result = prime * result + ((this.routeNo == null) ? 0 : this.routeNo.hashCode());
        result = prime * result + ((this.transporter == null) ? 0 : this.transporter.hashCode());
        result = prime * result + ((this.transType == null) ? 0 : this.transType.hashCode());
        result = prime * result + ((this.truckNo == null) ? 0 : this.truckNo.hashCode());
        result = prime * result + ((this.erfmg == null) ? 0 : this.erfmg.hashCode());
        result = prime * result + ((this.truckTime == null) ? 0 : this.truckTime.hashCode());
        result = prime * result + ((this.noOfCans == null) ? 0 : this.noOfCans.hashCode());
        result = prime * result + ((this.fatN == null) ? 0 : this.fatN.hashCode());
        result = prime * result + ((this.snfN == null) ? 0 : this.snfN.hashCode());
        result = prime * result + ((this.clrN == null) ? 0 : this.clrN.hashCode());
        result = prime * result + ((this.mbrtMinutes == null) ? 0 : this.mbrtMinutes.hashCode());
        result = prime * result + ((this.conductivity == null) ? 0 : this.conductivity.hashCode());
        result = prime * result + ((this.temperature == null) ? 0 : this.temperature.hashCode());
        result = prime * result + ((this.ph == null) ? 0 : this.ph.hashCode());
        result = prime * result + ((this.protien == null) ? 0 : this.protien.hashCode());
        result = prime * result + ((this.antibiotic == null) ? 0 : this.antibiotic.hashCode());
        result = prime * result + ((this.aufnr == null) ? 0 : this.aufnr.hashCode());
        result = prime * result + ((this.spclean == null) ? 0 : this.spclean.hashCode());
        result = prime * result + ((this.repgap == null) ? 0 : this.repgap.hashCode());
        result = prime * result + ((this.damcans == null) ? 0 : this.damcans.hashCode());
        result = prime * result + ((this.damlids == null) ? 0 : this.damlids.hashCode());
        result = prime * result + ((this.canno == null) ? 0 : this.canno.hashCode());
        result = prime * result + ((this.adulteration == null) ? 0 : this.adulteration.hashCode());
        result = prime * result + ((this.eMatter == null) ? 0 : this.eMatter.hashCode());
        result = prime * result + ((this.ot == null) ? 0 : this.ot.hashCode());
        result = prime * result + ((this.acidity == null) ? 0 : this.acidity.hashCode());
        result = prime * result + ((this.quan == null) ? 0 : this.quan.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MilkAntibiotic (");

        sb.append(werks);
        sb.append(", ").append(crdat);
        sb.append(", ").append(shift);
        sb.append(", ").append(channel);
        sb.append(", ").append(inspectionLot);
        sb.append(", ").append(society);
        sb.append(", ").append(milkCateg);
        sb.append(", ").append(milkType);
        sb.append(", ").append(j_1kftbus);
        sb.append(", ").append(routeNo);
        sb.append(", ").append(transporter);
        sb.append(", ").append(transType);
        sb.append(", ").append(truckNo);
        sb.append(", ").append(erfmg);
        sb.append(", ").append(truckTime);
        sb.append(", ").append(noOfCans);
        sb.append(", ").append(fatN);
        sb.append(", ").append(snfN);
        sb.append(", ").append(clrN);
        sb.append(", ").append(mbrtMinutes);
        sb.append(", ").append(conductivity);
        sb.append(", ").append(temperature);
        sb.append(", ").append(ph);
        sb.append(", ").append(protien);
        sb.append(", ").append(antibiotic);
        sb.append(", ").append(aufnr);
        sb.append(", ").append(spclean);
        sb.append(", ").append(repgap);
        sb.append(", ").append(damcans);
        sb.append(", ").append(damlids);
        sb.append(", ").append(canno);
        sb.append(", ").append(adulteration);
        sb.append(", ").append(eMatter);
        sb.append(", ").append(ot);
        sb.append(", ").append(acidity);
        sb.append(", ").append(quan);

        sb.append(")");
        return sb.toString();
    }
}
