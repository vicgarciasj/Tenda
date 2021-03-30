
import java.util.*;


/**
 * Class Forn
 */
public class Forn extends Electrodomestic {



  public String potencia;
  public int volum;

  public  Forn(){

  }
    public Forn(String str) {

      String info[]=str.split(";");
      numRef=info[0];
      PVP=Double.parseDouble(info[1]);
      marca=info[2];
      model=info[3];
      model=info[3];
      EE=info[4];
      quantitat=Integer.parseInt(info[5]);
      potencia=info[6];
      volum=Integer.parseInt(info[7]);



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

    return this.numRef+"    "+this.marca+"     "+this.model+"      "+this.EE+"      "+this.potencia+"W     "+this.PVP+"€     "+this.volum+"L       "+this.quantitat;
  }



  public void setPotencia (String newVar) {

    potencia = newVar;
  }


  public String getPotencia () {
    return potencia;
  }


  public void setVolum (int newVar) {
    volum = newVar;
  }


  public double getVolum () {
    return volum;
  }

    public int getQuantitatForns() {
      return quantitat;
    }


}
