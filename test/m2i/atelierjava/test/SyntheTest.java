/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.sound.midi.MidiUnavailableException;
import junit.framework.Assert;
import m2i.atelierjava.entite.Synthe;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SyntheTest{
    
    @Test
    public void testAlumerOn0ffOK() throws MidiUnavailableException,InterruptedException{
        Synthe synthe = new Synthe(false,"",5);
        Assert.assertFalse(synthe.isOn());
        synthe.setOn(true);
        Assert.assertTrue(synthe.isOn());
        synthe.setOn(false);
        Assert.assertFalse(synthe.isOn());
    }
    
    @Test
    public void SyntheTest() throws MidiUnavailableException,InterruptedException {
        Synthe synthe = new Synthe(false,"",5);
        Assert.assertFalse(synthe.isOn());
        synthe.setOn(true);
        Assert.assertTrue(synthe.isOn());
        synthe.volumeMoins();
        
        synthe.setInstrument("piano");
        String txt = String.format("On = %s\nVolume = %d\nInstrument = %s\n\n",synthe.isOn(),synthe.getVolume(),synthe.getInstrument());
        System.out.println(txt);
        synthe.volumeMoins();
        synthe.volumeMoins();
        synthe.setInstrument("violon");
//        txt = String.format("On = %s\nVolume = %d\nInstrument = %s\n\n",synthe.isOn(),synthe.getVolume(),synthe.getInstrument());
//        System.out.println(txt);
        
        synthe.melodie("do1 re mi fa sol la si do2","do1 re mi fa sol la si do2");
 
        
    }
    
}
