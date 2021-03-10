/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class mVentas {
    double ventas[][];
    int nv;  //Número de vendedores
    int nm; //Número de meses
    
    mVentas(){
        nv = Integer.parseInt(JOptionPane.showInputDialog(
        "Entre el número de vendedores: "));
        nm = Integer.parseInt(JOptionPane.showInputDialog(
        "Entre el número de meses: "));
        ventas = new double[nv][nm];
    }
    
    public void setLlenar( ){
        int i, j;
        for(i=0; i<nv; i++){
            for(j=0; j<nm; j++){
                ventas[i][j] = Double.parseDouble(
                JOptionPane.showInputDialog(
                "Entre el valor de venta del vendedor "+i
                +" en el mes "+j+":"));
            }
        }
    }
    
    public void getMostrarV( ){
        int i, j;
        String info="La matriz de ventas es: \n";
        for(i=0; i<nv; i++){
            for(j=0; j<nm; j++){
                info+="("+ventas[i][j]+")";
            }
            info+="\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }
}
