/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.Random;
import org.junit.Test;
/**
 *
 * @author Formation
 */
public class TableauTest {
//    @Test
    public void tableau1(){
        String[] tab = new String[170]; 
        tab[0]="Kaboul";
        tab[1]="Pretoria";
        tab[2]="Tirana";
        tab[3]="Alger";
        tab[4]="Berlin";
        tab[5]="Andorre-la-Vieille";
        tab[6]="Riyad";
        tab[7]="Buenos Aires";
        tab[8]="Erevan";
        tab[9]="Camberra";
        tab[10]="Vienne";
        tab[11]="Bakou";
        tab[12]="Nassau";
        tab[13]="Manama";
        tab[14]="Daccan";
        tab[15]="Bridgetown";
        tab[16]="Bruxelles";
        tab[17]="Belmopa";
        tab[18]="Cotonou";
        tab[19]="Minsk";
        tab[20]="Rangoun";
        tab[21]="La Paz";
        tab[22]="Sarajevo";
        tab[23]="Gaborone";
        tab[24]="Brasilia";
        tab[25]="Sofia";
        tab[26]="Ouagadougou";
        tab[27]="Bujumbura";
        tab[28]="Phnom Penh";
        tab[29]="Yaoundé";
        tab[30]="Ottawa";
        tab[31]="Bangui";
        tab[32]="Santiago";
        tab[33]="Pékin";
        tab[34]="Nicosie";
        tab[35]="Bogota";
        tab[36]="Moroni";
        tab[37]="Pyongyang";
        tab[38]="Séoul";
        tab[39]="San José";
        tab[40]="Yamoussoukro";
        tab[41]="Zagreb";
        tab[42]="La Havane";
        tab[43]="Copenhague";
        tab[44]="Djibouti";
        tab[45]="Le Caire";
        tab[46]="Abou Dhabi";
        tab[47]="Quito";
        tab[48]="Asmara";
        tab[49]="Madrid";
        tab[50]="Tallinn";
        tab[51]="Washington";
        tab[52]="Addis Abeba";
        tab[53]="Suva";
        tab[54]="Helsinki";
        tab[55]="Paris";
        tab[56]="Libreville";
        tab[57]="Banjul";
        tab[58]="Tbilissi";
        tab[59]="Accra";
        tab[60]="Athènes";
        tab[61]="Guatemala";
        tab[62]="Conakry";
        tab[63]="Malabo";
        tab[64]="Bissau";
        tab[65]="Georgetown";
        tab[66]="Port-au-Prince";
        tab[67]="Tegucigalpa";
        tab[68]="Budapest";
        tab[69]="New Delhi";
        tab[70]="Jakarta";
        tab[71]="Bagdad";
        tab[72]="Téhéran";
        tab[73]="Dublin";
        tab[74]="Reykjavik";
        tab[75]="Rome";
        tab[76]="Kingston";
        tab[77]="Tokyo";
        tab[78]="Amman";
        tab[79]="Astana Almaty";
        tab[80]="Nairobi";
        tab[81]="Bichkek";
        tab[82]="Koweït";
        tab[83]="Vientiane";
        tab[84]="Riga";
        tab[85]="Beyrouth";
        tab[86]="Monrovia";
        tab[87]="Tripoli";
        tab[88]="Vaduz";
        tab[89]="Vilnius";
        tab[90]="Luxembourg";
        tab[91]="Skopje";
        tab[92]="Antananarivo";
        tab[93]="Kuala Lumpur";
        tab[94]="Lilongwe";
        tab[95]="Malé";
        tab[96]="Bamako";
        tab[97]="La Valette";
        tab[98]="Rabat";
        tab[99]="Nouakchott";
        tab[100]="Mexico";
        tab[101]="Chisinau";
        tab[102]="Monaco";
        tab[103]="Oulan-Bator";
        tab[104]="Podgorica";
        tab[105]="Maputo";
        tab[106]="Katmandou";
        tab[107]="Managua";
        tab[108]="Niamey";
        tab[109]="Abuja";
        tab[110]="Oslo";
        tab[111]="Wellington";
        tab[112]="Mascate";
        tab[113]="Kampala";
        tab[114]="Tachkent";
        tab[115]="Islamabad";
        tab[116]="Panama";
        tab[117]="Port Moresby";
        tab[118]="Asunción";
        tab[119]="Amsterdam";
        tab[120]="Lima";
        tab[121]="Manille";
        tab[122]="Varsovie";
        tab[123]="Lisbonne";
        tab[124]="Doha";
        tab[125]="Kinshasa";
        tab[126]="Saint-Domingue";
        tab[127]="Prague";
        tab[128]="Bucarest";
        tab[129]="Londres";
        tab[130]="Moscou";
        tab[131]="Kigali";
        tab[132]="San Salvador";
        tab[133]="Apia";
        tab[134]="Sao Tomé";
        tab[135]="Dakar";
        tab[136]="Belgrade";
        tab[137]="Victoria";
        tab[138]="Freetown";
        tab[139]="Singapour";
        tab[140]="Bratislava";
        tab[141]="Ljubljana";
        tab[142]="Mogadiscio";
        tab[143]="Khartoum";
        tab[144]="Colombo";
        tab[145]="Stockholm";
        tab[146]="Berne";
        tab[147]="Paramaribo";
        tab[148]="Mbabane";
        tab[149]="Damas";
        tab[150]="Douchanbé";
        tab[151]="Dar es Salam";
        tab[152]="Ndjamena";
        tab[153]="Bangkok";
        tab[154]="Lhassa";
        tab[155]="Lomé";
        tab[156]="Nuku\"alofa";
        tab[157]="Port of Spain";
        tab[158]="Tunis";
        tab[159]="Achgabat";
        tab[160]="Ankara";
        tab[161]="Funafuti";
        tab[162]="Kiev";
        tab[163]="Montevideo";
        tab[164]="Port-Vila";
        tab[165]="Caracas";
        tab[166]="Hanoï";
        tab[167]="Sanaa";
        tab[168]="Lusaka";
        tab[169]="Harare";

        for(int i=0;i<tab.length;i++)
            System.err.println(i+" - "+tab[i]);
        for (String s : tab) {
            System.err.println(" - "+s);
        }
            
    }
 
    @Test
    public void tableau2(){
        int tab[] = new int[10];
        for (int i=0;i<tab.length;i++)
        {
            Random rand = new Random();
            int n=rand.nextInt(20) + 1;
            tab[i] = n;
        }
        
        VariablesTest vTest = new VariablesTest();
        
        for (int i : tab)
            System.out.println(i+" - "+vTest.carre(i, 2));
    }
    
    
}
