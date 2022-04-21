/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author patri
 */
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;



@Entity
public class Trening extends Entitet{
    @Column(columnDefinition = "varchar(50) NOT NULL")
    private String naziv;
    @Column(columnDefinition = "datetime")
    private Date datumpocetka;
     @Column(columnDefinition = "decimal(18,2) ")
    private BigDecimal cijena;
    
    @ManyToOne
    private Trener trener;
    
    @ManyToOne
    private Polaznik polaznik;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatumpocetka() {
        return datumpocetka;
    }

    public void setDatumpocetka(Date datumpocetka) {
        this.datumpocetka = datumpocetka;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Trener getTrener() {
        return trener;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }

    public Polaznik getPolaznik() {
        return polaznik;
    }

    public void setPolaznik(Polaznik polaznik) {
        this.polaznik = polaznik;
    }   
  
    @Override
    public String toString() {
        return naziv;
    }		
	
}
