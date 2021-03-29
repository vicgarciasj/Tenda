
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

  public void setPotencia (String newVar) {

    potencia = newVar;
  }


  public String getPotencia () {
    return potencia;
  }


  public void setVolum (Double newVar) {
    volum = newVar;
  }


  public double getVolum () {
    return volum;
  }

    public int getQuantitatForns() {
      return quantitat;
    }


}
