/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import java.util.HashMap;
import java.util.Map;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Formation
 */
public class Synthe {
    private boolean on;
    private String instrument;
    private int volume;
    private Synthesizer synth;
    private MidiChannel[] channels;
    private Instrument[] instrus;
    
    public Synthe(boolean on, String instrument, int volume)throws MidiUnavailableException,InterruptedException {
        this.on = on;
        this.instrument = instrument;
        this.volume = volume;
        this.synth = MidiSystem.getSynthesizer();
        this.synth.open();
        this.channels = this.synth.getChannels();
        this.instrus = this.synth.getDefaultSoundbank().getInstruments();
        this.synth.loadAllInstruments(this.synth.getDefaultSoundbank());
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        if(on) this.instrument = instrument;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void onOff(){
        on = !on;
    }
    
    public void volumePlus(){
        if(on) volume++;
    }
    public void volumeMoins(){
        if(on) volume = volume>0 ? volume-1 : 0;
    }
    
    public void note(String note){
        if(on) System.out.println(note);
    }
    
    public void sound(int channel, int note, int instrument1, int instrument2, int bazar)throws MidiUnavailableException,InterruptedException{
        channels[channel].programChange(instrument1, instrument2);
        channels[channel].noteOn(note,bazar);
    }
    
    public void melodie(String s1,String s2) throws MidiUnavailableException,InterruptedException{
        String s11[]=s1.split(" ");
        String s22[]=s2.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("do1",60);
        map.put("re",62);
        map.put("mi",64);
        map.put("fa",65);
        map.put("sol",67);
        map.put("la",69);
        map.put("si",71);
        map.put("do2",72); 
        
        for(int i=0;i<s11.length;i++){
            sound(4, map.get(s11[i]), 640,124, 100);
            sound(5, map.get(s22[i]), 0,118, 1000);
            sound(6, map.get(s22[i]), 640,125, 1000);
            sound(7, map.get(s22[i]), 384,123, 1000);
            
            Thread.sleep(1000);
        }

    }
}
