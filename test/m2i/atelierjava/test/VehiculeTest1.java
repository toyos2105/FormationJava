/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Avion;
import m2i.atelierjava.entite.SousMarin;
import m2i.atelierjava.entite.Vehicule;
import org.junit.Test;

/**
 * @author Formation
 */
public class VehiculeTest1 {

//    @Test
    public void testVehicule(){
        Vehicule v1 = new Vehicule("Lexus", "LFA", false, "bleu", 2, 0, 0, 0, 5);
        Vehicule v2 = new Vehicule("Toyota", "Prius", false, "gris", 4, 0, 0, 0, 3);
        Vehicule v3 = new Vehicule("Renault", "Trafic", true, "blanc", 3, 0, 0, 0, 1);
        v1.avancer();
        v2.avancer();
        v3.reculer();
        
        v1.afficher();
        v2.afficher();
        v3.afficher();
        
    }
    
//    @Test
    public void testAvion(){
        Avion a = new Avion("Boeing", "787", false, "yellow", 200, 0, 0, 0, 600);
        a.avancer();
        a.afficher();
        a.avancer();
        a.afficher();
        a.reculer();
        a.afficher();
    }
    
    @Test
    public void sousMarinMonteOK(){
        SousMarin s = new SousMarin("SNLE", "Rubis", false, "yellow", 50, 0, 0, 0, 20,false);

        s.avancer();
        s.afficher();
        s.avancer();
        s.afficher();
        s.setMonte(true);
        s.avancer();
        s.afficher();
        
        java.awt.Toolkit.getDefaultToolkit().beep();
    }
}
