/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.Polaznik;

/**
 *
 * @author patri
 */
public class PrikazPolaznik extends JLabel implements ListCellRenderer<Polaznik>{
    
    public PrikazPolaznik(){
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Polaznik> list, Polaznik value, int index, boolean isSelected, boolean cellHasFocus) {
        if(isSelected){
            setBackground(Color.BLUE);
            setBackground(Color.WHITE);
        }
        else{
            setBackground(Color.WHITE);
            setBackground(Color.BLACK);
        }
        setText((value.getIme()==null ? "Nepoznato" : value.getIme()) + " " + (value.getPrezime()==null ? "Nepoznato" : value.getPrezime()));
        return this;
    }
    
}
