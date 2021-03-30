
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
    numRef=Integer.parseInt(info[0]);
    PVP=Double.parseDouble(info[1]);
    marca=info[2];
    model=info[3];
    EE=info[4];
    quantitat=Integer.parseInt(info[5]);
    potencia=Integer.parseInt(info[6]);
    volum=Integer.parseInt(info[7]);


  }

  public String toString(Electrodomestic elec){

    return this.numRef+"    "+this.marca+"     "+this.model+"      "+this.EE+"      "+this.potencia+"W      "+this.volum+"L      "+this.PVP+"€      "+this.quantitat;
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
