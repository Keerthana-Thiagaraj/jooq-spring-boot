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
public class LogisticTransItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private String     compCode;
    private String     transporter;
    private String     werks;
    private String     routeNo;
    private LocalDate  crdat;
    private String     name;
    private String     ebeln;
    private String     truckNo;
    private String     transType;
    private BigDecimal erfmg;
    private BigDecimal soDis;
    private BigDecimal fixedKmRate;
    private BigDecimal kmRate;
    private BigDecimal ltrRate;
    private BigDecimal totalKm;
    private BigDecimal totalLtr;
    private BigDecimal total;
    private String     routeDescr;

    public LogisticTransItem() {}

    public LogisticTransItem(LogisticTransItem value) {
        this.compCode = value.compCode;
        this.transporter = value.transporter;
        this.werks = value.werks;
        this.routeNo = value.routeNo;
        this.crdat = value.crdat;
        this.name = value.name;
        this.ebeln = value.ebeln;
        this.truckNo = value.truckNo;
        this.transType = value.transType;
        this.erfmg = value.erfmg;
        this.soDis = value.soDis;
        this.fixedKmRate = value.fixedKmRate;
        this.kmRate = value.kmRate;
        this.ltrRate = value.ltrRate;
        this.totalKm = value.totalKm;
        this.totalLtr = value.totalLtr;
        this.total = value.total;
        this.routeDescr = value.routeDescr;
    }

    public LogisticTransItem(
        String     compCode,
        String     transporter,
        String     werks,
        String     routeNo,
        LocalDate  crdat,
        String     name,
        String     ebeln,
        String     truckNo,
        String     transType,
        BigDecimal erfmg,
        BigDecimal soDis,
        BigDecimal fixedKmRate,
        BigDecimal kmRate,
        BigDecimal ltrRate,
        BigDecimal totalKm,
        BigDecimal totalLtr,
        BigDecimal total,
        String     routeDescr
    ) {
        this.compCode = compCode;
        this.transporter = transporter;
        this.werks = werks;
        this.routeNo = routeNo;
        this.crdat = crdat;
        this.name = name;
        this.ebeln = ebeln;
        this.truckNo = truckNo;
        this.transType = transType;
        this.erfmg = erfmg;
        this.soDis = soDis;
        this.fixedKmRate = fixedKmRate;
        this.kmRate = kmRate;
        this.ltrRate = ltrRate;
        this.totalKm = totalKm;
        this.totalLtr = totalLtr;
        this.total = total;
        this.routeDescr = routeDescr;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.COMP_CODE</code>.
     */
    public LogisticTransItem setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.TRANSPORTER</code>.
     */
    public String getTransporter() {
        return this.transporter;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.TRANSPORTER</code>.
     */
    public LogisticTransItem setTransporter(String transporter) {
        this.transporter = transporter;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.WERKS</code>.
     */
    public String getWerks() {
        return this.werks;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.WERKS</code>.
     */
    public LogisticTransItem setWerks(String werks) {
        this.werks = werks;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.ROUTE_NO</code>.
     */
    public String getRouteNo() {
        return this.routeNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.ROUTE_NO</code>.
     */
    public LogisticTransItem setRouteNo(String routeNo) {
        this.routeNo = routeNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.CRDAT</code>.
     */
    public LocalDate getCrdat() {
        return this.crdat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.CRDAT</code>.
     */
    public LogisticTransItem setCrdat(LocalDate crdat) {
        this.crdat = crdat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.NAME</code>.
     */
    public LogisticTransItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.EBELN</code>.
     */
    public String getEbeln() {
        return this.ebeln;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.EBELN</code>.
     */
    public LogisticTransItem setEbeln(String ebeln) {
        this.ebeln = ebeln;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.TRUCK_NO</code>.
     */
    public String getTruckNo() {
        return this.truckNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.TRUCK_NO</code>.
     */
    public LogisticTransItem setTruckNo(String truckNo) {
        this.truckNo = truckNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.TRANS_TYPE</code>.
     */
    public String getTransType() {
        return this.transType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.TRANS_TYPE</code>.
     */
    public LogisticTransItem setTransType(String transType) {
        this.transType = transType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.ERFMG</code>.
     */
    public BigDecimal getErfmg() {
        return this.erfmg;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.ERFMG</code>.
     */
    public LogisticTransItem setErfmg(BigDecimal erfmg) {
        this.erfmg = erfmg;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.SO_DIS</code>.
     */
    public BigDecimal getSoDis() {
        return this.soDis;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.SO_DIS</code>.
     */
    public LogisticTransItem setSoDis(BigDecimal soDis) {
        this.soDis = soDis;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.FIXED_KM_RATE</code>.
     */
    public BigDecimal getFixedKmRate() {
        return this.fixedKmRate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.FIXED_KM_RATE</code>.
     */
    public LogisticTransItem setFixedKmRate(BigDecimal fixedKmRate) {
        this.fixedKmRate = fixedKmRate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.KM_RATE</code>.
     */
    public BigDecimal getKmRate() {
        return this.kmRate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.KM_RATE</code>.
     */
    public LogisticTransItem setKmRate(BigDecimal kmRate) {
        this.kmRate = kmRate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.LTR_RATE</code>.
     */
    public BigDecimal getLtrRate() {
        return this.ltrRate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.LTR_RATE</code>.
     */
    public LogisticTransItem setLtrRate(BigDecimal ltrRate) {
        this.ltrRate = ltrRate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.TOTAL_KM</code>.
     */
    public BigDecimal getTotalKm() {
        return this.totalKm;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.TOTAL_KM</code>.
     */
    public LogisticTransItem setTotalKm(BigDecimal totalKm) {
        this.totalKm = totalKm;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.TOTAL_LTR</code>.
     */
    public BigDecimal getTotalLtr() {
        return this.totalLtr;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.TOTAL_LTR</code>.
     */
    public LogisticTransItem setTotalLtr(BigDecimal totalLtr) {
        this.totalLtr = totalLtr;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.TOTAL</code>.
     */
    public BigDecimal getTotal() {
        return this.total;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.TOTAL</code>.
     */
    public LogisticTransItem setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.ROUTE_DESCR</code>.
     */
    public String getRouteDescr() {
        return this.routeDescr;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.ROUTE_DESCR</code>.
     */
    public LogisticTransItem setRouteDescr(String routeDescr) {
        this.routeDescr = routeDescr;
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
        final LogisticTransItem other = (LogisticTransItem) obj;
        if (compCode == null) {
            if (other.compCode != null)
                return false;
        }
        else if (!compCode.equals(other.compCode))
            return false;
        if (transporter == null) {
            if (other.transporter != null)
                return false;
        }
        else if (!transporter.equals(other.transporter))
            return false;
        if (werks == null) {
            if (other.werks != null)
                return false;
        }
        else if (!werks.equals(other.werks))
            return false;
        if (routeNo == null) {
            if (other.routeNo != null)
                return false;
        }
        else if (!routeNo.equals(other.routeNo))
            return false;
        if (crdat == null) {
            if (other.crdat != null)
                return false;
        }
        else if (!crdat.equals(other.crdat))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (ebeln == null) {
            if (other.ebeln != null)
                return false;
        }
        else if (!ebeln.equals(other.ebeln))
            return false;
        if (truckNo == null) {
            if (other.truckNo != null)
                return false;
        }
        else if (!truckNo.equals(other.truckNo))
            return false;
        if (transType == null) {
            if (other.transType != null)
                return false;
        }
        else if (!transType.equals(other.transType))
            return false;
        if (erfmg == null) {
            if (other.erfmg != null)
                return false;
        }
        else if (!erfmg.equals(other.erfmg))
            return false;
        if (soDis == null) {
            if (other.soDis != null)
                return false;
        }
        else if (!soDis.equals(other.soDis))
            return false;
        if (fixedKmRate == null) {
            if (other.fixedKmRate != null)
                return false;
        }
        else if (!fixedKmRate.equals(other.fixedKmRate))
            return false;
        if (kmRate == null) {
            if (other.kmRate != null)
                return false;
        }
        else if (!kmRate.equals(other.kmRate))
            return false;
        if (ltrRate == null) {
            if (other.ltrRate != null)
                return false;
        }
        else if (!ltrRate.equals(other.ltrRate))
            return false;
        if (totalKm == null) {
            if (other.totalKm != null)
                return false;
        }
        else if (!totalKm.equals(other.totalKm))
            return false;
        if (totalLtr == null) {
            if (other.totalLtr != null)
                return false;
        }
        else if (!totalLtr.equals(other.totalLtr))
            return false;
        if (total == null) {
            if (other.total != null)
                return false;
        }
        else if (!total.equals(other.total))
            return false;
        if (routeDescr == null) {
            if (other.routeDescr != null)
                return false;
        }
        else if (!routeDescr.equals(other.routeDescr))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.transporter == null) ? 0 : this.transporter.hashCode());
        result = prime * result + ((this.werks == null) ? 0 : this.werks.hashCode());
        result = prime * result + ((this.routeNo == null) ? 0 : this.routeNo.hashCode());
        result = prime * result + ((this.crdat == null) ? 0 : this.crdat.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.ebeln == null) ? 0 : this.ebeln.hashCode());
        result = prime * result + ((this.truckNo == null) ? 0 : this.truckNo.hashCode());
        result = prime * result + ((this.transType == null) ? 0 : this.transType.hashCode());
        result = prime * result + ((this.erfmg == null) ? 0 : this.erfmg.hashCode());
        result = prime * result + ((this.soDis == null) ? 0 : this.soDis.hashCode());
        result = prime * result + ((this.fixedKmRate == null) ? 0 : this.fixedKmRate.hashCode());
        result = prime * result + ((this.kmRate == null) ? 0 : this.kmRate.hashCode());
        result = prime * result + ((this.ltrRate == null) ? 0 : this.ltrRate.hashCode());
        result = prime * result + ((this.totalKm == null) ? 0 : this.totalKm.hashCode());
        result = prime * result + ((this.totalLtr == null) ? 0 : this.totalLtr.hashCode());
        result = prime * result + ((this.total == null) ? 0 : this.total.hashCode());
        result = prime * result + ((this.routeDescr == null) ? 0 : this.routeDescr.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LogisticTransItem (");

        sb.append(compCode);
        sb.append(", ").append(transporter);
        sb.append(", ").append(werks);
        sb.append(", ").append(routeNo);
        sb.append(", ").append(crdat);
        sb.append(", ").append(name);
        sb.append(", ").append(ebeln);
        sb.append(", ").append(truckNo);
        sb.append(", ").append(transType);
        sb.append(", ").append(erfmg);
        sb.append(", ").append(soDis);
        sb.append(", ").append(fixedKmRate);
        sb.append(", ").append(kmRate);
        sb.append(", ").append(ltrRate);
        sb.append(", ").append(totalKm);
        sb.append(", ").append(totalLtr);
        sb.append(", ").append(total);
        sb.append(", ").append(routeDescr);

        sb.append(")");
        return sb.toString();
    }
}
