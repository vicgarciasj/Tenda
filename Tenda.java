

import java.util.*;

public class Tenda {
    public  int numBusquedaPrincipal,numBusquedaSecundari,numBusqueda;

    public Scanner sc= new Scanner(System.in);
    public String[] menuP;
    public String[] mEstoc;
    public String[]menuAgenda;
    public String[]menuEstoc;
    public String[]menuCompres;
    private int quantitatProducte;

    public Client cl = new Client();
    public Agenda a=new Agenda();
    public Estoc e=new Estoc();


    public static void main (String[]args) {
        Tenda t = new Tenda();
        Estoc e = new Estoc();


        t.portada();
        do {
            t.carregaMPricipal();
            t.mostrarMenuPrincipal();
            int opcio = t.llegirOpcioPrincipal();
            t.triaOpcioPrincipal(opcio);
            t.tornarMenu();

        } while (t.numBusquedaPrincipal != 4);{
            t.sc.close();
        }

    }




    public int triaOpcioPrincipal(int numBusquedaPrincipal){ //Ens permet escollir la opcio principal



        switch (numBusquedaPrincipal){
                case 1:
                    System.out.println("Agenda\n");
                    mostrarMenuAgenda();
                    triaOpcioAgenda();
                    break;
                case 2:
                    System.out.println("Estoc\n");
                    e.carregaElectrodomestics();
                    mostrarMenuEstoc();
                    triaOpcioEstoc();

                    break;
                case 3:
                    System.out.println("Compres\n");
                    mostraMenuCompres();
                    triaOpcioCompres();

                    break;
                case 4:
                    System.out.println("Eixir del programa");
                    System.out.println("*********************");
                    System.out.println("******* Fin de el programa **********");
                    System.out.println("*********************");
                    numBusquedaPrincipal=-2;
                    break;
                default:
                    System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre entre el 1 y el 6 : ");
                    sc.next();
                    break;
        }
        return numBusquedaPrincipal;

    }


    private void triaSubMEstoc() {
            Estoc es=new Estoc();
        System.out.println("Tria un numero entre el 1-6");
        opcioBusqueda();

        while (!(numBusqueda >= 1 && numBusqueda <= 6)) {

            System.out.println("Opcio incorecta. Introdueix un altre valor: ");

            opcioBusqueda();
        }

        switch (numBusqueda) {
            case 1: //Estufes
                mostrarEstufes();

                if (quantitatProducte == 1) {
                    System.out.println("Hi ha " + quantitatProducte + " Estufa en aquest moment disponibles.");
                } else {
                    System.out.println("Hi ha " + quantitatProducte + " Estufes en aquest moment disponibles.");
                }

                break;

            case 2: //Forns

                mostrarForns();

                if (quantitatProducte == 1) {
                    System.out.println("Hi ha " + quantitatProducte + " Forn en aquest moment disponibles.");
                } else {
                    System.out.println("Hi ha " + quantitatProducte + " Forns en aquest moment disponibles.");
                }
                break;

            case 3: //Llavadores

                mostrarLlavadores();

                if (quantitatProducte == 1) {
                    System.out.println("Hi ha " + quantitatProducte + " Llavadora en aquest moment disponibles.");
                } else {
                    System.out.println("Hi ha " + quantitatProducte + " Llavadores en aquest moment disponibles.");
                }
                break;

            case 4: // Microones

                mostrarMicroones();

                System.out.println("Hi ha " + quantitatProducte + " Microones en aquest moment disponibles.");
                break;

            case 5: //Neveres

                mostrarNeveres();

                if (quantitatProducte == 1) {
                    System.out.println("Hi ha " + quantitatProducte + " Nevera en aquest moment disponibles.");
                } else {
                    System.out.println("Hi ha " + quantitatProducte + " Neveres en aquest moment disponibles.");
                }
                break;

            case 6: //Televisors
                if (quantitatProducte == 1) {
                    System.out.println("Hi ha " + quantitatProducte + " Televisor en aquest moment disponibles.");
                } else {
                    System.out.println("Hi ha " + quantitatProducte + " Televisors en aquest moment disponibles.");
                }
                break;

            default:
                System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre entre el 1 y el 6 : ");
                sc.next();
                break;
        }

    }



    private void triaOpcioAgenda() {      //Seleciona la opcio de la agenda que es vol utlitzar

        llegirOpcioSecundaria();
        while (!(numBusquedaSecundari >= 1 && numBusquedaSecundari <= 4)) {

            System.out.println("Opcio incorecta. Introdueix un altre valor: ");

            llegirOpcioSecundaria();
        }


        switch (numBusquedaSecundari){
            case 1:
                System.out.println("Mostrar Clients\n");
                System.out.println("Nom ██ Cognoms ████████ NIF\n");
                mostrarClients();
                break;
            case 2:
                System.out.println("Editar Clients\n");
                break;
            case 3:
                System.out.println("Donar de Baixa un Client\n");
                System.out.println("Intodueix el DNI de el client que vols donar de baixa:");
                this.cl.DNI= cl.DNI;
                cl.DNI=sc.nextLine();
                a.baixaClient(cl.DNI);
                break;
            case 4:
                System.out.println("Donar de Alta un Client\n");
                a.altaClient(cl);


                break;
            default:
                System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre entre el 1 y el 4 : ");
                sc.next();
                break;
        }
    }

    private void triaOpcioEstoc() {

        llegirOpcioSecundaria();
        while (!(numBusquedaPrincipal >= 1 && numBusquedaPrincipal <= 4)) {

            System.out.println("Opcio incorecta. Introdueix un altre valor: ");


            llegirOpcioSecundaria();
        }

        switch (numBusquedaSecundari){
            case 1:
                System.out.println("Mostrar Estoc\n");
                mostrarSubMenuEstoc();
                triaSubMEstoc();
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
                es.opcioTriaAlta(elec);
                es.altaElect(elec);
                //es.altaTipus(elec);
                break;
            default:
                System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre entre el 1 y el 4 : ");
                sc.next();
                break;
        }
    }

    public void  triaOpcioCompres(){
        System.out.print("Introdueix un nou nombre 1 o 2: ");
        opcioBusqueda();
        while (!(numBusquedaPrincipal == 1 || numBusquedaPrincipal == 2)) {

            System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre 1 o 2: ");

            opcioBusqueda();
        }
        switch (numBusquedaSecundari) {
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

        }    }



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
        System.out.println("█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗\n" +
                "╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝");
        System.out.println("""
                ███╗   ███╗███████╗███╗   ██╗██╗   ██╗    \s
                ████╗ ████║██╔════╝████╗  ██║██║   ██║    \s
                ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║    \s
                ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║    \s
                ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝    \s
                ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝     \s
                """);

        System.out.println("█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗\n" +
                "╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝");
        System.out.println();
        for (int i = 0; i < menuP.length; i++) {


            System.out.println(" [ "  + (i+1) + " ] " + menuP[i]);

            System.out.println("___________________________________/" +
                    "                                                                                                       ");
        }
        System.out.println();
        System.out.println("█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗\n" +
                "╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝");
    }


    public void portada(){
        System.out.println("""
                                                            ████████╗███████╗███╗   ██╗██████╗  █████╗                                           \s
                                                            ╚══██╔══╝██╔════╝████╗  ██║██╔══██╗██╔══██╗                                          \s
                                                               ██║   █████╗  ██╔██╗ ██║██║  ██║███████║                                          \s
                                                               ██║   ██╔══╝  ██║╚██╗██║██║  ██║██╔══██║                                          \s
                                                               ██║   ███████╗██║ ╚████║██████╔╝██║  ██║                                          \s
                                                               ╚═╝   ╚══════╝╚═╝  ╚═══╝╚═════╝ ╚═╝  ╚═╝                                          \s
                                                                                                                                                 \s
                ███████╗██╗     ███████╗ ██████╗████████╗██████╗  ██████╗ ██████╗  ██████╗ ███╗   ███╗███████╗███████╗████████╗██╗ ██████╗███████╗
                ██╔════╝██║     ██╔════╝██╔════╝╚══██╔══╝██╔══██╗██╔═══██╗██╔══██╗██╔═══██╗████╗ ████║██╔════╝██╔════╝╚══██╔══╝██║██╔════╝██╔════╝
                █████╗  ██║     █████╗  ██║        ██║   ██████╔╝██║   ██║██║  ██║██║   ██║██╔████╔██║█████╗  ███████╗   ██║   ██║██║     ███████╗
                ██╔══╝  ██║     ██╔══╝  ██║        ██║   ██╔══██╗██║   ██║██║  ██║██║   ██║██║╚██╔╝██║██╔══╝  ╚════██║   ██║   ██║██║     ╚════██║
                ███████╗███████╗███████╗╚██████╗   ██║   ██║  ██║╚██████╔╝██████╔╝╚██████╔╝██║ ╚═╝ ██║███████╗███████║   ██║   ██║╚██████╗███████║
                ╚══════╝╚══════╝╚══════╝ ╚═════╝   ╚═╝   ╚═╝  ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚═╝     ╚═╝╚══════╝╚══════╝   ╚═╝   ╚═╝ ╚═════╝╚══════╝
                                                                                                                                                 \s
                """);

    }

    private int llegirOpcioPrincipal(){
        Scanner scp=new Scanner(System.in);
        System.out.println("████████████████████████████████████████████");
        System.out.print("███ Introdueix una Opcio entre el  1-4: ");
        numBusquedaPrincipal=scp.nextInt();
        System.out.println("████████████████████████████████████████████");
        while (!(numBusquedaPrincipal >= 1 && numBusquedaPrincipal <= 4)) {

            System.out.println("Opcio incorecta. Introdueix un altre valor: ");

            llegirOpcioPrincipal();
        }
        return numBusquedaPrincipal;
    }

    private int llegirOpcioSecundaria(){


        System.out.println("████████████████████████████████████████████");
        System.out.print("███ Introdueix una Opcio entre el  1-4: ");
        numBusquedaSecundari=sc.nextInt();
        System.out.println("████████████████████████████████████████████");
        while (!(numBusquedaSecundari >= 1 && numBusquedaSecundari <= 4)) {

            System.out.println("Opcio incorecta. Introdueix un altre valor: ");

            llegirOpcioSecundaria();
        }
        return numBusquedaSecundari;
    }

    public int opcioBusqueda(){
        System.out.println("████████████████████████████████████████████");
        numBusqueda=sc.nextInt();
        System.out.println("████████████████████████████████████████████");
        return numBusqueda;
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
        this.a.llistaCli.add(cli);
    }

    public void mostrarClients(){
        ArrayList<Client> mostrarLlistaCli = a.getLlistaClients();

        Iterator<Client>iterCli=mostrarLlistaCli.iterator();

        while (iterCli.hasNext()) {
            System.out.println(iterCli.next() + " ");
            System.out.println("_________________________________/");
        }
    }


    public void mostrarEstufes() {
        quantitatProducte =-1;
        System.out.println("Estufes Disponibles:\n");
        ArrayList<Estufa> mostrarLlistaEstufes = e.getLlistaEstufes();

        Iterator<Estufa> iterEst = mostrarLlistaEstufes.iterator();

        while (iterEst.hasNext()) {
            System.out.println(iterEst.next() + " ");
            System.out.println("_________________________________/");
            quantitatProducte++;
        }
    }

    public void mostrarForns() {
        System.out.println("Forns Disponibles:\n");
        quantitatProducte =-1;
        ArrayList<Forn> mostrarLlistaForns = e.getLlistaForn();

        Iterator<Forn> iterFrn = mostrarLlistaForns.iterator();

        while (iterFrn.hasNext()) {
            System.out.println(iterFrn.next() + " ");
            System.out.println("_________________________________/");
            quantitatProducte++;

        }
    }

    public void mostrarLlavadores() {
        System.out.println("Llavadores Disponibles:\n");
        quantitatProducte =-1;
        ArrayList<Llavadora> mostrarLlistaLlavadores = e.getLlistaLlavadores();

        Iterator<Llavadora> iterll = mostrarLlistaLlavadores.iterator();

        while (iterll.hasNext()) {
            System.out.println(iterll.next() + " ");
            System.out.println("_________________________________/");
            quantitatProducte++;

        }
    }

    public void mostrarMicroones() {
        System.out.println("Microones Disponibles:\n");
        quantitatProducte =-1;
        ArrayList<Microones> mostrarLlistaMicroones = e.getLlistaMicroones();

        Iterator<Microones> itermcr = mostrarLlistaMicroones.iterator();

        while (itermcr.hasNext()) {
            System.out.println(itermcr.next() + " ");
            System.out.println("_________________________________/");
            quantitatProducte++;

        }
    }

    public void mostrarNeveres() {
        System.out.println("Neveres Disponibles:\n");
        quantitatProducte =-1;
        ArrayList<Nevera> mostrarLlistaNeveres = e.getLlistaNeveres();

        Iterator<Nevera> iternv = mostrarLlistaNeveres.iterator();

        while (iternv.hasNext()) {
            System.out.println(iternv.next() + " ");
            System.out.println("_________________________________/");
            quantitatProducte++;

        }
    }




}




