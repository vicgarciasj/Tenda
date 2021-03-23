




import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Class Estoc
 */
public class Estoc {
  private String tip;

    ArrayList<Electrodomestic> llistaElect = new ArrayList<Electrodomestic>();
    ArrayList<Estufa> llistaLEstufes= new ArrayList<Estufa>();
  ArrayList<Forn> llistaForn = new ArrayList<Forn>();
  ArrayList<Microones> llistaMicroones = new ArrayList<Microones>();
  ArrayList<Llavadora> llistaLlavadores = new ArrayList<Llavadora>();
  ArrayList<Televisio> llistaTelevisions = new ArrayList<Televisio>();
  ArrayList<Nevera> llistaNevera = new ArrayList<Nevera>();



  Iterator<Electrodomestic> iterElect;



    public Estoc () {

  }
  public void carregaElectrodomestics() {
        Estufa es=new Estufa();
        es.carregaEstufes();

  }
/*    try {

      File fc= new File("electrodomestics.txt");
      Scanner sc= new Scanner(fc);

      while (sc.hasNextLine()){
        String stLine= sc.nextLine();
        Electrodomestic e= new Electrodomestic();
        llistaElect.add(e);


      }
    }catch (FileNotFoundException e){
      System.out.println("Error");
    }
    return null;
  }*/


  public void donarAlta(Electrodomestic e) {


    Electrodomestic tipus = null;
    Scanner sc= new Scanner(System.in);
    int num=-1;
    System.out.println("Tipus de Electrodomestic:\n[ 1 ]: Estufa\n[ 2 ]: Forn\n[ 3 ]: Llavadora\n[ 4 ]: Microones\n[ 5 ]: Nevera\n[ 6 ]: Televisor");
    num=sc.nextInt();
    switch (num){
      case 1: //Estufa
          Estufa est = new Estufa();
          System.out.println("Intodueix la Potencia:");
          est.potencia=sc.nextLine();
          tip="Estufa";
          tipus=est;
          this.llistaLEstufes.add(est);
          break;
      case 2: //Forn
          Forn fr= new Forn();
          System.out.println("Introdueix la Potencia: ");
          fr.potencia=sc.nextLine();
          System.out.println("Introdueix el Volum: ");
          fr.volum=sc.nextInt();
          tip="Forn";
          tipus=fr;

          break;
      case 3: //Llavadora
          Llavadora ll=new Llavadora();
          //ll.programes=sc.nextLine();
          tip="Llavadora";
          tipus=ll;
          break;
      case 4: //Microones
          Microones mcr=new Microones();
          System.out.println("Introdueix la Potencia: ");
          mcr.potencia=sc.nextInt();
          System.out.println("Introdueix el Volum: ");
          mcr.volum=sc.nextInt();
          tip="Microones";
          tipus=mcr;
          break;
      case 5: //Nevera
        Nevera nv=new Nevera();
        nv.alsada=sc.nextInt();
        nv.amplaria=sc.nextInt();
        nv.fons=sc.nextInt();
        nv.congelador=sc.hasNext();
        tip="Nevera";
        tipus=nv;
          break;
      case 6: //Televisor
          Televisio tv=new Televisio();
          tv.definicio=sc.nextLine();
          tv.polzades=sc.nextInt();
          tip="Televisor";
          tipus=tv;
          break;
    }


      System.out.println("Introdueix el Numero de Referencia: ");
      tipus.numRef=sc.nextLine();
      System.out.println("Introdueix el Preu: ");
      tipus.PVP=sc.nextDouble();
      System.out.println("Introdueix el Marca: ");
      tipus.marca=sc.nextLine();
      System.out.println("Introdueix el Model: ");
      tipus.model=sc.nextLine();
      System.out.println("Eficiencia energetica:");
      tipus.EE=sc.nextLine();
      System.out.println("Introdueix la Quantitat d'unitats: ");
      tipus.quantitat=sc.nextInt();

      System.out.println("██████████████████████████████████████████████");
      System.out.println("Nou Electrodomestic :\nModel: "+tipus.model+"\nNumero de Referencia: "+tipus.numRef+"\nPreu: "+tipus.PVP+"€"+"\nNumero de Unitats");
      System.out.println("Article guardat en "+tip);
    //this.llistaElect.add(e);
  }




  public void llistarElectrodomestics() {
    iterElect = llistaElect.iterator();
    while (iterElect.hasNext()) {
      System.out.println(iterElect + " ");
      System.out.println("_________________________________/");

    }
  }


  public void donarBaixa(int ref) {

        ArrayList<Electrodomestic> llistaElect = new ArrayList<Electrodomestic>();
  }



}
