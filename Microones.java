
import java.util.*;


/**
 * Class Microones
 */
public class Microones extends Electrodomestic {
//

  public int potencia;
  public int volum;

  public  Microones(){

  }
  public Microones(String str) {

    String info[]=str.split(";");
    this.numRef=info[0];
    this.PVP=Double.parseDouble(info[1]);
    this.marca=info[2];
    this.model=info[3];
    this.EE=info[4];
    this.quantitat=Integer.parseInt(info[5]);
    this.potencia=Integer.parseInt(info[6]);
    this.volum=Integer.parseInt(info[7]);

    this.numRef=numRef;
    this.PVP=PVP;
    this.marca=marca;
    this.model=model;
    this.EE=EE;
    this.quantitat=quantitat;
    this.potencia=potencia;
    this.volum=volum;
  }

  public String toString(Electrodomestic elec){

    return this.numRef+"    "+this.marca+"     "+this.model+"      "+this.EE+"      "+this.potencia+"W     "+this.PVP+"€     "+this.volum+"L      "+this.quantitat;
  }

  public void setPotencia (int newVar) {
    potencia = newVar;
  }

  /**
   * Get the value of potencia
   * @return the value of potencia
   */
  public int getPotencia () {
    return potencia;
  }

  /**
   * Set the value of volum
   * @param newVar the new value of volum
   */
  public void setVolum (int newVar) {
    volum = newVar;
  }

  /**
   * Get the value of volum
   * @return the value of volum
   */
  public double getVolum () {
    return volum;
  }

  //
  // Other methods
  //

}
