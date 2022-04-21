/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author patri
 */
import java.util.List;
import model.Trening;
import util.EdunovaException;

/**
 *
 * @author patri
 */
public class ObradaTrening extends Obrada<Trening>{

    @Override
    public List<Trening> read() {
       return session.createQuery("from Trening").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaTrener();
       
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
     kontrolaCreate();
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
      /* if(entitet.getPolaznici()!=null && !entitet.getPolaznici().isEmpty()){
            throw new EdunovaException("Ne možete obrisati grupu dok su na njoj polaznici");
        }*/
    }
   private void kontrolaTrener() throws EdunovaException {
        if (entitet.getTrener() == null || entitet.getTrener().getSifra().equals(Long.valueOf(0))) {
            throw new EdunovaException("Obavezno odabir trenera");
        }
    }
}