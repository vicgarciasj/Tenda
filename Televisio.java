
import java.util.*;


/**
 * Class Televisio
 */
public class Televisio extends Electrodomestic {

  //
  // Fields
  //

  public String definicio;
  public int polzades;
  
  //
  // Constructors
  //
  public Televisio () { };

  public Televisio (String str) {
    String info[]=str.split(";");
    numRef=info[0];
    PVP=Double.parseDouble(info[1]);
    marca=info[2];
    model=info[3];
    EE=info[4];
    quantitat=Integer.parseInt(info[5]);
    definicio=info[6];
    polzades=Integer.parseInt(info[7]);



    this.numRef=numRef;
    this.PVP=PVP;
    this.marca=marca;
    this.model=model;
    this.EE=EE;
    this.quantitat=quantitat;
    this.definicio=definicio;
    this.polzades=polzades;

  }


  public String toString(Electrodomestic elect){

    return this.numRef+"    "+this.marca+"     "+this.model+"      "+this.EE+"      "+this.definicio+"L      "+this.PVP+"€      "+this.quantitat;
  }
  

  public void setDefinicio (String newVar) {
    definicio = newVar;
  }

  /**
   * Get the value of definicio
   * @return the value of definicio
   */
  public String getDefinicio () {
    return definicio;
  }

  /**
   * Set the value of polzades
   * @param newVar the new value of polzades
   */
  public void setPolzades (int newVar) {
    polzades = newVar;
  }

  /**
   * Get the value of polzades
   * @return the value of polzades
   */
  public int getPolzades () {
    return polzades;
  }

  //
  // Other methods
  //

}
