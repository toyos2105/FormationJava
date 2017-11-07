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
public class SousMarin extends Vehicule{
    private boolean monte;

    public boolean isMonte() {
        return monte;
    }

    public void setMonte(boolean monte) {
        this.monte = monte;
    }

    public SousMarin(String marque, String modele, boolean utilitaire, String couleur, int nbPlaces, int x, int y, int z, int vitesse, boolean monte) {
        super(marque, modele, utilitaire, couleur, nbPlaces, x, y, z, vitesse);
        this.monte = monte;
    }
    

    @Override
    public void avancer() {
        super.avancer(); //To change body of generated methods, choose Tools | Templates.
        if(this.monte)
            this.z = this.z + this.pas/2;
        else this.z = this.z - this.pas/2;
    }

    @Override
    public void reculer() {
        //un SousMarin ne peut pas reculer
        //super.reculer(); //To change body of generated methods, choose Tools | Templates.
        
    }
    
    
    
    
    
    
    
}
