/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import model.Polaznik;

/**
 *
 * @author patri
 */
public class PolaznikComparator implements Comparator<Polaznik> {

    private Collator hr;

    public PolaznikComparator() {
        System.out.println("Napravio instancu Collator");
        hr = Collator.getInstance(new Locale("hr", "HR")); //Your locale here
        hr.setStrength(Collator.PRIMARY);
    }

    @Override
    public int compare(Polaznik o1, Polaznik o2) {
        return hr.compare(o1.getPrezime(), o2.getPrezime());
    }
}