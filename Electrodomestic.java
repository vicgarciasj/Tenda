/**
 * Class Electrodomestic
 */
public class Electrodomestic {


  public int numRef;
  public double PVP;
  public String marca;
  public String model;
  public String EE;
  public int quantitat;

  public Electrodomestic(){



  }


  public String toString(Electrodomestic elec){
    return "null*Error";
    //return this.numRef+"    "+this.marca+"     "+this.model+"      "+this.EE+"      "+this.PVP+"€      "+this.quantitat;
  }



  private void setNumRef (int newVar) {
    numRef = newVar;
  }


  public int getNumRef (Electrodomestic elect) {

    return numRef;
  }



}
