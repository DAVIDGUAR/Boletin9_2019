/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Empleado {
    
    private double sueldo;
   
    private boolean a=true;
    private double vueltas=0;
    private double sueldos_bajo=0;
private double sueldos_medios=0;
    public Empleado() {
    }
    
    
    public void comprobar_sueldo(){
        
        while(a){
            
        
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("Introduce sueldo"));
            
            
            if (sueldo<1000 && sueldo>0){
                
                sueldos_bajo++;
                vueltas++;
                
            }else if (sueldo>=1000 && sueldo<=1750){
                
                vueltas++;
                sueldos_medios++;
                
            }else if (sueldo>1750){
                
                vueltas++;
                
                
            }else if (sueldo<0){
                
                System.out.println("Sueldo incorrecto");
                
                
            } if (sueldo==0){
                
                a= false;
            }
            
            
            
        }
        
        double operacion= (sueldos_bajo*100)/vueltas;
        
        System.out.println("Total salarios comprobados = "+vueltas+"\nSalarios inferiores a 1000€ = "+ sueldos_bajo);
        System.out.println("Salarios entre 1000€ y 1750€ (ambos incluidos) = "+sueldos_medios);
        System.out.println("Porcentaje salarios inferiores a 1000 = "+operacion+"%");
    }
    
    
    
}
