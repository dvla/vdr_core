package uk.gov.dvla.domain;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;
import uk.gov.dvla.domain.mib.TestPassStatus;

import java.lang.Boolean;
import java.lang.String;
import java.util.Date;
import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class Entitlement {

    private String code;
    private Date validFrom;
    private Date validTo;
    private Boolean provisional = null;
    private Boolean priorTo = null;
    private List<EntitlementRestriction> restrictions;
    private Boolean vocational;
    private List<EntitlementStatus> statuses;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public Boolean getProvisional() {
        return provisional;
    }

    public void setProvisional(Boolean provisional) {
        this.provisional = provisional;
    }

    public Boolean getPriorTo() {
        return priorTo;
    }

    public void setPriorTo(Boolean priorTo) {
        this.priorTo = priorTo;
    }

    public List<EntitlementRestriction> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<EntitlementRestriction> restrictions) {
        this.restrictions = restrictions;
    }

    public Boolean getVocational() {
        return vocational;
    }

    public void setVocational(Boolean vocational) {
        this.vocational = vocational;
    }

    public List<EntitlementStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<EntitlementStatus> statuses) {
        this.statuses = statuses;
    }
}
