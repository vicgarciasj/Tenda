


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Class Estoc
 */
public class Estoc {


    private Scanner sc = new Scanner(System.in);
    private String tip;




    public ArrayList<Electrodomestic> llistaElect = new ArrayList<Electrodomestic>();
    public ArrayList<Electrodomestic> llistaEstufes = new ArrayList<Electrodomestic>();
    public ArrayList<Electrodomestic> llistaForns = new ArrayList<Electrodomestic>();
    public ArrayList<Electrodomestic> llistaMicroones = new ArrayList<Electrodomestic>();
    public ArrayList<Electrodomestic> llistaLlavadores = new ArrayList<Electrodomestic>();
    public ArrayList<Electrodomestic> llistaNevera = new ArrayList<Electrodomestic>();
    public ArrayList<Electrodomestic> llistaTelevisors = new ArrayList<Electrodomestic>();


    public Estoc() {
        carregaElectrodomestics();

    }

    public void carregaElectrodomestics() {

        carregaEstufes();
        carregaForns();
        carregaLlavadores();
        carregaMicroones();
        carregaNeveres();
        carregaTelevisors();
    }


    public void altaElect(Electrodomestic tipus) {
        System.out.println("Introdueix el Numero de Referencia: ");
        tipus.numRef = sc.nextInt();
        System.out.println("Introdueix el Preu: ");
        tipus.PVP = sc.nextDouble();
        System.out.println("Introdueix el Marca: ");
        tipus.marca = sc.nextLine();
        System.out.println("Introdueix el Model: ");
        tipus.model = sc.nextLine();
        System.out.println("Eficiencia energetica:");
        tipus.EE = sc.nextLine();
        System.out.println("Introdueix la Quantitat d'unitats: ");
        tipus.quantitat = sc.nextInt();

        System.out.println("██████████████████████████████████████████████");
        System.out.println("Nou Electrodomestic :\nModel: " + tipus.model + "\nNumero de Referencia: " + tipus.numRef + "\nPreu: " + tipus.PVP + "€" + "\nNumero de Unitats");
        System.out.println("Article guardat en " + tip);

    }

    public int altaTipus(int opcio) {
        Electrodomestic tipus;
        if (opcio == 1) {
            tip = "Estufa";
            Estufa est = new Estufa();
            llistaEstufes.add(est);
            tipus = est;
        }
        if (opcio == 2) {
            tip = "Forn";
            Forn frn = new Forn();
            llistaForns.add(frn);

        }
        if (opcio == 3) {
            tip = "Llavadora";
            Llavadora ll = new Llavadora();
            llistaLlavadores.add(ll);
        }
        if (opcio == 4) {
            tip = "Microones";
            Microones mcr = new Microones();
            llistaMicroones.add(mcr);
        }
        if (opcio == 5) {
            tip = "Nevera";
            Nevera nv = new Nevera();
            llistaNevera.add(nv);
        }
        if (opcio == 6) {
            tip = "Televisor";
            Televisio tv = new Televisio();
            llistaTelevisors.add(tv);
        }
        return opcio;
    }





  /*public Boolean borrarElectrodomestic(int numRefBorrar) {

      Iterator<Electrodomestic>iter= t.llistarElectrodomestics();
      Electrodomestic elec=iter;
      iter=this.tipus.iter();
      while (iter.hasNext()){
          Electrodomestic ele;
         // Client c=new Client();
          ele=iter.next();
          if (numRefBorrar== c.DNI){
              this.llistaCli.remove(c);
              return true;
          }
      }
      return false;
  }*/

    /*public Boolean borrarElectrodomestic(int opcioBorrar, int numRefBorrar) {

        switch (opcioBorrar) {

            case 1: //Borrar estufa

            Iterator<Electrodomestic> iter = llistaEstufes.iterator();
            Electrodomestic elec =iter.next();
                while (iter.hasNext()) {
                    Electrodomestic est;
                    est = iter.next();
                    Estufa estufa=new Estufa();
                    if (numRefBorrar == estufa.numRef) {
                        llistaEstufes.remove(est);

                        return true;
                    }
                    return false;
                }
                break;

            case 2:
        }
        return null;
    }*/

    /**
     * Carrega Estufes
     */

    public Estufa carregaEstufes() {
        try {


            File fe = new File("estufes.txt");
            Scanner sc = new Scanner(fe);

            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                Estufa estufa = new Estufa(str);
                llistaEstufes.add(estufa);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al carregar estufes");
        }
        return null;
    }

    private ArrayList<Electrodomestic> LlistaEst() {

        return this.llistaEstufes;

    }

    public ArrayList<Electrodomestic> getLlistaEstufes() {

        return llistaEstufes;
    }


    /**
     * Carrega Forns
     */

    public Forn carregaForns() {
        try {

            File ff = new File("forns.txt");
            Scanner sc = new Scanner(ff);

            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                Forn forn = new Forn(str);
                llistaForns.add(forn);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error  al carregar forns");
        }
        return null;
    }

    private ArrayList<Electrodomestic> LlistaForn() {

        return this.llistaForns;

    }

    public ArrayList<Electrodomestic> getLlistaForn() {
        return llistaForns;
    }


    /**
     * Carrega Llavadores
     */

    public Llavadora carregaLlavadores() {
        try {

            File fll = new File("llavadores.txt");
            Scanner sc = new Scanner(fll);

            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                Llavadora ll = new Llavadora(str);
                llistaLlavadores.add(ll);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error  al carregar llavadores");
        }
        return null;
    }

    private ArrayList<Electrodomestic> LlistaLlavadores() {

        return this.llistaLlavadores;

    }

    public ArrayList<Electrodomestic> getLlistaLlavadores() {

        return llistaLlavadores;
    }

    /**
     * Carrega Microones
     */

    public Microones carregaMicroones() {
        try {

            File fmcr = new File("microones.txt");
            Scanner sc = new Scanner(fmcr);

            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                Microones mcr = new Microones(str);
                llistaMicroones.add(mcr);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error  al carregar microones");
        }
        return null;
    }

    private ArrayList<Electrodomestic> LlistaMicroones() {

        return this.llistaMicroones;

    }

    public ArrayList<Electrodomestic> getLlistaMicroones() {
        return llistaMicroones;
    }

    /**
     * Carrega Neveres
     */

    public Nevera carregaNeveres() {
        try {

            File fnv = new File("neveres.txt");
            Scanner sc = new Scanner(fnv);

            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                Nevera nv = new Nevera(str);
                llistaNevera.add(nv);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error  al carregar neveres");
        }
        return null;
    }


    private ArrayList<Electrodomestic> LlistaNeveres() {

        return this.llistaNevera;

    }

    public ArrayList<Electrodomestic> getLlistaNeveres() {
        return llistaNevera;
    }

    /**
     * Carrega Televisors
     */

    public Televisio carregaTelevisors() {
        try {

            File ftv = new File("televisors.txt");
            Scanner sc = new Scanner(ftv);

            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                Televisio tv = new Televisio(str);
                llistaTelevisors.add(tv);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error  al carregar televisors");
        }
        return null;
    }

    private ArrayList<Electrodomestic> LlistaTelevisors() {

        return this.llistaTelevisors;

    }

    public ArrayList<Electrodomestic> getLlistaTelevisors() {
        return llistaTelevisors;
    }

    public Electrodomestic llistarElectrodomestics( int numRefBorrar) {

        Iterator<Electrodomestic> iterest = getLlistaEstufes().iterator();
        Iterator<Electrodomestic> iterfrn = getLlistaForn().iterator();
        Iterator<Electrodomestic> iterll = getLlistaLlavadores().iterator();
        Iterator<Electrodomestic> itermcr = getLlistaMicroones().iterator();
        Iterator<Electrodomestic> iternv = getLlistaNeveres().iterator();
        Iterator<Electrodomestic> itertv = getLlistaTelevisors().iterator();


        //Recorre el ArrayList de "Estufes"
        while (iterest.hasNext()) {
            Electrodomestic elc= iterest.next();
            if (numRefBorrar == elc.numRef) {
                this.llistaEstufes.remove(elc);
                System.out.println("Estufa Esborrat");

            }
           /* //Recorre el ArrayList de "Forns"
            while (iterfrn.hasNext()) {
                Electrodomestic electFrn = iterfrn.next();

            }

            //Recorre el ArrayList de "Llavadores"
            while (iterll.hasNext()) {
                Electrodomestic electLl = iterll.next();

            }

            //Recorre el ArrayList de "Microones"
            while (itermcr.hasNext()) {
                Electrodomestic electMcr = itermcr.next();

            }

            //Recorre el ArrayList de "Neveres"
            while (itermcr.hasNext()) {
                Electrodomestic electTv = itertv.next();

            }

            //Recorre el ArrayList de "Televisions"
            while (itertv.hasNext()) {
                Electrodomestic electNv = iternv.next();

            }*/

        }
       return null;

    }
}


