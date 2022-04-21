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
public class ObradaPolaznik extends ObradaOsoba<Polaznik> {

    @Override
    public List<Polaznik> read() {
        return session.createQuery("from Polaznik").list();
    }
     public List<Polaznik> read(String uvjet) {
        return session.createQuery("from Polaznik p "
                + " where concat(p.ime,' ',p.prezime,' ',ifnull(p.oib,'')) "
                + " like :uvjet order by p.prezime, p.ime")
                .setParameter("uvjet","%" + uvjet + "%")
                .setMaxResults(50)
                .list();
    }
      public List<Polaznik> readPocetakPrezime(String uvjet) {
        return session.createQuery("from Polaznik p "
                + " where p.prezime "
                + " like :uvjet order by p.prezime, p.ime")
                .setParameter("uvjet", uvjet + "%")
                .setMaxResults(50)
                .list();
      }
      
        @Override
    protected void kontrolaCreate() throws EdunovaException {
        super.kontrolaCreate(); 
    }
    
    // @Override
    /*protected void kontrolaDelete() throws EdunovaException {
        if(entitet.getT()!=null && entitet.getGrupe().size()>0){
            throw new EdunovaException("Polaznik ne možete obrisati jer pohađa jednu ili više grupa");
        }
    }*/
}
