




import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Class Estoc
 */
public class Estoc {
  private String tip;

    private ArrayList<Electrodomestic> llistaElect = new ArrayList<Electrodomestic>();
    private ArrayList<Estufa> llistaEstufes= new ArrayList<Estufa>();
    private ArrayList<Forn> llistaForn = new ArrayList<Forn>();
    private ArrayList<Microones> llistaMicroones = new ArrayList<Microones>();
    private ArrayList<Llavadora> llistaLlavadores = new ArrayList<Llavadora>();
    private ArrayList<Televisio> llistaTelevisions = new ArrayList<Televisio>();
    private ArrayList<Nevera> llistaNevera = new ArrayList<Nevera>();



  Iterator<Electrodomestic> iterElect;
  //Estoc estoc=new Estoc();
  Estufa est=new Estufa();
  Forn frn=new Forn();
  Microones mcr= new Microones();
  Llavadora ll =new Llavadora();
  Televisio tv=new Televisio();
  Nevera nv=new Nevera();
   ;


    public Estoc () {

  }
  public void carregaElectrodomestics() {
        carregaEstufes();


  }



  public void
  donarAlta(Electrodomestic e) {


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
          //this.llistaLEstufes.add(est);
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

    /**
     *
     * Carrega Estufes
     */

    public Estufa carregaEstufes() {
        try {


            File fe= new File("estufes.txt");
            Scanner sc= new Scanner(fe);

            while (sc.hasNextLine()){
                String strLine= sc.nextLine();
                Estufa estufa= new Estufa(strLine);
                llistaEstufes.add(estufa);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("Error");
        }
        return null;
    }

    private ArrayList<Estufa> LlistaEst() {

        return this.llistaEstufes;

    }

    public ArrayList<Estufa> getLlistaEstufes() {
        return llistaEstufes;
    }


    /**
     *
     * Carrega Forns
     */


}
