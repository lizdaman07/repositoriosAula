/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpunto8;

import javax.swing.JOptionPane;

/**
 *
 * @author Liz
 */
public class TPunto8 {

    /**
     * @param args the command line arguments
     */
    static final int numsecreto=7;
    
    public static void main(String[] args) {
        clave();
    }
    
    public static void clave() {
        int i=3,num;
        while(i<=3){
            num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
           if(num==numsecreto){
             JOptionPane.showMessageDialog(null, "Acceso permitido");
             break;
           }
           if (num!=numsecreto){
             JOptionPane.showMessageDialog(null, "Acceso denegado");
           }
           if(i==1){
             JOptionPane.showMessageDialog(null, "Clave bloqueada");
             break;
           }
           i--;
        }
        
    }
    
}
