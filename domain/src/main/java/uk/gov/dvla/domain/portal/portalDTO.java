package uk.gov.dvla.domain.portal;

import org.joda.time.DateTime;
import uk.gov.dvla.domain.DomainConfiguration;
import uk.gov.dvla.domain.mib.EntitlementType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class portalDTO {

    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public static class Driver {
        private String currentDriverNumber;
        private BirthDetails birthDetails;
        private Name name;
        private Licence licence;
        private Integer gender;


        public String getCurrentDriverNumber() {
            return currentDriverNumber;
        }

        public void setCurrentDriverNumber(String currentDriverNumber) {
            this.currentDriverNumber = currentDriverNumber;
        }

        public Licence getLicence() {
            return this.licence;
        }

        public void setLicence(Licence licence) {
            this.licence = licence;
        }
    }

    public static class Person {
        private Name name;
        private Address address;
        private int gender;

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }
    }

    public static class Name {
        private String title = null;
        private List<String> givenName = null;
        private String familyName = null;

        public void addGivenName(String gn) {
            if (null == givenName) {
                givenName = new ArrayList<String>();
            }
            givenName.add(gn);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getGivenName() {
            return givenName;
        }

        public void setGivenName(List<String> givenName) {
            this.givenName = givenName;
        }

        public String getFamilyName() {
            return familyName;
        }

        public void setFamilyName(String familyName) {
            this.familyName = familyName;
        }
    }

    public static class Address {

        private String buildingName;
        private String ddtfare;
        private String postTown;
        private String postCode;
        private String type;
        private List<String> uLine;
        private String uPostCode;

        public String getBuildingName() {
            return buildingName;
        }

        public void setBuildingName(String buildingName) {
            this.buildingName = buildingName;
        }

        public String getDdtfare() {
            return ddtfare;
        }

        public void setDdtfare(String ddtfare) {
            this.ddtfare = ddtfare;
        }

        public String getPostTown() {
            return postTown;
        }

        public void setPostTown(String postTown) {
            this.postTown = postTown;
        }

        public String getPostCode() {
            return postCode;
        }

        public void setPostCode(String postCode) {
            this.postCode = postCode;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<String> getuLine() {
            return uLine;
        }

        public void setuLine(List<String> uLine) {
            this.uLine = uLine;
        }

        public String getuPostCode() {
            return uPostCode;
        }

        public void setuPostCode(String uPostCode) {
            this.uPostCode = uPostCode;
        }
    }

    public static class BirthDetails {
        private Date date;

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

    }

    public static class Licence {

        private Date validFrom;
        private Date validTo;
        private int directiveStatus;
        private List<Entitlement> entitlements;
        private List<Endorsement> endorsements;
        private Date photoExpiryDate;


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

        public Integer getDirectiveStatus() {
            return directiveStatus;
        }

        public void setDirectiveStatus(Integer directiveStatus) {
            this.directiveStatus = directiveStatus;
        }

        public List<Entitlement> getEntitlements() {
            return entitlements;
        }

        public void setEntitlements(List<Entitlement> entitlements) {
            this.entitlements = entitlements;
        }

        public List<Endorsement> getEndorsements() {
            return endorsements;
        }

        public void setEndorsements(List<Endorsement> endorsements) {
            this.endorsements = endorsements;
        }

        public Date getPhotoExpiryDate() {
            return photoExpiryDate;
        }

        public void setPhotoExpiryDate(Date photoExpiryDate) {
            this.photoExpiryDate = photoExpiryDate;
        }
    }

    public static class Entitlement {

        private String code;
        private Date validFrom;
        private Date validTo;
        private Boolean provisional;
        private Boolean priorTo;
        private EntitlementType type;
        private List<EntitlementRestriction> restrictions;
        private Boolean vocational;

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

        public EntitlementType getType() {
            return type;
        }

        public void setType(EntitlementType entitlementType) {
            this.type = entitlementType;
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
    }

    public class Endorsement {

        public Integer id;
        public Boolean disqual;
        public String code;
        public String convictingCourt;
        public Date offence;
        public Date expires;
        public Date removed;
        public Date conviction;
        public Date sentencing;
        public String duration;
        public Double fine;
        public Integer noPoints;
        public OtherSentence otherSentence;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Boolean getDisqual() {
            return disqual;
        }

        public void setDisqual(Boolean disqual) {
            this.disqual = disqual;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getConvictingCourt() {
            return convictingCourt;
        }

        public void setConvictingCourt(String convictingCourt) {
            this.convictingCourt = convictingCourt;
        }

        public Date getOffence() {
            return offence;
        }

        public void setOffence(Date offence) {
            this.offence = offence;
        }

        public Date getExpires() {
            return expires;
        }

        public void setExpires(Date expires) {
            this.expires = expires;
        }

        public Date getRemoved() {
            return removed;
        }

        public void setRemoved(Date removed) {
            this.removed = removed;
        }

        public Date getConviction() {
            return conviction;
        }

        public void setConviction(Date conviction) {
            this.conviction = conviction;
        }

        public Date getSentencing() {
            return sentencing;
        }

        public void setSentencing(Date sentencing) {
            this.sentencing = sentencing;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public Double getFine() {
            return fine;
        }

        public void setFine(Double fine) {
            this.fine = fine;
        }

        public Integer getNoPoints() {
            return noPoints;
        }

        public void setNoPoints(Integer noPoints) {
            this.noPoints = noPoints;
        }

        public OtherSentence getOtherSentence() {
            return otherSentence;
        }

        public void setOtherSentence(OtherSentence otherSentence) {
            this.otherSentence = otherSentence;
        }
    }

    public static class OtherSentence {
        private String code;
        private String name;
        private String duration;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }
    }

    public class EntitlementRestriction {

        private String code;
        private String categoryCode;
        private Date validTo;

        public EntitlementRestriction() {
        }

        public EntitlementRestriction(String code, String categoryCode) {
            if (code == null) {
                throw new RuntimeException("code must be specified");
            }

            this.code = code;
            this.categoryCode = categoryCode;

        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getCategoryCode() {
            return categoryCode;
        }

        public void setCategoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
        }

        public Date getValidTo() {
            return validTo;
        }

        public void setValidTo(Date validTo) {
            this.validTo = validTo;
        }
    }

    public class TestPass implements Comparable<TestPass> {
        private String entitlementType;
        private String statusType;
        private Date testPassDate;
        private Boolean extended;
        private Boolean harmonised;
        private Boolean automatic;
        private Boolean lessThanEqual25kw;

        public Date getExpiryDate()
        {
            Integer unclaimedTestPassValidityInMonths = DomainConfiguration.getInstance().getUnclaimedTestPassValidity();
            if(getTestPassDate() != null)
            {
                return new DateTime(getTestPassDate()).plusMonths(unclaimedTestPassValidityInMonths).toDate();
            }
            else
            {
                return null;
            }

        }

        public int compareTo(TestPass other)
        {
            return this.getTestPassDate().compareTo(other.getTestPassDate());
        }

        public String getEntitlementType() {
            return entitlementType;
        }

        public void setEntitlementType(String entitlementType) {
            this.entitlementType = entitlementType;
        }

        public String getStatusType() {
            return statusType;
        }

        public void setStatusType(String statusType) {
            this.statusType = statusType;
        }

        public Date getTestPassDate() {
            return testPassDate;
        }

        public void setTestPassDate(Date testPassDate) {
            this.testPassDate = testPassDate;
        }

        public Boolean getExtended() {
            return extended;
        }

        public void setExtended(Boolean extended) {
            this.extended = extended;
        }

        public Boolean getHarmonised() {
            return harmonised;
        }

        public void setHarmonised(Boolean harmonised) {
            this.harmonised = harmonised;
        }

        public Boolean getAutomatic() {
            return automatic;
        }

        public void setAutomatic(Boolean automatic) {
            this.automatic = automatic;
        }

        public Boolean getLessThanEqual25kw() {
            return lessThanEqual25kw;
        }

        public void setLessThanEqual25kw(Boolean lessThanEqual25kw) {
            this.lessThanEqual25kw = lessThanEqual25kw;
        }
    }

    public class DriverStatedFlags {

        private Boolean excessEndorsements;

        public Boolean getExcessEndorsements() {
            return excessEndorsements;
        }

        public void setExcessEndorsements(Boolean excessEndorsements) {
            this.excessEndorsements = excessEndorsements;
        }
    }

    public class DriverStatus {

        private String code;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }

    public class Disqualification {

        private Date disqFromDate;
        private Date disqToDate;
        private Integer endorsementID;
        private String type;


        public Date getDisqFromDate() {
            return disqFromDate;
        }

        public void setDisqFromDate(Date disqFromDate) {
            this.disqFromDate = disqFromDate;
        }

        public Date getDisqToDate() {
            return disqToDate;
        }

        public void setDisqToDate(Date disqToDate) {
            this.disqToDate = disqToDate;
        }

        public Integer getEndorsementID() {
            return endorsementID;
        }

        public void setEndorsementID(Integer endorsementID) {
            this.endorsementID = endorsementID;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

}

