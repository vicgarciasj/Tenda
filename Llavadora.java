import java.util.ArrayList;

/**
 * Class Llavadora
 */

public class Llavadora extends Electrodomestic {



  public double volum;
  public String[] programes= new String[5];




  public void setVolum (double newVar) {
    volum = newVar;
  }


  public double getVolum () {
    return volum;
  }


  /*public void semtProgrames (String[*] newVar) {
    programes = newVar;
  }*/

  public String[] getProgrames () {
    return programes;
  }




}
