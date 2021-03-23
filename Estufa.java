

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
  public String infoEst[];
  Estoc estoc=new Estoc();

  Iterator<Estufa> iterEst;

  public Estufa() {


  }
  public Estufa carregaEstufes() {
    try {


      File fe= new File("estufes.txt");
      Scanner sc= new Scanner(fe);

      while (sc.hasNextLine()){
        String strLine= sc.nextLine();
        Estufa estufa= new Estufa(strLine);
        estoc.llistaLEstufes.add(estufa);
      }
      sc.close();
    }catch (FileNotFoundException e){
      System.out.println("Error");
    }
    return null;
  }




  public Estufa ( String str) {

    String info[] =str.split(";");
    this.potencia=infoEst[0];
    this.numRef=infoEst[1];
    this.PVP=Double.parseDouble(infoEst[2]);
    this.marca=infoEst[3];
    this.model=infoEst[4];
    this.EE=infoEst[5];
    this.quantitat=Integer.parseInt(infoEst[6]);



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
