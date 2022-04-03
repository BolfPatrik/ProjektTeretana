/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova;

import controller.ObradaTrening;
import java.util.List;
import model.Trening;
import org.hibernate.Session;
import util.HibernateUtil;
import util.PocetniInsert;
import view.SplashScreen;

/**
 *
 * @author patri
 */
public class Start {
    private Session session;
    
    public Start(){
    }
    
    /*private void UcitavanjePodataka(){
        List<Trening> treninzi = new ObradaTrening().read();
        
        for(Trening t : treninzi){
            System.out.println(t.getNaziv() + " " + t.getTrener().getIme() + " " + t.getTrener().getPrezime() 
                    + ": " + t.getPolaznik().getIme() + t.getPolaznik().getPrezime());
        }
    }
    */
    public static void main(String[] args) {  
         //PocetniInsert.unosOperatera();
      new SplashScreen().setVisible(true);   
      PocetniInsert.insertPolaznika();
     
    }
}
