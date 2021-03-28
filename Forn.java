
import java.util.*;


/**
 * Class Forn
 */
public class Forn extends Electrodomestic {



  public String potencia;
  public Double volum;

  public  Forn(){

  }
    public Forn(String str) {

     /* String infoForn[]=str.split(";");
      this.numRef=infoForn[0];
      this.PVP=Double.parseDouble(infoForn[1]);
      this.marca=infoForn[2];
      this.model=infoForn[3];
      this.EE=infoForn[4];
      this.quantitat=Integer.parseInt(infoForn[5]);
      this.potencia=infoForn[6];
      this.volum=Double.parseDouble(infoForn[7]);*/

      this.numRef=numRef;
      this.PVP=PVP;
      this.marca=marca;
      this.model=model;
      this.EE=EE;
      this.quantitat=quantitat;
      this.potencia=potencia;
      this.volum=volum;
    }
  public String toStringForn(){

    return this.numRef+" "+this.PVP+" "+this.marca+" "+this.model+" "+this.EE+" "+this.quantitat+" "+this.potencia+" "+this.volum;
  }


    /**
   * Set the value of potencia
   * @param newVar the new value of potencia
   */
  public void setPotencia (String newVar) {

    potencia = newVar;
  }

  /**
   * Get the value of potencia
   * @return the value of potencia
   */
  public String getPotencia () {
    return potencia;
  }

  /**
   * Set the value of volum
   * @param newVar the new value of volum
   */
  public void setVolum (Double newVar) {
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
