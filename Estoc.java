




import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Class Estoc
 */
public class Estoc {
    Scanner sc=new Scanner(System.in);
  private String tip;
    Electrodomestic tipus = null;

    private ArrayList<Electrodomestic> llistaElect = new ArrayList<Electrodomestic>();
    private ArrayList<Estufa> llistaEstufes= new ArrayList<Estufa>();
    private ArrayList<Forn> llistaForns = new ArrayList<Forn>();
    private ArrayList<Microones> llistaMicroones = new ArrayList<Microones>();
    private ArrayList<Llavadora> llistaLlavadores = new ArrayList<Llavadora>();
    private ArrayList<Televisio> llistaTelevisors = new ArrayList<Televisio>();
    private ArrayList<Nevera> llistaNevera = new ArrayList<Nevera>();



  Iterator<Electrodomestic> iterElect;
  Estufa est=new Estufa();
  Forn frn=new Forn();
  Microones mcr= new Microones();
  Llavadora ll =new Llavadora();
  Televisio tv=new Televisio();
  Nevera nv=new Nevera();



    public Estoc () {

  }
  public void carregaElectrodomestics() {

    llistaEstufes.add(carregaEstufes());
    llistaForns.add(carregaForns());
    llistaLlavadores.add(carregaLlavadores());
    llistaMicroones.add(carregaMicroones());
    llistaNevera.add(carregaNeveres());
    llistaTelevisors.add(carregaTelevisors());


  }


    public void opcioTriaAlta(Electrodomestic e) {


      int num = -1;
      System.out.println("Tipus de Electrodomestic:\n");
      num= sc.nextInt();
      switch (num) {
          case 1: //Estufa
              Estufa est = new Estufa();
              System.out.println("Intodueix la Potencia:");
              est.potencia = sc.nextLine();
              tip = "Estufa";
              tipus = est;
              this.llistaEstufes.add(est);
              break;
          case 2: //Forn
              Forn fr = new Forn();
              System.out.println("Introdueix la Potencia: ");
              fr.potencia = sc.nextLine();
              System.out.println("Introdueix el Volum: ");
              fr.volum = sc.nextDouble();
              tip = "Forn";
              tipus = fr;

              break;
          case 3: //Llavadora
              Llavadora ll = new Llavadora();
              tip = "Llavadora";
              tipus = ll;
              break;
          case 4: //Microones
              Microones mcr = new Microones();
              System.out.println("Introdueix la Potencia: ");
              mcr.potencia = sc.nextInt();
              System.out.println("Introdueix el Volum: ");
              mcr.volum = sc.nextInt();
              tip = "Microones";
              tipus = mcr;
              break;
          case 5: //Nevera
              Nevera nv = new Nevera();
              nv.alsada = sc.nextInt();
              nv.amplaria = sc.nextInt();
              nv.fons = sc.nextInt();
              nv.congelador = sc.hasNext();
              tip = "Nevera";
              tipus = nv;
              break;
          case 6: //Televisor
              Televisio tv = new Televisio();
              tv.definicio = sc.nextLine();
              tv.polzades = sc.nextInt();
              tip = "Televisor";
              tipus = tv;
              break;
      }
  }

    public void altaElect( Electrodomestic tipus){
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

  }

  public void altaTipus(Electrodomestic tipus){
        if (tipus==est){
            this.llistaEstufes.add(est);
        }
      if (tipus==frn){
          this.llistaForns.add(frn);
      }
      if (tipus==ll){
          this.llistaLlavadores.add(ll);
      }
      if (tipus==mcr){
          this.llistaMicroones.add(mcr);
      }
      if (tipus==nv){
          this.llistaNevera.add(nv);
      }
      if (tipus==tv){
          this.llistaTelevisors.add(tv);
      }

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
                String str= sc.nextLine();
                Estufa estufa= new Estufa(str);
                llistaEstufes.add(estufa);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("Error al carregar estufes");
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

    public Forn carregaForns() {
        try {

            File ff= new File("forns.txt");
            Scanner sc= new Scanner(ff);

            while (sc.hasNextLine()){
                String str= sc.nextLine();
                Forn fr= new Forn(str);
                llistaForns.add(fr);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("Error  al carregar forns");
        }
        return null;
    }

    private ArrayList<Forn> LlistaForn() {

        return this.llistaForns;

    }

    public ArrayList<Forn> getLlistaForn() {
        return llistaForns;
    }



    /**
     *
     * Carrega Llavadores
     */

    public Llavadora carregaLlavadores() {
        try {

            File fll= new File("llavadores.txt");
            Scanner sc= new Scanner(fll);

            while (sc.hasNextLine()){
                String str= sc.nextLine();
                Llavadora ll= new Llavadora(str);
                llistaLlavadores.add(ll);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("Error  al carregar llavadores");
        }
        return null;
    }

    private ArrayList<Llavadora> LlistaLlavadores() {

        return this.llistaLlavadores;

    }

    public ArrayList<Llavadora> getLlistaLlavadores() {
        return llistaLlavadores;
    }

    /**
     *
     * Carrega Microones
     */

    public Microones carregaMicroones() {
        try {

            File fmcr= new File("microones.txt");
            Scanner sc= new Scanner(fmcr);

            while (sc.hasNextLine()){
                String str= sc.nextLine();
                Microones mcr= new Microones(str);
                llistaMicroones.add(mcr);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("Error  al carregar microones");
        }
        return null;
    }

    private ArrayList<Microones> LlistaMicroones() {

        return this.llistaMicroones;

    }

    public ArrayList<Microones> getLlistaMicroones() {
        return llistaMicroones;
    }

    /**
     *
     * Carrega Neveres
     */

    public Nevera carregaNeveres() {
        try {

            File fnv= new File("neveres.txt");
            Scanner sc= new Scanner(fnv);

            while (sc.hasNextLine()){
                String str= sc.nextLine();
                Nevera nv= new Nevera(str);
                llistaNevera.add(nv);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("Error  al carregar neveres");
        }
        return null;
    }

    private ArrayList<Nevera> LlistaNeveres() {

        return this.llistaNevera;

    }

    public ArrayList<Nevera> getLlistaNeveres() {
        return llistaNevera;
    }

    /**
     *
     * Carrega Televisors
     */

    public Televisio carregaTelevisors() {
        try {

            File ftv= new File("televisors.txt");
            Scanner sc= new Scanner(ftv);

            while (sc.hasNextLine()){
                String str= sc.nextLine();
                Televisio tv= new Televisio(str);
                llistaTelevisors.add(tv);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("Error  al carregar televisors");
        }
        return null;
    }

    private ArrayList<Televisio> LlistaTelevisors() {

        return this.llistaTelevisors;

    }

    public ArrayList<Televisio> getLlistaTelevisors() {
        return llistaTelevisors;
    }
}


