

import java.util.*;

public class Tenda {
    public  int numBusquedaPrincipal,numBusquedaSecundari,numBusqueda;

    public Scanner sc= new Scanner(System.in);
    public String[] menuP;
    public String[] mEstoc;
    public String[]menuAgenda;
    public String[]menuEstoc;
    public String[]menuCompres;

    public Client cl = new Client();
    public Agenda a=new Agenda();
    public Estoc e=new Estoc();


    public static void main (String[]args) {
        Tenda t = new Tenda();
        Estoc e = new Estoc();


        t.portada();
        do {
            t.carregaMPricipal();
            e.carregaElectrodomestics();
            t.mostrarMenuPrincipal();
            t.triaOpcioPrincipal();
            t.tornarMenu();
        } while (t.numBusquedaPrincipal != 0);{
            t.sc.close();
         }

    }




    public void triaOpcioPrincipal(){ //Ens permet escollir la opcio principal
        Tenda t=new Tenda();
        Estoc es= new Estoc();
        busquedaPri();
        while (!(numBusquedaPrincipal >= 1 && numBusquedaPrincipal <= 4)) {

            System.out.println("Opcio incorecta. Introdueix un altre valor: ");

            numBusquedaPrincipal= sc.nextInt();
        }
        switch (numBusquedaPrincipal){
                case 1:
                    System.out.println("Agenda\n");
                    t.mostrarMenuAgenda();
                    t.triaOpcioAgenda();
                    break;
                case 2:
                    System.out.println("Estoc\n");
                    es.carregaElectrodomestics();
                    t.mostrarMenuEstoc();
                    t.triaOpcioEstoc();

                    break;
                case 3:
                    System.out.println("Compres\n");
                    t.mostraMenuCompres();
                    t.triaOpcioCompres();

                    break;
                case 4:
                    System.out.println("Eixir del programa");
                    System.out.println("*********************");
                    System.out.println("******* Fin de el programa **********");
                    System.out.println("*********************");
                    sc.close();
                    break;
                default:
                    System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre entre el 1 y el 6 : ");
                    sc.next();
                    break;
        }
    }

    private void mostrarEstoc() {
            Estoc es=new Estoc();
        busqueda();
        switch (numBusqueda){
            case 1: //Estufes
                mostrarEstufes();

           /*     if (es.est.quantitat==1) {
                    System.out.println("Hi ha " + es.est.getQuantitat() + " Estufa en aquest moment disponibles.");
                }else {
                    System.out.println("Hi ha "+es.est.getQuantitat()+" Estufes en aquest moment disponibles.");
                }*/

                break;

            case 2: //Forns
                if (es.frn.quantitat==1){
                System.out.println("Hi ha "+es.frn.quantitat+" Forn en aquest moment disponibles.");
                }else {
                    System.out.println("Hi ha "+es.est.quantitat+" Forns en aquest moment disponibles.");
                }
                break;

            case 3: //Llavadores
                if (es.ll.quantitat==1){
                System.out.println("Hi ha "+es.ll.quantitat+" Llavadora en aquest moment disponibles.");
                }else {
                    System.out.println("Hi ha "+es.ll.quantitat+" Llavadores en aquest moment disponibles.");
                }
                break;

            case 4: // Microones
                System.out.println("Hi ha "+es.mcr.quantitat+" Microones en aquest moment disponibles.");
                break;

            case 5: //Neveres
                if (es.nv.quantitat==1){
                System.out.println("Hi ha "+es.nv.quantitat+" Nevera en aquest moment disponibles.");
                }else {
                System.out.println("Hi ha "+es.nv.quantitat+" Neveres en aquest moment disponibles.");
                }
                break;

            case 6: //Televisors
                if (es.tv.quantitat==1){
                System.out.println("Hi ha "+es.tv.quantitat+" Televisor en aquest moment disponibles.");
                }else {
                    System.out.println("Hi ha "+es.tv.quantitat+" Televisors en aquest moment disponibles.");
                }
                break;

            default:
                System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre entre el 1 y el 6 : ");
                sc.next();
                break;
        }
    }



    private void triaOpcioAgenda() {      //Seleciona la opcio de la agenda que es vol utlitzar

         Tenda t=new Tenda();
        busquedaSec();
        switch (numBusquedaSecundari){
            case 1:
                System.out.println("Mostrar Clients\n");
                System.out.println("Nom ██ Cognoms ████████ NIF\n");
                t.mostrarClients();
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
        Tenda t=new Tenda();
        Estoc es= new Estoc();
        Electrodomestic elec= new Electrodomestic();
        busquedaSec();
        switch (numBusquedaSecundari){
            case 1:
                System.out.println("Mostrar Estoc\n");
                t.mostrarSubMenuEstoc();
                t.mostrarEstoc();
                break;
            case 2:
                System.out.println("Editar Electrodomestic\n");
                break;
            case 3:
                System.out.println("Esborrar Electrodomestic\n");
                break;
            case 4:
                System.out.println("Donar de Alta un Electrodomestic\n");
                es.opcioTriaAlta(elec);
                es.altaElect(elec);
                es.altaTipus(elec);
                break;
            default:
                System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre entre el 1 y el 4 : ");
                sc.next();
                break;
        }
    }

    public void  triaOpcioCompres(){
        switch (numBusquedaSecundari) {
            case 1:
                System.out.println("Mostrar Compres\n");

                break;
            case 2:
                System.out.println("Mostrar Compra\n");
                break;
            default:
                System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre entre el 1 y el 2 : ");
                sc.next();
                break;

        }    }

    public void altCli(Client cli){
        this.a.llistaCli.add(cli);
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
    public void busquedaPri(){
        System.out.println("████████████████████████████████████████████");
        System.out.print("███ Introdueix una Opcio entre el  1-4: ");
        numBusquedaPrincipal=sc.nextInt();
        System.out.println("████████████████████████████████████████████");
    }

    public void busquedaSec(){
        System.out.println("████████████████████████████████████████████");
        System.out.print("███ Introdueix una Opcio entre el  1-4: ");
        numBusquedaSecundari=sc.nextInt();
        System.out.println("████████████████████████████████████████████");
    }

    public void busqueda(){
        System.out.println("████████████████████████████████████████████");
        numBusqueda=sc.nextInt();
        System.out.println("████████████████████████████████████████████");
    }

    void tornarMenu() {
        Scanner e = new Scanner(System.in);
        String enter;
        if ((numBusquedaPrincipal==4)){

        do {
            System.out.println("_________________________________");
            System.out.println(" 'Enter' per a tornar al menu ");
            System.out.println("_________________________________/");
            enter = e.nextLine();

        } while (!(enter.isEmpty()));
        }else {
            sc.close();
        }

    }

    public void mostrarClients(){
        ArrayList<Client>llistaCli = a.getLlistaClients();

        Iterator<Client>iterCli=llistaCli.iterator();
        while (iterCli.hasNext()) {
            Client c = new Client();
            System.out.println(iterCli.next() + " ");
            System.out.println("_________________________________/");
        }
    }

    public void mostrarEstufes(){
        ArrayList<Estufa>llistaEstufes = e.getLlistaEstufes();

        Iterator<Estufa>iterEst=llistaEstufes.iterator();
        while (iterEst.hasNext()) {
            Estufa est = new Estufa();
            System.out.println(iterEst.next().toStringEstufa() + " ");
            System.out.println("_________________________________/");
        }

    }




}




