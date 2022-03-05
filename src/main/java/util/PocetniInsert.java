/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import com.github.javafaker.Faker;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.hibernate.Session;
import model.Polaznik;
import model.Trener;
import model.Trening;

/**
 *
 * @author patri
 */
public class PocetniInsert {
    
    public static void izvedi(){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Faker faker = new Faker();
        List<Polaznik> polaznici = generirajPolaznike(faker, session);
        List<Trener> treneri = generirajTrenere(faker, session);
        Trening t;
        Trener tr;
        for(int i = 0; i < treneri.size() - 2;i++){
            tr = treneri.get(i);
        for(int j = 0; j < ((int) Math.random() * (5 - 2) + 2);j++)    {
            t = new Trening();
            t.setTrener(tr);
            t.setNaziv(faker.animal().name());
            t.setPolaznik(polaznici.get((int) Math.random() * (polaznici.size() - 1)));
            t.setCijena(new BigDecimal(Math.random() * (1000 - 500) + 500));
            Collections.shuffle(polaznici);
           session.save(t);
           System.out.println("Kreirao trening " + t.getNaziv());
        }
        }
        
        
        session.getTransaction().commit();
    }
    
    private static List<Polaznik> generirajPolaznike(Faker faker, Session session){
        List<Polaznik> polaznici = new ArrayList();
        Polaznik p;
        for(int i = 0; i<300; i++){
            p = new Polaznik();
            p.setIme(faker.name().firstName());
            p.setPrezime(faker.name().lastName());
            p.setOib(EdunovaUtil.generirajOib());
            p.setBrojkartice("");
            session.save(p);
            polaznici.add(p);
            System.out.println("Kreirao polaznika: " + p.getIme() + " " + p.getOib());
        }
        return polaznici;
    }
    
    private static List<Trener> generirajTrenere(Faker faker, Session session){
        List<Trener> treneri = new ArrayList();
        Trener t;
        for(int i = 0; i<10;i++){
            t = new Trener();
            t.setIme(faker.name().firstName());
            t.setPrezime(faker.name().lastName());
            t.setOib(EdunovaUtil.generirajOib());
            t.setBrojkartice("");
            t.setIban("");
            t.setPlaca(new BigDecimal(Math.random() * (10000 - 5000) + 5000));
            session.save(t);
            treneri.add(t);
            System.out.println("Kreirao trenera " + t.getIme() + " " + t.getOib());
        }
        return treneri;
    }
    
    
    
}
