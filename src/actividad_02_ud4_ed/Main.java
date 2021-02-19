/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**Clase Principal que representa el movimiento en una cuenta bancaria
 * 
 * @author Diego
 */
public class Main {
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

   /**Método constructor para el movimiento de la cuenta 
    * 
    * @param args concepto de consulta de la cuenta 
    */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        int opcion=0;
        cuenta1 = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
        do{
            //Opciones en el menú del movimiento de la cuenta
            try {
                System.out.println("MENÚ DE OPERACIONES");
                System.out.println("-------------------");
                System.out.println("1 - Ingresar");
                System.out.println("2 - Retirar");
                System.out.println("3 - Finalizar");
                opcion=Integer.parseInt(dato.readLine());
                if(opcion==1){
                    System.out.println("¿Cuánto desea ingresar?: ");
                    float ingresar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,ingresar,opcion);
                }else if(opcion==2){
                    System.out.println("¿Cuánto desea retirar?: ");
                    float retirar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,retirar,opcion);
                }else if(opcion==3){
                    System.out.println("Finalizamos la ejecución");
                }else{
                    System.err.println("Opción errónea");
                }
/*                switch(opcion){
                    case 1:
                        System.out.println("¿Cuánto desea ingresar?: ");
                        float ingresar=Integer.parseInt(dato.readLine());
                        operativa_cuenta(cuenta1,ingresar,opcion);
                        break;
                    case 2:
                        System.out.println("¿Cuátno desea retirar?: ");
                        float retirar=Integer.parseInt(dato.readLine());
                        operativa_cuenta(cuenta1,retirar,opcion);
                        break;
                    case 3:
                        System.out.println("Finalizamos la ejecución");
                }
                //Sentencia en caso de que hubiera algún error en las opciones anteriores
*/            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
         //sentencia en caso de que no se cumpla ninún de los casos anteriores
        }while (opcion!=3);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
    }
    
    /**Método para operar en la cuenta
     * 
     * @param cuenta1 parámatro para introducir el número de cuenta 
     * @param cantidad parámetro para introducir la cantidad a operar
     * @param opcion parámetro para elegir la opcion a operar
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad,int opcion){
        if(opcion==2){
            try 
            {
                cuenta1.retirar(cantidad);
            } catch (Exception e)
            {
                System.out.print("Fallo al retirar");
            }
        }else if(opcion==1){
            try
            {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(cantidad);
            } catch (Exception e)
            {
                System.out.print("Fallo al ingresar");
            }
        }
    }
}
