package com.satellite_api_master.satellite_catalog.model;
import javax.persistence.*;

@Entity
@Table(name = "satellite_catalog",catalog = "satellite_db")
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long satelliteId;
    private String satelliteName;
    private String operator;
    private String country;
    private String sector;
    private String purpose;
    private String primeContractor;
    private String launchDate;
    private String status;
    public Catalog(){
        super();
    }

    public Catalog(long satelliteId, String satelliteName, String operator, String country,
                   String sector, String purpose, String primeContractor,
                   String launchDate, String status) {
        this.satelliteId = satelliteId;
        this.satelliteName = satelliteName;
        this.operator = operator;
        this.country = country;
        this.sector = sector;
        this.purpose = purpose;
        this.primeContractor = primeContractor;
        this.launchDate = launchDate;
        this.status = status;
    }

    public long getSatelliteId() {
        return satelliteId;
    }

    public void setSatelliteId(long satelliteId) {
        this.satelliteId = satelliteId;
    }

    public String getSatelliteName() {
        return satelliteName;
    }

    public void setSatelliteName(String satelliteName) {
        this.satelliteName = satelliteName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPrimeContractor() {
        return primeContractor;
    }

    public void setPrimeContractor(String primeContractor) {
        this.primeContractor = primeContractor;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) { this.status = status; }



}
