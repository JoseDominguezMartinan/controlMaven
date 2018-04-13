/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlmaven;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author jdominguezmartinan
 */
public class controlMaven
{
   public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        Metodos obxmet=new Metodos();
        String temperatura=obxmet.temp();
        String frase=obxmet.fraseT();
        JOptionPane.showMessageDialog(null,"La temperatura en vigo es "+temperatura);
        JOptionPane.showMessageDialog(null,frase);
    }
}
