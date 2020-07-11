/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaq6;

/**
 *
 * @author yasmi
 */
public class ProvaQ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     int valor=0,pos,neg;

       while(valor==0){
       valor= Integer.parseInt(JOptionPane.showInputDialog("Informe um numero, por favor"));

       if(valor>=0){
       pos=valor*2;
       JOptionPane.showMessageDialog(null, "Fim do calculo! ="+pos);
       }
       if(valor<0){
       neg=valor*3;
       JOptionPane.showMessageDialog(null, "Fim do calculo! ="+neg);
       }
}

  
