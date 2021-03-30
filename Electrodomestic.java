/**
 * Class Electrodomestic
 */
public class Electrodomestic {


  public String numRef;
  public double PVP;
  public String marca;
  public String model;
  public String EE;
  public int quantitat;

  public Electrodomestic(){

//

  }


  public String toString(Electrodomestic elec){
    return "null*Error";
    //return this.numRef+"    "+this.marca+"     "+this.model+"      "+this.EE+"      "+this.PVP+"€      "+this.quantitat;
  }





  public void setNumRef (String newVar) {
    numRef = newVar;
  }


  public String getNumRef () {
    return numRef;
  }

  /**
   * Set the value of PVP
   * @param newVar the new value of PVP
   */
  public void setPVP (double newVar) {
    PVP = newVar;
  }

  /**
   * Get the value of PVP
   * @return the value of PVP
   */
  public double getPVP () {
    return PVP;
  }

  /**
   * Set the value of marca
   * @param newVar the new value of marca
   */
  public void setMarca (String newVar) {
    marca = newVar;
  }

  /**
   * Get the value of marca
   * @return the value of marca
   */
  public String getMarca () {
    return marca;
  }

  /**
   * Set the value of model
   * @param newVar the new value of model
   */
  public void setModel (String newVar) {
    model = newVar;
  }

  /**
   * Get the value of model
   * @return the value of model
   */
  public String getModel () {
    return model;
  }

  /**
   * Set the value of EE
   * @param newVar the new value of EE
   */
  public void setEE (String newVar) {
    EE = newVar;
  }

  /**
   * Get the value of EE
   * @return the value of EE
   */
  public String getEE () {
    return EE;
  }

  /**
   * Set the value of quantitat
   * @param newVar the new value of quantitat
   */
  public void setQuantitat (int newVar) {
    quantitat = newVar;
  }

  /**
   * Get the value of quantitat
   * @return the value of quantitat
   */
  public int getQuantitat () {
    return quantitat;
  }




  //
  // Other methods
  //

}
