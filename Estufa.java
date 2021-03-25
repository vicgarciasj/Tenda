

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Class Estufa
 */
public class Estufa extends Electrodomestic{



  public String potencia;
  public String infoEst[]=new String[7];


  Iterator<Estufa> iterEst;

  public Estufa() {


  }





  public Estufa ( String str) {

    String infoEst[] =str.split(";");
    this.potencia=infoEst[0];
    this.numRef=infoEst[1];
    this.PVP=Double.parseDouble(infoEst[2]);
    this.marca=infoEst[3];
    this.model=infoEst[4];
    this.EE=infoEst[5];
    this.quantitat=Integer.parseInt(infoEst[0]);


    this.potencia=potencia;
    this.numRef=numRef;
    this.PVP=PVP;
    this.marca=marca;
    this.model=model;
    this.EE=EE;
    this.quantitat=quantitat;





  }



  public void llistaEstufes() {

    iterEst = iterEst.next().iterEst;
    while (iterEst.hasNext()) {
      System.out.println(iterEst.next() + " ");
      System.out.println("_________________________________/");

    }


  }

  public void setPotencia (String newVar) {
    potencia = newVar;
  }


  public String getPotencia () {
    return potencia;
  }



}
