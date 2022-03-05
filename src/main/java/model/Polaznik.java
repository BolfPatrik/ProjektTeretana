/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Polaznik extends Entitet{
    @Column(columnDefinition = "varchar(50) NOT NULL")
    private String ime;
    @Column(columnDefinition = "varchar(50) NOT NULL")
    private String prezime;
    @Column(columnDefinition = "varchar(11)")
    private String oib;
    @Column(columnDefinition = "varchar(7)")
    private String brojkartice;

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

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getBrojkartice() {
        return brojkartice;
    }

    public void setBrojkartice(String brojkartice) {
        this.brojkartice = brojkartice;
    }

   
}
