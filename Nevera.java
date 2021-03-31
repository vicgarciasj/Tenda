
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
  public String congelador;
  
  //
  // Constructors
  //
  public Nevera () { };

//


  public Nevera(String str) {

    String info[]=str.split(";");
    numRef=Integer.parseInt(info[0]);
    PVP=Double.parseDouble(info[1]);
    marca=info[2];
    model=info[3];
    EE=info[4];
    quantitat=Integer.parseInt(info[5]);
    alsada=Integer.parseInt(info[6]);
    amplaria=Integer.parseInt(info[7]);
    fons=Integer.parseInt(info[8]);
    congelador=info[9];


  }
//
  public String toString(Electrodomestic elec){

    return this.numRef+"    "+this.marca+"    "+this.model+"     "+this.EE+"      "+this.alsada+"cm      "+this.amplaria+"cm     "+this.fons+"cm        "+this.congelador+"        "+this.PVP+"€     "+this.quantitat;
  }

}
