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
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Trener extends Osoba{
    @Column(columnDefinition = "varchar(20)")
    private String iban;
    @Column(columnDefinition = "decimal(18,2)")
    private BigDecimal placa;
    @OneToMany(mappedBy = "trener")
    private List<Trening> treninzi;
   @ManyToMany
   private List<Polaznik> polaznici;
    

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public List<Trening> getTreninzi() {
        return treninzi;
    }

    public void setTreninzi(List<Trening> treninzi) {
        this.treninzi = treninzi;
    }

    public List<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(List<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }

    public BigDecimal getPlaca() {
        return placa;
    }

    public void setPlaca(BigDecimal placa) {
        this.placa = placa;
    }
    
}
   
	