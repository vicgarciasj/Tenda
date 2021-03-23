
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
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of definicio
   * @param newVar the new value of definicio
   */
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
