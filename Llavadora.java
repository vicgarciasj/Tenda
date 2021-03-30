/**
 * Class Llavadora
 */

public class Llavadora extends Electrodomestic {



  public int volum;

  public String[] programes= new String[5];

  public Llavadora() {
  }


  public Llavadora(String str) {

    String info[]=str.split(";");
    numRef=Integer.parseInt(info[0]);
    PVP=Double.parseDouble(info[1]);
    marca=info[2];
    model=info[3];
    EE=info[4];
    quantitat=Integer.parseInt(info[5]);
    volum=Integer.parseInt(info[6]);


    this.numRef=numRef;
    this.PVP=PVP;
    this.marca=marca;
    this.model=model;
    this.EE=EE;
    this.quantitat=quantitat;
    this.volum=volum;

  }

  public String toString(Electrodomestic elect){

    return this.numRef+"    "+this.marca+"     "+this.model+"      "+this.EE+"      "+this.volum+"L      "+this.PVP+"€      "+this.quantitat;
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
