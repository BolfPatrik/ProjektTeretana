/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Trener;
import nl.garvelink.iban.IBAN;
import util.EdunovaException;
import util.OibValidation;

/**
 *
 * @author patri
 */
public class ObradaTrener extends Obrada<Trener>{

    @Override
    public List<Trener> read() {
         return session.createQuery("from Trener").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaOib();
        kontrolaIBAN();
        
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    } 
   private void kontrolaOib() throws EdunovaException{
        if (!OibValidation.checkOIB(entitet.getOib())) {
            throw new EdunovaException("OIB nije formalno ispravan");
        }
    }  
private void kontrolaIBAN() throws EdunovaException {
        if (entitet.getIban() == null) {
            throw new EdunovaException("Obavezno IBAN");
        }
        try {
            IBAN iban = IBAN.valueOf(entitet.getIban());
            if (!iban.isSEPA()) {
                throw new EdunovaException("IBAN nije ispravan");
            }
        } catch (Exception e) {
            throw new EdunovaException("IBAN nije ispravan");
        }
}
    
}
