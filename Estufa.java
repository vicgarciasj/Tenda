/**
 * Class Estufa
 */
public class Estufa extends Electrodomestic{



  public String potencia;


  public Estufa() {

  }
  public Estufa ( String str) {

    String info[]=str.split(";");
    numRef=info[0];
    PVP=Double.parseDouble(info[1]);
    marca=info[2];
    model=info[3];
    model=info[3];
    EE=info[4];
    quantitat=Integer.parseInt(info[5]);
    potencia=info[6];



    this.numRef=numRef;
    this.PVP=PVP;
    this.marca=marca;
    this.model=model;
    this.EE=EE;
    this.quantitat=quantitat;
    this.potencia=potencia;


  }

  public String toString(Electrodomestic elec){

    return this.numRef+"    "+this.marca+"     "+this.model+"      "+this.EE+"      "+this.potencia+"       "+this.PVP+"€      "+this.quantitat;
  }



  public void setPotencia (String potenciaEst) {

    potencia = potenciaEst;
  }


  public String getPotenciaEst () {
    return potencia;
  }

  public int getQuantitatEstufes(){
    return this.quantitat;
  }



}
