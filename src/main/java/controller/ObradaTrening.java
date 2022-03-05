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
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
    }
}