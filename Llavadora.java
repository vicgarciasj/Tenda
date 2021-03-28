/**
 * Class Llavadora
 */

public class Llavadora extends Electrodomestic {



  public int volum;

  public String[] programes= new String[5];

  public Llavadora() {
  }


  public Llavadora(String str) {

   /* String infoLlavadora[]=str.split(";");
    this.numRef=infoLlavadora[0];
    this.PVP=Integer.parseInt(infoLlavadora[1]);
    this.marca=infoLlavadora[2];
    this.model=infoLlavadora[3];
    this.EE=infoLlavadora[4];
    this.quantitat=Integer.parseInt(infoLlavadora[5]);
    this.volum=Integer.parseInt(infoLlavadora[6]);*/


    this.numRef=numRef;
    this.PVP=PVP;
    this.marca=marca;
    this.model=model;
    this.EE=EE;
    this.quantitat=quantitat;
    this.volum=volum;

  }

  public String toStringLlavadora(){

    return this.numRef+" "+this.PVP+" "+this.marca+" "+this.model+" "+this.EE+" "+this.quantitat;
  }

  public void setVolum (int newVar) {
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
