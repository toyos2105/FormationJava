/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Serie;
import org.junit.Test;

/**
 * @author Formation
 */
public class SerieTest {

    @Test
    public void NouveauSerie(){
        Serie s1 = new Serie("Les Simpsons","Quanta autem vis amicitiae sit, ex hoc intellegi maxime potestnis.",29,1989);
        Serie s2 = new Serie("Les feux de l'amour","Alii nullo quaerente vultus severitate adsimulata patrimonia sua in inmensum extollunt.",45,1973);

        s1.affiche();
        s2.affiche();
        
    }
}
