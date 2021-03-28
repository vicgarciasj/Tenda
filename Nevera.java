
import java.util.*;


/**
 * Class Nevera
 */
public class Nevera extends Electrodomestic {

  //
  // Fields
  //

  public int alsada;
  public int amplaria;
  public int fons;
  public boolean congelador;
  
  //
  // Constructors
  //
  public Nevera () { };




  public Nevera(String str) {

    String infoNevera[]=str.split(";");
    this.numRef=infoNevera[0];
    //this.PVP=Integer.parseInt(infoNevera[1]);
    this.marca=infoNevera[2];
    this.model=infoNevera[3];
    this.EE=infoNevera[4];
    this.quantitat=Integer.parseInt(infoNevera[5]);
    this.alsada=Integer.parseInt(infoNevera[6]);
    this.amplaria=Integer.parseInt(infoNevera[7]);
    this.congelador=Boolean.getBoolean(infoNevera[8]);


    this.numRef=numRef;
    this.PVP=PVP;
    this.marca=marca;
    this.model=model;
    this.EE=EE;
    this.quantitat=quantitat;
    this.alsada=alsada;
    this.amplaria=amplaria;
    this.congelador=congelador;

  }

  public String toStringNevera(){

    return this.numRef+" "+this.PVP+" "+this.marca+" "+this.model+" "+this.EE+" "+this.quantitat+" "+this.alsada+" "+this.amplaria+" "+this.congelador;
  }
  public void setAlsada (int newVar) {
    alsada = newVar;
  }

  /**
   * Get the value of alsada
   * @return the value of alsada
   */
  public int getAlsada () {
    return alsada;
  }

  /**
   * Set the value of amplaria
   * @param newVar the new value of amplaria
   */
  public void setAmplaria (int newVar) {
    amplaria = newVar;
  }

  /**
   * Get the value of amplaria
   * @return the value of amplaria
   */
  public int getAmplaria () {
    return amplaria;
  }

  /**
   * Set the value of fons
   * @param newVar the new value of fons
   */
  public void setFons (int newVar) {
    fons = newVar;
  }

  /**
   * Get the value of fons
   * @return the value of fons
   */
  public int getFons () {
    return fons;
  }

  /**
   * Set the value of congelador
   * @param newVar the new value of congelador
   */
  public void setCongelador (boolean newVar) {
    congelador = newVar;
  }

  /**
   * Get the value of congelador
   * @return the value of congelador
   */
  public boolean getCongelador () {
    return congelador;
  }

  //
  // Other methods
  //

}
