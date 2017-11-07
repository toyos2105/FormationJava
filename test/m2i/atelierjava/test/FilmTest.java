/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.text.DateFormat;
import java.util.Date;
import m2i.atelierjava.entite.Film;
import org.junit.Test;




/**
 * @author Formation
 */
public class FilmTest { 
    
    
    @Test
    public void NouveauFilm(){
        Film f1 = new Film("Dracula","Quanta autem vis amicitiae sit, ex hoc intellegi maxime potest, quod ex.",1978,new Date());

        Film f2 = new Film("Kung Fu Panda","Alii nullo quaerente vultus severitate adsimulata patrimoniae.",2014,new Date());

        f1.affiche();
        f2.affiche();
    }
}
