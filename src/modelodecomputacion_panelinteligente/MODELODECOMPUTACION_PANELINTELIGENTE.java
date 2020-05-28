/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelodecomputacion_panelinteligente;

import java.util.Scanner;

/**
 *
 * @author Lenin Iñacaza
 */
public class MODELODECOMPUTACION_PANELINTELIGENTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L\n");
        System.out.println("MODELO DE COMPUTACION-CASO PRACTICO-ROBOTS EN LA INDUSTRIA AUTOMOTRIZ-PANEL INTELEGENTE\n");
        System.out.println("GRUPO #2\n");
        
        System.out.println("\nADMINISTRADOR DE NIVEL DE CAMPO:");
        String one =objeto.nextLine();
        
        System.out.println("\nADMINISTRADOR DEL NIVEL DE CONTROL PLC :");
        String plc =objeto.nextLine();
        
        System.out.println("\nASDMINISTRADOR DE NIVEL DE SUPERVICION:");
        String siperv =objeto.nextLine();
        
        System.out.println("\nASDMINISTRADOR DE NIVEL MES:");
        String mes =objeto.nextLine();
        
        System.out.println("\nADMINISTRADOR DE NIVEL DE ERP:");
        String erp =objeto.nextLine();
       
        System.out.println("\nIMPRIMIR REPORTES" +one+"\n" + plc + "\n"+siperv+ "\n" +mes+"\n"+erp);
        
        
        
      
        
        
        
        
        
        
        
        
    }
    
}
