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
public class Operater extends Osoba{
    @Column(columnDefinition = "varchar(50) NOT NULL")
    private String lozinka;
    @Column(columnDefinition = "varchar(50) NOT NULL")
    private String uloga;
    
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
