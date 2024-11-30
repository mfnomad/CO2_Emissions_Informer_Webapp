package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emissions")
public class EmissionEntry {
    @Id
    @Column(name = "Country")
    private String country;

    @Column(name = "Abbrev")
    private String abbrev;

    @Column(name = "Year")
    private Long year;

    @Column(name = "Total")
    private float total;

    @Column(name = "From_Coal")
    private float fromCoal;

    @Column(name = "From_Oil")
    private float fromOil;

    @Column(name = "From_Gas")
    private float fromGas;

    @Column(name = "From_Cement")
    private float fromCement;

    @Column(name = "From_Flaring")
    private float fromFlaring;

    @Column(name = "From_Other")
    private float fromOther;

    @Column(name = "Per_Capita")
    private float perCapita;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getFromCoal() {
        return fromCoal;
    }

    public void setFromCoal(float fromCoal) {
        this.fromCoal = fromCoal;
    }

    public float getFromOil() {
        return fromOil;
    }

    public void setFromOil(float fromOil) {
        this.fromOil = fromOil;
    }

    public float getFromGas() {
        return fromGas;
    }

    public void setFromGas(float fromGas) {
        this.fromGas = fromGas;
    }

    public float getFromCement() {
        return fromCement;
    }

    public void setFromCement(float fromCement) {
        this.fromCement = fromCement;
    }

    public float getFromFlaring() {
        return fromFlaring;
    }

    public void setFromFlaring(float fromFlaring) {
        this.fromFlaring = fromFlaring;
    }

    public float getFromOther() {
        return fromOther;
    }

    public void setFromOther(float fromOther) {
        this.fromOther = fromOther;
    }

    public float getPerCapita() {
        return perCapita;
    }

    public void setPerCapita(float perCapita) {
        this.perCapita = perCapita;
    }

    public EmissionEntry(String country, String abbrev, Long year, float total, float fromCoal, float fromOil, float fromGas, float fromCement, float fromFlaring, float fromOther, float perCapita) {
        this.country = country;
        this.abbrev = abbrev;
        this.year = year;
        this.total = total;
        this.fromCoal = fromCoal;
        this.fromOil = fromOil;
        this.fromGas = fromGas;
        this.fromCement = fromCement;
        this.fromFlaring = fromFlaring;
        this.fromOther = fromOther;
        this.perCapita = perCapita;
    }

    @Override
    public String toString() {
        return "EmissionEntry{" +
                "country='" + country + '\'' +
                ", abbrev='" + abbrev + '\'' +
                ", year=" + year +
                ", total=" + total +
                ", fromCoal=" + fromCoal +
                ", fromOil=" + fromOil +
                ", fromGas=" + fromGas +
                ", fromCement=" + fromCement +
                ", fromFlaring=" + fromFlaring +
                ", fromOther=" + fromOther +
                ", perCapita=" + perCapita +
                '}';
    }
}

