

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Class Estufa
 */
public class Estufa extends Electrodomestic{


  public String infoEst[];
  public String potencia;



  Iterator<Estufa> iterEst;
  Electrodomestic elec=new Electrodomestic();

  public Estufa() {


  }

  public Estufa ( String str) {
    String infoEst[]=str.split(";");
    /*this.elec.numRef=infoElectro[0];
    this.elec.PVP=Double.parseDouble(infoElectro[1]);
    this.elec.marca=infoElectro[2];
    this.elec.model=infoElectro[3];
    this.elec.model=infoElectro[3];
    this.elec.EE=infoElectro[4];
    this.elec.quantitat=Integer.parseInt(infoElectro[5]);*/




   /* this.numRef=numRef;
    this.PVP=PVP;
    this.marca=marca;
    this.model=model;
    this.EE=EE;
    this.quantitat=quantitat;
    this.potencia=potencia;*/


  }

  public String toStringEstufa(){

    return this.numRef+" "+this.PVP+" "+this.marca+" "+this.model+" "+this.EE+" "+this.quantitat+" "+this.potencia;
  }





  public void setPotencia (String newVar) {
    potencia = newVar;
  }


  public String getPotencia () {
    return potencia;
  }



}
