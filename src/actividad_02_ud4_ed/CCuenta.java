/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;

/**Clase que representa a una cuenta bancaria 
 * 
 * @author Diego Jesús Sánchez Del Corral - 1 DAW 24/02/21
 */
public class CCuenta {

  /**
   * Identificadores de la cuenta
   */
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  /**
   * 
   */
    public CCuenta ()
    {
    }
   /**Método para crear la cuenta con sus parámetros
    * 
    * @param nom Nombre del cliente de la cuenta
    * @param cue IBAN de la cuenta 
    * @param sal Saldo actual de la cuenta
    * @param tipo Tipo de interes aplicado a la cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**Método para asignar el titular de la cuenta
   * 
   * @param nom Se le define el Nombre al titular
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /**Método para retornar el nombre de la variable nombre
    * 
    * @return <code>Nombre</code> Nos devuelve el valor definido como nombre
    */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**Método para retornar el saldo de la variable saldo
     * 
     * @return <code>Saldo</code> Nos devuelve el valor definido como estado
     */
     public double estado ()
    {
        return saldo;
    }

    /**Método para comprobar que la cantidad a ingresar sea superio a 0
     * 
     * @param cantidad Se designa la cantidad a ingresar
     * @throws Exception Se revisa que no se ingrese una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**Método para comprobar que la cantidad a entregar sea superir a 0 y que haya cantidad suficiente
    * 
    * @param cantidad Se define la cantidad a retirar
    * @throws Exception Se revisa que no se retire una cantidad negativa y que haya suficiente saldo
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**Método para retornar el número de cuenta de la variable cuenta
     * 
     * @return <code>Cuenta</code> Nos devuelve el valor definido como cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**Método para asignar el número de cuenta a la variable cuenta
   * 
   * @param cuenta Se define el número de cuenta 
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**Método para asignar el saldo a la variable saldo
   * 
   * @param saldo Se def1ne el saldo
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**Método para retornar el tipo de interes a la variable tipoInteres
  * 
  * @return  <code>tipoInterés</code>Nos devuelve el valor definido como tipo de interés
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**Método para asignar el tipo de interes a la variable tipoInteres
   * 
   * @param tipoInterés Se le asigna el tipo de interés
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
