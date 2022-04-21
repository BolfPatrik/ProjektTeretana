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
public class ObradaTrener  extends ObradaOsoba<Trener>{

@Override
    public List<Trener> read() {
        return session.createQuery("from Trener").list();
    }
     @Override
    protected void kontrolaCreate() throws EdunovaException {
        super.kontrolaCreate();
        kontrolaIBAN();
        kontrolaNoviIban();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        super.kontrolaUpdate(); 
        kontrolaPromjenaIban();
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
    
    private void kontrolaNoviIban()throws EdunovaException{
         List<Trener> lista = session.createQuery("from Trener e "
                + "where e.iban=:iban")
                .setParameter("iban", entitet.getIban()).list();
        
        if(lista!=null && lista.size()>0){
            throw new EdunovaException("IBAN postoji u sustavu, dodijeljen " + lista.get(0).getPrezime());
        }
    }
    
    private void kontrolaPromjenaIban()throws EdunovaException{
         List<Trener> lista = session.createQuery("from Trener e "
                + "where e.iban=:iban and e.sifra!=:id")
                .setParameter("iban", entitet.getIban())
                 .setParameter("id", entitet.getSifra()).list();
        
        if(lista!=null && lista.size()>0){
            throw new EdunovaException("IBAN postoji u sustavu, dodijeljen " + lista.get(0).getPrezime());
        }
    }

    /*@Override
    protected void kontrolaDelete() throws EdunovaException {
        if(entitet.getGrupe()!=null && entitet.getGrupe().size()>0){
            throw new EdunovaException("Predavača ne možete obrisati jer predaje na jednoj ili više grupa");
        }
    }*/
}