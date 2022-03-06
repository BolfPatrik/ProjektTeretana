/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova;

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
    
    public static void main(String[] args) {    
      new SplashScreen().setVisible(true);
      PocetniInsert.unosOperatera();
    }
}
