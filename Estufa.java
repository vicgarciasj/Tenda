

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


  public Estufa() {

  }
  public Estufa ( String str) {

    String infoEst[]=str.split(";");
    numRef=infoEst[0];
    PVP=Double.parseDouble(infoEst[1]);
    marca=infoEst[2];
    model=infoEst[3];
    model=infoEst[3];
    EE=infoEst[4];
    quantitat=Integer.parseInt(infoEst[5]);



    this.numRef=numRef;
    this.PVP=PVP;
    this.marca=marca;
    this.model=model;
    this.EE=EE;
    this.quantitat=quantitat;
    this.potencia=potencia;


  }





  public void setPotencia (String potenciaEst) {

    potencia = potenciaEst;
  }


  public String getPotencia () {
    return potencia;
  }

  public int getQuantitatEstufes(){
    return this.quantitat;
  }



}
