

import java.util.*;

public class Tenda {
    public  int opcioBusquedaPrincipal,opcioBusquedaSecundari,opcioMenuEstoc, opcioSubMenuEstoc,opcioBusquedaCompres;

    public Scanner sc= new Scanner(System.in);
    public String[] menuP;
    public String[] mEstoc;
    public String[]menuAgenda;
    public String[]menuEstoc;
    public String[]menuCompres;

    Estoc e = new Estoc();
    Agenda a=new Agenda();




    public static void main (String[]args) {
        Tenda t = new Tenda();
        //Estoc e = new Estoc();



        t.portada();
        do {
            t.carregaMPricipal();
            t.mostrarMenuPrincipal();
            int opcio = t.llegirOpcioPrincipal();
            t.triaOpcioPrincipal(opcio);
            t.tornarMenu();

        } while (t.opcioBusquedaPrincipal != 4);{
            t.sc.close();
        }

    }



    public int triaOpcioPrincipal(int opcioBusquedaPrincipal){ //Ens permet escollir la opcio principal


        switch (opcioBusquedaPrincipal){
                case 1:
                    System.out.println("--------------------------------------------");
                    System.out.println("                   Agenda                   ");
                    System.out.println("--------------------------------------------");

                    mostrarMenuAgenda();
                    int opcioA=llegirOpcioSecundaria();
                    triaOpcioAgenda(opcioA);
                    break;
                case 2:
                    System.out.println("--------------------------------------------");
                    System.out.println("                   Estoc                    ");
                    System.out.println("--------------------------------------------");
                    //Estoc e=new Estoc();
                    //e.carregaElectrodomestics();
                    mostrarMenuEstoc();
                    int opcioME=llegirOpcMenuEstoc();
                    triaOpcioEstoc(opcioME);

                    break;
                case 3:
                    System.out.println("--------------------------------------------");
                    System.out.println("                  Compres                   ");
                    System.out.println("--------------------------------------------");

                    mostraMenuCompres();
                    int opcioC=llegirOpcioCompres();
                    triaOpcioCompres(opcioC);

                    break;
                case 4:
                    System.out.println("Eixir del programa\n");
                    System.out.println("--------------------------------------------");
                    System.out.println("              Fi de el programa             ");
                    System.out.println("--------------------------------------------");

                    break;
                default:
                    System.out.print("----- Valor Incorrecte -----\n--- Introdueix un nou nombre entre el 1 y el 6 : ");
                    sc.next();
                    break;
        }
        return opcioBusquedaPrincipal;

    }



    private int triaOpcioAgenda(int opcioBusquedaSecundari) {      //Seleciona la opcio de la agenda que es vol utlitzar


        switch (opcioBusquedaSecundari){
            case 1:
                System.out.println("Mostrar Clients\n");

                mostrarClients();
                break;
            case 2:
                System.out.println("Editar Clients\n");
                break;
            case 3:
                System.out.println("Donar de Baixa un Client\n");
                System.out.println("Intodueix el DNI de el client que vols donar de baixa:");
                Client cl=new Client();
                cl.DNI= cl.DNI;
                cl.DNI=sc.nextLine();
                Agenda a=new Agenda();
                a.baixaClient(cl.DNI);
                break;
            case 4:
                Agenda ag=new Agenda();
                Client cli=new Client();
                System.out.println("Donar de Alta un Client\n");
                ag.altaClient(cli);


                break;
            default:
                System.out.print("----- Valor Incorrecte -----\n--- Introdueix un nou nombre entre el 1 y el 4 : ");
                sc.next();
                break;
        }
        return opcioBusquedaSecundari;
    }

    private int triaOpcioEstoc(int opcioBusquedaEstoc) {


        switch (opcioBusquedaEstoc){
            case 1:
                System.out.println("Mostrar Estoc\n");
                mostrarSubMenuEstoc();
                int opcioE=llegirOpcSubMenuEstoc();
                triaSubMEstoc(opcioE);
                break;
            case 2:
                System.out.println("Editar Electrodomestic\n");
                break;
            case 3:
                System.out.println("Esborrar Electrodomestic\n");
                break;
            case 4:
                System.out.println("Donar de Alta un Electrodomestic\n");
                Estoc es=new Estoc();
                Electrodomestic elec=new Electrodomestic();
                mostrarSubMenuEstoc();
                int opcioSE=llegirOpcSubMenuEstoc();
                es.altaTipus(opcioSE);
                es.altaElect(elec);

                break;
            default:
                System.out.print("----- Valor Incorrecte -----\n--- Introdueix un nou nombre entre el 1 y el 4 : ");
                sc.next();
                break;
        }
        return opcioBusquedaEstoc;
    }

    private int triaSubMEstoc(int opcioSubMenuEstoc) {


        switch (opcioSubMenuEstoc) {
            case 1: //Estufes
                mostrarEstufes();

                Estufa est=new Estufa();
                if (est.quantitat == 1) {
                    System.out.println("Hi ha " + est.getQuantitatEstufes() + " Estufa en aquest moment disponibles.");
                } else {
                    System.out.println("Hi ha " + est.quantitat + " Estufes en aquest moment disponibles.");
                }

                break;

           case 2: //Forns

                mostrarForns();

                /*if (quantitatProducte == 1) {
                    System.out.println("Hi ha " + quantitatProducte + " Forn en aquest moment disponibles.");
                } else {
                    System.out.println("Hi ha " + quantitatProducte + " Forns en aquest moment disponibles.");
                }*/
                break;

            case 3: //Llavadores

                mostrarLlavadores();

               /* if (quantitatProducte == 1) {
                    System.out.println("Hi ha " + quantitatProducte + " Llavadora en aquest moment disponibles.");
                } else {
                    System.out.println("Hi ha " + quantitatProducte + " Llavadores en aquest moment disponibles.");
                }*/
                break;

            case 4: // Microones

                mostrarMicroones();

                //System.out.println("Hi ha " + quantitatProducte + " Microones en aquest moment disponibles.");
                break;

            case 5: //Neveres

                mostrarNeveres();

                /*if (quantitatProducte == 1) {
                    System.out.println("Hi ha " + quantitatProducte + " Nevera en aquest moment disponibles.");
                } else {
                    System.out.println("Hi ha " + quantitatProducte + " Neveres en aquest moment disponibles.");
                }*/
                break;

            case 6: //Televisors
                /*if (quantitatProducte == 1) {
                    System.out.println("Hi ha " + quantitatProducte + " Televisor en aquest moment disponibles.");
                } else {
                    System.out.println("Hi ha " + quantitatProducte + " Televisors en aquest moment disponibles.");
                }*/
                break;

            default:
                System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre entre el 1 y el 6 : ");
                sc.next();
                break;
        }
        return opcioSubMenuEstoc;
    }

    public int  triaOpcioCompres(int opcioBusquedaCompres){

        System.out.print("Introdueix un nou nombre 1 o 2: ");

        switch (opcioBusquedaCompres) {
            case 1:
                System.out.println("Mostrar Compres\n");

                break;
            case 2:
                System.out.println("Mostrar Compra\n");
                break;
            default:
                System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre , 1 o 2 : ");
                sc.next();
                break;

        }
        return opcioBusquedaCompres;
    }



    private void mostrarSubMenuEstoc() {
        carregaMEstoc();
        for (int i = 0; i < mEstoc.length; i++) {


            System.out.println(" [ "  + (i+1) + " ] " + mEstoc[i]);

            System.out.println("___________________________________/");
        }
    }

    private void mostrarMenuEstoc() {
            carregaMEstoc();
        for (int i = 0; i < menuEstoc.length; i++) {


            System.out.println(" [ "  + (i+1) + " ] " + menuEstoc[i]);

            System.out.println("___________________________________/");
        }
    }

    private void mostraMenuCompres() {
            carregaMCompres();
        for (int i = 0; i < menuCompres.length; i++) {


            System.out.println(" [ "  + (i+1) + " ] " + menuCompres[i]);

            System.out.println("___________________________________/");
        }
    }

    private void mostrarMenuAgenda() {
            carregaMAgenda();
        for (int i = 0; i < menuAgenda.length; i++) {


            System.out.println(" [ "  + (i+1) + " ] " + menuAgenda[i]);

            System.out.println("___________________________________/");
        }
    }

    public void carregaMPricipal() {    //Carrega el menu Principal
        //Menu Principal
        menuP = new String[4];
        menuP[0] = "Agenda";
        menuP[1] = "Estoc";
        menuP[2] = "Compres";
        menuP[3] = "Eixir";
    }

    public void carregaMAgenda() {    //Carrega el menu de la Agenda

        //Menu Agenda
        menuAgenda = new String[4];
        menuAgenda[0]="Mostrar Clients";
        menuAgenda[1]="Editar Clients";
        menuAgenda[2]="Esborrar Client";
        menuAgenda[3]="Alta Client";
    }

    public void  carregaMEstoc(){  //Carrega el menu del Estoc
        //Menu Estoc
        menuEstoc = new String[4];
        menuEstoc[0]="Mostrar Estoc";
        menuEstoc[1]="Editar Electrodomestics";
        menuEstoc[2]="Esborrar Electrodomestics";
        menuEstoc[3]="Alta Electrodomestics";

        //Sub-Menu mostrar Estoc
        mEstoc = new String[6];
        mEstoc[0]=" Estufes";
        mEstoc[1]=" Forns";
        mEstoc[2]=" Llavadores";
        mEstoc[3]=" Microones";
        mEstoc[4]=" Neveres";
        mEstoc[5]=" Televisors";

    }


    public void carregaMCompres(){  //Carrega el menu de les compres

        //Menu Compres
        menuCompres = new String[2];
        menuCompres[0]="Mostrar Compres";
        menuCompres[1]="Mostra Commpra";

    }


    public void mostrarMenuPrincipal() {
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("                   MENU                     ");
        System.out.println("--------------------------------------------");
        System.out.println();
        for (int i = 0; i < menuP.length; i++) {


            System.out.println(" [ "  + (i+1) + " ] " + menuP[i]);

            System.out.println("___________________________________/" +
                    "                                                                                                       ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");
    }


    public void portada(){
        System.out.println("********************************* TENDA DE ELECTRODOMESTICS*********************************");

    }

    private int llegirOpcioPrincipal(){     //Scanner per a triar la opcio del menu Principal
        Scanner scp=new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.print("--- Introdueix una Opcio entre el  1-4: ");
        opcioBusquedaPrincipal =scp.nextInt();
        System.out.println("--------------------------------------------");
        while (!(opcioBusquedaPrincipal >= 1 && opcioBusquedaPrincipal <= 4)) {

            System.out.println("Opcio incorecta. Introdueix un altre valor: ");

            llegirOpcioPrincipal();
        }
        return opcioBusquedaPrincipal;
    }

    private int llegirOpcioSecundaria(){    //Scanner per a triar la opcio del menu Secundari

        System.out.println("--------------------------------------------");
        System.out.print("--- Introdueix una Opcio entre el  1-4: ");
        opcioBusquedaSecundari=sc.nextInt();
        System.out.println("--------------------------------------------");
        while (!(opcioBusquedaSecundari >= 1 && opcioBusquedaSecundari <= 4)) {

            System.out.println("Opcio incorecta. Introdueix un altre valor: ");

            llegirOpcioSecundaria();
        }
        return opcioBusquedaSecundari;
    }

    public int llegirOpcMenuEstoc(){     //Scanner per a triar la opcio del menu per al sub Menu del Estoc


        System.out.println("--------------------------------------------");
        System.out.print("--- Introdueix una Opcio entre el  1-6: ");
        opcioMenuEstoc =sc.nextInt();
        System.out.println("--------------------------------------------");
        while (!(opcioMenuEstoc >= 1 && opcioMenuEstoc <= 6)) {

            System.out.println("Opcio incorecta. Introdueix un altre valor: ");

            llegirOpcMenuEstoc();
        }
        return opcioMenuEstoc;
    }

    public int llegirOpcSubMenuEstoc(){     //Scanner per a triar la opcio del menu per al sub Menu del Estoc


        System.out.println("--------------------------------------------");
        System.out.print("--- Introdueix una Opcio entre el  1-6: ");
        opcioSubMenuEstoc =sc.nextInt();
        System.out.println("--------------------------------------------");
        while (!(opcioSubMenuEstoc >= 1 && opcioSubMenuEstoc <= 6)) {

            System.out.println("Opcio incorecta. Introdueix un altre valor: ");

            llegirOpcSubMenuEstoc();
        }
        return opcioSubMenuEstoc;
    }

    public int llegirOpcioCompres(){     //Scanner per a triar la opcio del menu per al sub Menu del Estoc
        System.out.println("--------------------------------------------");
        opcioSubMenuEstoc =sc.nextInt();
        System.out.println("--------------------------------------------");
        while (!(opcioSubMenuEstoc == 1 || opcioSubMenuEstoc ==2)) {

            System.out.println("Opcio incorecta. Introdueix un altre valor: ");

            llegirOpcSubMenuEstoc();
        }
        return opcioSubMenuEstoc;
    }



    public void tornarMenu() {
        Scanner e = new Scanner(System.in);
        String enter;

        do {
            System.out.println(" ");
            System.out.println("_________________________________");
            System.out.println(" 'Enter' per a tornar al menu ");
            System.out.println("_________________________________/");
            enter = e.nextLine();

        } while (!(enter.isEmpty()));

    }

    public void altCli(Client cli){

        a.llistaCli.add(cli);
    }

    public void mostrarClients(){
        System.out.println("Nom -- Cognoms -------- NIF\n");

        ArrayList<Client> mostrarLlistaCli = a.getLlistaClients();

        Iterator<Client>iterCli=mostrarLlistaCli.iterator();

        while (iterCli.hasNext()) {
            System.out.println(iterCli.next() + " ");
            System.out.println("_________________________________/");
        }
    }


    public void mostrarEstufes() {

        System.out.println("Estufes Disponibles:\n");
        System.out.println("NªRef --- Marca --- Modelo -- EE ---- PVP --- Quantitat\n");

        Iterator<Electrodomestic> iterEst = e.llistaEstufes.iterator();

        while (iterEst.hasNext()) {
            Electrodomestic elec=iterEst.next();
            System.out.println(elec.toString(elec));
            System.out.println("______________________________________________________/");

        }
    }

    public void mostrarForns() {
        System.out.println("Forns Disponibles:\n");

        Iterator<Electrodomestic> iterFrn = e.llistaForns.iterator();

        while (iterFrn.hasNext()) {
            Electrodomestic elec=iterFrn.next();
            System.out.println(elec.toString(elec));
            System.out.println("_________________________________/");

        }
    }

    public void mostrarLlavadores() {
        System.out.println("Llavadores Disponibles:\n");
        Estoc e=new Estoc();
        ArrayList<Electrodomestic> mostrarLlistaLlavadores = e.getLlistaLlavadores();

        Iterator<Electrodomestic> iterll = mostrarLlistaLlavadores.iterator();

        while (iterll.hasNext()) {
            System.out.println(iterll.next() + " ");
            System.out.println("_________________________________/");


        }
    }

    public void mostrarMicroones() {
        System.out.println("Microones Disponibles:\n");

        Estoc e=new Estoc();
        ArrayList<Electrodomestic> mostrarLlistaMicroones = e.getLlistaMicroones();

        Iterator<Electrodomestic> itermcr = mostrarLlistaMicroones.iterator();

        while (itermcr.hasNext()) {
            System.out.println(itermcr.next() + " ");
            System.out.println("_________________________________/");


        }
    }



    public void mostrarNeveres() {
        System.out.println("Neveres Disponibles:\n");

        Estoc e=new Estoc();
        ArrayList<Electrodomestic> mostrarLlistaNeveres = e.getLlistaNeveres();

        Iterator<Electrodomestic> iternv = mostrarLlistaNeveres.iterator();

        while (iternv.hasNext()) {
            System.out.println(iternv.next() + " ");
            System.out.println("_________________________________/");

        }

    }

    public void mostrarTelevisors() {
        System.out.println("Televisors Disponibles:\n");

        Estoc e=new Estoc();
        ArrayList<Electrodomestic> mostrarLlistaTelevisors = e.getLlistaTelevisors();

        Iterator<Electrodomestic> itertv = mostrarLlistaTelevisors.iterator();

        while (itertv.hasNext()) {
            System.out.println(itertv.toString().lines() + " ");
            System.out.println("_________________________________/");


        }
    }




}




