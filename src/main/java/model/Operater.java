/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author patri
 */
@Entity
public class Operater extends Entitet{
    @Column(columnDefinition = "varchar(50) NOT NULL")
    private String ime;
    @Column(columnDefinition = "varchar(50) NOT NULL")
    private String prezime;
    @Column(columnDefinition = "varchar(50) NOT NULL")
    private String email;
    @Column(columnDefinition = "varchar(30) NOT NULL")
    private String lozinka;
    private String uloga;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getUloga() {
        return uloga;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }
    
    
}
