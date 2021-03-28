
import java.util.*;


/**
 * Class Microones
 */
public class Microones extends Electrodomestic {


  public int potencia;
  public double volum;

  public  Microones(){

  }
  public Microones(String str) {

    String infoMicro[]=str.split(";");
    this.numRef=infoMicro[0];
    //this.PVP=Integer.parseInt(infoMicro[1]);
    this.marca=infoMicro[2];
    this.model=infoMicro[3];
    this.EE=infoMicro[4];
    this.quantitat=Integer.parseInt(infoMicro[5]);
    this.potencia=Integer.parseInt(infoMicro[6]);
    this.volum=Integer.parseInt(infoMicro[7]);

    this.numRef=numRef;
    this.PVP=PVP;
    this.marca=marca;
    this.model=model;
    this.EE=EE;
    this.quantitat=quantitat;
    this.potencia=potencia;
    this.volum=volum;
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
  public void setVolum (double newVar) {
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
