/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Formation
 */
public class Vehicule {
    protected String marque; 
    protected String modele;
    protected boolean utilitaire;
    protected String couleur;
    protected int nbPlaces;
    protected int x,y,z;
    protected int pas;

    public Vehicule() {
    }

    public Vehicule(String marque, String modele, boolean utilitaire, String couleur, int nbPlaces, int x, int y, int z, int vitesse) {
        this.marque = marque;
        this.modele = modele;
        this.utilitaire = utilitaire;
        this.couleur = couleur;
        this.nbPlaces = nbPlaces;
        this.x = x;
        this.y = y;
        this.z = z;
        this.pas = vitesse;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public boolean isUtilitaire() {
        return utilitaire;
    }

    public void setUtilitaire(boolean utilitaire) {
        this.utilitaire = utilitaire;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getPas() {
        return pas;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }
    
    public void afficher(){
        String txt = String.format("Véhicule :\n\tMarque = %s \n\tUtilitaire = %s \n\tModele = %s \n\tCouleur = %s\n\tPlaces = %d\n\tCoord = [%d , %d , %d]\n\tPas = %d",
                    this.marque, this.utilitaire, this.modele, this.couleur, this.nbPlaces, this.x, this.y, this.z, this.pas);
                
        System.out.println(txt);
    }
    
    public void avancer(){
        y+=pas;
    }
    
    public void reculer(){
        y-=pas;
    }

}