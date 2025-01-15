package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mafrit05_Emissions", schema = "dbo")
public class EmissionEntry {

    @Id
    @Column(name = "Country")
    private String country;

    @Column(name = "ISO_3166_1_alpha_3")
    private String iso3166_1Alpha3;

    @Column(name = "Year")
    private String year;

    @Column(name = "Total")
    private String total;

    @Column(name = "Coal")
    private String coal;

    @Column(name = "Oil")
    private String oil;

    @Column(name = "Gas")
    private String gas;

    @Column(name = "Cement")
    private String cement;

    @Column(name = "Flaring")
    private String flaring;

    @Column(name = "Other")
    private String other;

    @Column(name = "Per_Capita")
    private String perCapita;

    @Override
    public String toString() {
        return "EmissionEntry{" +
                "country='" + country + '\'' +
                ", iso3166_1Alpha3='" + iso3166_1Alpha3 + '\'' +
                ", year='" + year + '\'' +
                ", total='" + total + '\'' +
                ", coal='" + coal + '\'' +
                ", oil='" + oil + '\'' +
                ", gas='" + gas + '\'' +
                ", cement='" + cement + '\'' +
                ", flaring='" + flaring + '\'' +
                ", other='" + other + '\'' +
                ", perCapita='" + perCapita + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIso3166_1Alpha3() {
        return iso3166_1Alpha3;
    }

    public void setIso3166_1Alpha3(String iso3166_1Alpha3) {
        this.iso3166_1Alpha3 = iso3166_1Alpha3;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCoal() {
        return coal;
    }

    public void setCoal(String coal) {
        this.coal = coal;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getCement() {
        return cement;
    }

    public void setCement(String cement) {
        this.cement = cement;
    }

    public String getFlaring() {
        return flaring;
    }

    public void setFlaring(String flaring) {
        this.flaring = flaring;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getPerCapita() {
        return perCapita;
    }

    public void setPerCapita(String perCapita) {
        this.perCapita = perCapita;
    }
}
