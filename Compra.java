
import java.util.*;


/**
 * Class Compra
 */
public class Compra extends Electrodomestic {

  //
  // Fields
  //

  public String data;
  private double total;
  private double IVA=0.21;
  
  //
  // Constructors
  //
  public Compra () { };
  


  public void data () {
    Date data = new Date();
    System.out.println(data);

  }

//
  public String getData () {
    this.data=data;
    return data;
  }



  public void setTotal (double PVP) {
    double total;
    this.IVA=IVA;

    total=(PVP*IVA)+PVP;

    System.out.println(total);

  }


  public double getTotal () {
    return total;
  }


  public void setIVA (double newIva) {
    IVA = newIva;


  }


  public double getIVA () {

    return IVA;
  }

  //
  // Other methods
  //

  public void afegirItem(Electrodomestic elect, int quantitat)
  {
  }



  public void llevarItem(int linia)
  {
  }


  public void mostrar() {
  }


}
