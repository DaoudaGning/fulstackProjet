package org.gning.api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Appartement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adresse;
    private int nombreDeChambres;
    private int nombreDeSallesDeBain;
    private int nombreDeSalons;
    private boolean cuisineEquipee;
    private String autresCommodites;

 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNombreDeChambres() {
        return nombreDeChambres;
    }

    public void setNombreDeChambres(int nombreDeChambres) {
        this.nombreDeChambres = nombreDeChambres;
    }

    public int getNombreDeSallesDeBain() {
        return nombreDeSallesDeBain;
    }

    public void setNombreDeSallesDeBain(int nombreDeSallesDeBain) {
        this.nombreDeSallesDeBain = nombreDeSallesDeBain;
    }

    public int getNombreDeSalons() {
        return nombreDeSalons;
    }

    public void setNombreDeSalons(int nombreDeSalons) {
        this.nombreDeSalons = nombreDeSalons;
    }

    public boolean isCuisineEquipee() {
        return cuisineEquipee;
    }

    public void setCuisineEquipee(boolean cuisineEquipee) {
        this.cuisineEquipee = cuisineEquipee;
    }

    public String getAutresCommodites() {
        return autresCommodites;
    }

    public void setAutresCommodites(String autresCommodites) {
        this.autresCommodites = autresCommodites;
    }
}
