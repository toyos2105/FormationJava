/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class CollectionTest {

    //@Test
    public void ListTest1(){
         
        ArrayList<String> listeFilms = new ArrayList();
        listeFilms.add("Dracula");
        listeFilms.add("Matrix");
        listeFilms.add("Winnie l'ourson");

        for(int i = 0; i < listeFilms.size(); i++){
          System.out.println("donnée à l'indice " + i + " = " + listeFilms.get(i));
        }   
        
        for(String film : listeFilms) 
        {
          System.out.println(" => " + film);
        }               
    }
    
    @Test
    public void testSommeListeBelgiqueFranceListeEspagneItalieEgal4Elements(){
         
        ArrayList<String> ListeBelgiqueFrance = new ArrayList();
        ArrayList<String> ListeEspagneItalie = new ArrayList();
        ArrayList<String> ListeBelgiqueFranceListeEspagneItalie = new ArrayList();
        ListeBelgiqueFrance.add("Belgique");
        ListeBelgiqueFrance.add("France");
        ListeEspagneItalie.add("Espagne");
        ListeEspagneItalie.add("Italie");
        Assert.assertEquals(0, ListeBelgiqueFranceListeEspagneItalie.size());
        ListeBelgiqueFranceListeEspagneItalie.addAll(ListeBelgiqueFrance);
        Assert.assertEquals(2, ListeBelgiqueFranceListeEspagneItalie.size());
        ListeBelgiqueFranceListeEspagneItalie.addAll(ListeEspagneItalie);
        Assert.assertEquals(4, ListeBelgiqueFranceListeEspagneItalie.size()); 
    }
}

