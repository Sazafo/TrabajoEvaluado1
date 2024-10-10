/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerapracticaeevaluada;

import javax.swing.JOptionPane;

/**
 *
 * @author sazaf
 */
public class PrimeraPracticaeEvaluada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    //Definir primero los string 
    String cantidadTrabajadores= "";
    String SalarioTrabajador= "";
    double SalarioTrabajorDouble= 0;
    double SEM=0;
    double IVM=0;
    double IVMSEM=0;
    double totalpagarCCSS=0;
 
 //Solicitar la cantidad de empleados que tenga la empresa 
 cantidadTrabajadores= JOptionPane.showInputDialog("Ingrese la cantidad de trabajadores que tiene la empresa:");
 int numTrabajadores= Integer.parseInt(cantidadTrabajadores);
 
 
 //Utilizar For como estructura de repeticion
        for (int i = 1; i < numTrabajadores; i++) {
            //Solicitar el salario de los trabajadores 
 SalarioTrabajador = JOptionPane.showInputDialog("Digite el salario del trabajador");
 SalarioTrabajorDouble= Double.parseDouble(SalarioTrabajador);
            
        }
  
 //Rubros que debe de pagar la empresa 
 //SEM 9.25%=0.0925
 //IVM 5.08%=0.0508
 
 SEM= SalarioTrabajorDouble * 0.0925;
 IVM= SalarioTrabajorDouble * 0.0508;
 IVMSEM= IVM + SEM;
 
 //Mostrar a la empresa cuanto es lo que le debe de pagar a la CCSS
 JOptionPane.showMessageDialog(null, "La empresa debera de abonar a la CCSS el monto de ₡" + IVMSEM + "por concepto SEM y IVM");
    }
    
}
