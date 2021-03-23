
import java.util.*;


/**
 * Class Forn
 */
public class Forn extends Electrodomestic {



  public String potencia;
  public double volum;




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
