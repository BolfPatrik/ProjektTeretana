/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Arrays;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import model.Osoba;
import util.EdunovaException;
import util.OibValidation;

/**
 *
 * @author patri
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T> {
     @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaIme();
        kontrolaOib();
        kontrolaEmail();
        kontrolaPrezime();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {

    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {

    }

    private void kontrolaOib() throws EdunovaException {
        if (!OibValidation.checkOIB(entitet.getOib())) {
            throw new EdunovaException("OIB nije formalno ispravan");
        }
    }

    private void kontrolaEmail() throws EdunovaException {
        try {
            InternetAddress emailAddr = new InternetAddress(entitet.getEmail());
            emailAddr.validate();
        } catch (AddressException ex) {
            throw new EdunovaException("Email nije formalno ispravan");
        }
    }

    private void kontrolaIme() throws EdunovaException {
       char[] nedozvoljeno = {'1','2','.','3','4','5','6','7','8','9'};
       if(entitet.getIme()!=null){
           for(int i=0;i<entitet.getIme().length();i++){
               for(char c: nedozvoljeno){
                   if(entitet.getIme().charAt(i)==c){
                       throw new EdunovaException("Ime ne smije imati jedan od znakova:\n" + 
                               Arrays.toString(nedozvoljeno));
                   }
               }
           }
       }       
    }
     private void kontrolaPrezime() throws EdunovaException {
       char[] nedozvoljeno = {'1','2','.','3','4','5','6','7','8','9'};
       if(entitet.getPrezime()!=null){
           for(int i=0;i<entitet.getPrezime().length();i++){
               for(char c: nedozvoljeno){
                   if(entitet.getPrezime().charAt(i)==c){
                       throw new EdunovaException("Ime ne smije imati jedan od znakova:\n" + 
                               Arrays.toString(nedozvoljeno));
                   }
               }
           }
       }       
    }
}