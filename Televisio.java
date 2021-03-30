
import java.util.*;


/**
 * Class Televisio
 */
public class Televisio extends Electrodomestic {

  //
  // Flds
  //

  public String definicio;
  public int polzades;
  

  // Constructors
  //
  public Televisio () { };

  public Televisio (String str) {
    String info[]=str.split(";");
    numRef=Integer.parseInt(info[0]);
    PVP=Double.parseDouble(info[1]);
    marca=info[2];
    model=info[3];
    EE=info[4];
    quantitat=Integer.parseInt(info[5]);
    definicio=info[6];
    polzades=Integer.parseInt(info[7]);


  }


  public String toString(Electrodomestic elect){

    return this.numRef+"    "+this.marca+"     "+this.model+"      "+this.EE+"      "+this.definicio+"       "+this.polzades+"''       "+this.PVP+"€      "+this.quantitat;
  }
  



}
