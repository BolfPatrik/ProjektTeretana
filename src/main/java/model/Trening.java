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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;



@Entity
public class Trening extends Entitet{
        @Column(columnDefinition = "varchar(50) NOT NULL")
	private String naziv;
        @Column(columnDefinition = "varchar(50)")
	private String vrijemepocetka;
        @Column(columnDefinition = "varchar(50)")
	private String vrijemekraja;
        @Column(columnDefinition = "decimal(18,2)")
	private BigDecimal cijena;
        @ManyToOne
        private Polaznik polaznik;
        
        @ManyToOne
        private Trener Trener;

	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getVrijemepocetka() {
		return vrijemepocetka;
	}
	public void setVrijemepocetka(String vrijemepocetka) {
		this.vrijemepocetka = vrijemepocetka;
	}
	public String getVrijemekraja() {
		return vrijemekraja;
	}
	public void setVrijemekraja(String vrijemekraja) {
		this.vrijemekraja = vrijemekraja;
	}
	public BigDecimal getCijena() {
		return cijena;
	}
	public void setCijena(BigDecimal cijena) {
		this.cijena = cijena;
	}

    public Polaznik getPolaznik() {
        return polaznik;
    }

    public void setPolaznik(Polaznik polaznik) {
        this.polaznik = polaznik;
    }

    public Trener getTrener() {
        return Trener;
    }

    public void setTrener(Trener Trener) {
        this.Trener = Trener;
    }
	
	
	
	
	
}
