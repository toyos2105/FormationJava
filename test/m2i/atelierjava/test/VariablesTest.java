/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */

public class VariablesTest {    

    private void Affiche(String s){
        System.out.println(s);
    }

    public int carre(int nombre, int puissance) {
        int res=1;
        for(int i=0;i<puissance;i++)
                res=res*nombre;
        return res;
    }
    
    public int puissance(int nombre, int p) {
        if (p == 0)
            return 1;    
        return nombre*puissance(nombre,p-1);
    }
    
    public int factorielle(int nombre) {
        if (nombre == 1)
            return 1;    
        return nombre*factorielle(nombre-1);
    }
    
    @Test
    public void testVariablesObjets1(){ 
        String text1 = new String("couCOU");
        Affiche(text1);
        Affiche(text1.toUpperCase());
        Affiche(String.valueOf(text1.lastIndexOf("C")));
    }
    
    @Test
    public void testVariablesObjets2(){ 
        String a = new String("Jamaïque");
        String b = new String("Kingston");
        String c = b.toUpperCase() + ", " + a.toUpperCase();
        Affiche(a);
        Affiche(b);
        Affiche(c);
    }
    
    @Test
    public void testVariablesObjets3(){ 
        int a = 123;
        String b = new String("COUCOU");
        String c = a + b;
        String d = b + a;
        Affiche(String.valueOf(a));
        Affiche(b);
        Affiche(c);
        Affiche(d);
    }
    
    @Test
    public void testVariablesObjets4(){ 
        int a = 10;
        String b = new String("20");
        int c = a + Integer.parseInt(b);
        int d = Integer.parseInt(b) + a;
        Affiche(String.valueOf(a));
        Affiche(String.valueOf(b));
        Affiche(String.valueOf(c));
        Affiche(String.valueOf(d));
        Affiche("Puissance = "+String.valueOf(puissance(2,4)));
        
        try {
         Affiche("Factorielle = "+String.valueOf(factorielle(4)));
        } catch(StackOverflowError t) {
            System.out.println("Ca merde ");
            
        }
    }
}
