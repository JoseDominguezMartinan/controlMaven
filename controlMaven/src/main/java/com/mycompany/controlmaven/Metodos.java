/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlmaven;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


/**
 *
 * @author jdominguezmartinan
 */
public class Metodos 
{
    public String temp() throws IOException{
       Document doc=Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
       Element link=doc.select("<div.today_nowcard-temp").first();
       String temperatura=link.text();
       return temperatura;
     
  
            
}
    public String fraseT(){
    org.jsoup.nodes.Document doc=Jsoup.parse("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP");
    Element lin2=(Element) doc.select("div.today_nowcard-phrase").first();
     String frase=lin2.text();
     return frase;
}
}
