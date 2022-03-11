/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Polaznik;
import util.EdunovaException;
import util.OibValidation;

/**
 *
 * @author patri
 */
public class ObradaPolaznik extends Obrada<Polaznik>{

    @Override
    public List<Polaznik> read() {
      return session.createQuery("from Polaznik").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
    kontrolaOib();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
       
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        if(entitet.getTreninzi()!=null && entitet.getTreninzi().size()>0){
        throw new EdunovaException("Polaznika ne možete obrisati jer pripada jednom ili više treninga");
    }
      
    }
    private void kontrolaOib() throws EdunovaException{
        if (!OibValidation.checkOIB(entitet.getOib())) {
            throw new EdunovaException("OIB nije formalno ispravan");
        }
    }  
}
