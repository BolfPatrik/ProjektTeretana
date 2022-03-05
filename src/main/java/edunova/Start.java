/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova;

import org.hibernate.Session;
import util.HibernateUtil;
import view.SplashScreen;

/**
 *
 * @author patri
 */
public class Start {
    private Session session;
    
    public Start(){
         this.session = HibernateUtil.getSession();
    }
    
    public static void main(String[] args) {
      new Start();
      new SplashScreen().setVisible(true);
    }
}
