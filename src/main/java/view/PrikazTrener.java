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
import model.Trener;

/**
 *
 * @author patri
 */
public class PrikazTrener extends JLabel implements ListCellRenderer<Trener>{
    
    
    public PrikazTrener(){
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Trener> list, Trener value, int index, boolean isSelected, boolean cellHasFocus) {
        if(isSelected){
            setBackground(Color.BLUE);
            setBackground(Color.WHITE);
        }
        else{
            setBackground(Color.WHITE);
            setBackground(Color.BLACK);
        }
        setText((value.getIme()==null ? "Nepoznato" : value.getIme()=="" ? "XXXXXXX" : value.getIme()) + " " +
                (value.getPrezime()==null ? "Nepoznato" : value.getPrezime()));
        return this;
    }

   
}
