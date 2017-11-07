/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import java.lang.reflect.Field;
import java.util.Objects;
import java.util.logging.Logger;
/**
 *
 * @author Formation
 */
public class Serie {
    private String titre;
    private String synopsis;
    private int nbSaisons;
    private int anneeSortie;
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getNbSaisons() {
        return nbSaisons;
    }

    public void setNbSaisons(int nbSaisons) {
        this.nbSaisons = nbSaisons;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }
    
    public void affiche(){
        System.out.println( this );
    }

    public Serie(String titre, String synopsis, int nbSaisons, int anneeSortie) {
        this.titre = titre;
        this.synopsis = synopsis;
        this.nbSaisons = nbSaisons;
        this.anneeSortie = anneeSortie;
    }
    
    @Override
    public String toString() {
        return this.getTitre()+"\n"+this.getNbSaisons()+"\n"+this.getAnneeSortie()+"\n"+this.getSynopsis();
    }
 
}
