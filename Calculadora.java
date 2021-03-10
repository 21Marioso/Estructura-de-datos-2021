/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class Calculadora {

    public static void main(String args[]) {

        int opmedida, opsubmenu;
        double med1, med2;
        String mensaje;

        do {
            opmedida = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Menú principal. \n"
                            + "1. Convertir longitud.  \n"
                            + "2. Convertir volumen.  \n"
                            + "3. Convertir masa. \n"
                            + "4. Convertir área. \n"
                            + "5. Salir. \n"
                            + "Ingrese el número correspondiente a la opción:"
                    ));

            switch (opmedida) {

                case 1:
                    opsubmenu = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "CONVERTIR LONGITUD. \n"
                                    + "1. Pulgadas a Milímetros \n"
                                    + "2. Pies a Metros \n"
                                    + "3. Kilometros a Millas \n"
                                    + "Ingrese el número correspondiente a la opción:"));

                    switch (opsubmenu) {
                        case 1:
                            med1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de Pulgadas a"
                                    + " convertir"));
                            med2 = med1 * 25.40;
                            mensaje = (med1 + "Pulgadas equivalen a " + med2
                                    + "Milímetros");
                            JOptionPane.showMessageDialog(null, mensaje);
                            break;
                        case 2:
                            med1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Pies a "
                                    + "convertir"));
                            med2 = med1/3.2808;
                            mensaje = (med1 + "Pies equivalen a " + med2
                                    + "Metros");
                            JOptionPane.showMessageDialog(null, mensaje);
                            break;
                        case 3:
                            med1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Kilometros a "
                                    + "convertir"));
                            med2 = med1/1.609;
                            mensaje = (med1 + " Kilometros equivalen a " + med2
                                    + "Millas");
                            JOptionPane.showMessageDialog(null, mensaje);
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Error.");
                    }
                    break;

                case 2:
                    opsubmenu = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "CONVERTIR VOLUMEN.\n"
                                    + "1. Litros a Mililitros\n"
                                    + "2. Pies cúbicos a Metros cúbicos \n"
                                    + "3. Pulgadas cúbicas a Metros cúbicos \n"
                                    + "Ingrese el número correspondiente a la opción:"));

                    switch (opsubmenu) {

                        case 1:
                            med1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de Litros  a"
                                    + " convertir"));
                            med2 = med1/0.0010000;
                            mensaje = (med1 + " Litros equivalen a " + med2
                                    + "Mililitros");
                            JOptionPane.showMessageDialog(null, mensaje);
                            break;
                        case 2:
                            med1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Pies cúbicos a "
                                    + "convertir"));
                            med2 = med1/35.315;
                            mensaje = (med1 + "Pies cúbicos equivalen a " + med2
                                    + "Metros cúbicos");
                            JOptionPane.showMessageDialog(null, mensaje);
                            break;
                        case 3:
                            med1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Pulgadas cúbicas a "
                                    + "convertir"));
                            med2 = med1/61023;
                            mensaje = (med1 + " Pulgadas cúbicas equivalen a " + med2
                                    + "Metros cúbicos");
                            JOptionPane.showMessageDialog(null, mensaje);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Error.");
                    }
                    break;
                case 3:
                    opsubmenu = Integer.parseInt(
                            JOptionPane.showInputDialog("CONVERTIR MASA\n"
                                    + "1. Kilogramo → Gramo \n"
                                    + "2. Tonelada → Kilogramo \n"
                                    + "3. Libra → Gramo\n "
                                    + "Ingrese el número correspondiente a la opción:"));
                    switch (opsubmenu) {
                        case 1:
                            med1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de Kilgramo  a "
                                    + " convertir"));
                            med2 = med1*1000;
                            mensaje = (med1 + " Kilogramos equivalen a " + med2
                                    + "Gramos");
                            JOptionPane.showMessageDialog(null, mensaje);
                            break;
                        case 2:
                            med1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Toneladas a "
                                    + "convertir"));
                            med2 = med1 * 1000;
                            mensaje = (med1 + "Toneladas equivalen a " + med2
                                    + "Kilogramos");
                            JOptionPane.showMessageDialog(null, mensaje);
                            break;
                        case 3:
                            med1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Libras a "
                                    + "convertir"));
                            med2 = med1 * 453.59;
                            mensaje = (med1 + " Libras equivalen a " + med2
                                    + "Gramos");
                            JOptionPane.showMessageDialog(null, mensaje);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Error.");
                    }
                    break;
                case 4:
                    opsubmenu = Integer.parseInt(
                            JOptionPane.showInputDialog("CONVERTIR ÁREA.\n"
                                    + "1. Kilometros cuadrados a Metros cuadrados\n"
                                    + "2. Pies cuadrados a Metros cuadrados \n"
                                    + "3. Millas cuadradas a Kilometros cuadrados\n"
                                    + "Ingrese el número correspondiente a la opción:"));

                    switch (opsubmenu) {
                        case 1:
                            med1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de Kilometros cuadrados  a"
                                    + " convertir"));
                            med2 = med1 * 1000000;
                            mensaje = (med1 + " Kilometros cuadrados equivalen a " + med2
                                    + "Metros cuadrados");
                            JOptionPane.showMessageDialog(null, mensaje);
                            break;
                        case 2:
                            med1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Pies cuadrados a "
                                    + "convertir"));
                            med2 = med1 / 10.764;
                            mensaje = (med1 + "Pies cuadrados equivalen a " + med2
                                    + "Metros cuadrados");
                            JOptionPane.showMessageDialog(null, mensaje);
                            break;
                        case 3:
                            med1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Millas a "
                                    + "convertir"));
                            med2 = med1 * 2.5899;
                            mensaje = (med1 + " Millas equivalen a " + med2
                                    + "Kilometros");
                            JOptionPane.showMessageDialog(null, mensaje);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Error.");
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,
                            "Adiós");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error.");
            }
        } while (opmedida != 5);

        System.exit(0);
    }
}
