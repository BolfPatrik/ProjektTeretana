/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Polaznik extends Osoba{
    @Column(columnDefinition = "varchar(7)")
    private String brojkartice;

    public String getBrojkartice() {
        return brojkartice;
    }

    public void setBrojkartice(String brojkartice) {
        this.brojkartice = brojkartice;
    }

    
    
}
