

import java.util.*;

public class Tenda {
    private static int numBusquedaPrincipal,numBusquedaSecundari,numBusqueda;
    public Scanner sc= new Scanner(System.in);
    public String[] menuP;
    public String[] mEstoc;
    public String[]menuAgenda;
    public String[]menuEstoc;
    public String[]menuCompres;
    Client cl = new Client();

        Agenda a=new Agenda();
        public static void main (String[]args) {
            Tenda t = new Tenda();
            Agenda a=new Agenda();

            t.portada();
            do {
                t.cargarMenus();
                t.mostrarMenuPrincipal();
                t.triaOpcioPrincipal();
                t.tornarMenu();
            } while (numBusquedaPrincipal != 0);{
                t.sc.close();
             }

        }


    public void triaOpcioPrincipal(){
        Tenda t=new Tenda();
        Estoc es= new Estoc();
        Electrodomestic elec= new Electrodomestic();

        System.out.println("████████████████████████████████████████████");
        System.out.print("███ Introdueix una Opcio entre el  1-4: ");
        numBusquedaPrincipal=sc.nextInt();
        System.out.println("████████████████████████████████████████████");


        while (!(numBusquedaPrincipal >= 1 && numBusquedaPrincipal <= 4)) {

            System.out.println("Opcio incorecta. Introdueix un altre valor: ");

            opcioBusquedaPrincipal();
        }
        switch (numBusquedaPrincipal){
                case 1:
                    System.out.println("Agenda");
                    t.mostrarMenuAgenda();
                    t.triaOpcioAgenda();
                    break;
                case 2:
                    System.out.println("Estoc");
                    t.mostrarMenuEstoc();
                    t.triaOpcioEstoc();
                    t.mostrarEstoc();
                    break;
                case 3:
                    System.out.println("Compres");
                    t.mostraMenuCompres();

                    break;
                case 4:
                    System.out.println("Eixir del programa");
                    System.out.println("*********************");
                    System.out.println("******* Fin de el programa **********");
                    System.out.println("*********************");
                    sc.close();
                    break;
                default:
                    break;
        }
    }

    private void mostrarEstoc() {
            Estoc es=new Estoc();

        switch (numBusquedaPrincipal){
            case 1: //Estufes
                System.out.println("Hi ha "+es.est.quantitat+" en aquest moment disponibles");
                break;
            case 2: //Forns
                System.out.println("Hi ha "+es.frn.quantitat+" en aquest moment disponibles");
                break;
            case 3: //Llavadores
                System.out.println("Hi ha "+es.ll.quantitat+" en aquest moment disponibles");
                break;
            case 4: // Microones
                System.out.println("Hi ha "+es.mcr.quantitat+" en aquest moment disponibles");
                break;
            case 5: //Neveres
                System.out.println("Hi ha "+es.nv.quantitat+" en aquest moment disponibles");
                break;
            case 6: //Televisors
                System.out.println("Hi ha "+es.tv.quantitat+" en aquest moment disponibles");
                break;
            default:
                System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre entre el 1 y el 6 : ");
                sc.next();;
                break;
        }
    }


    private void triaOpcioAgenda() {
            switch (numBusquedaSecundari){
                case 1:
                    System.out.println("Mostrar Clients");
                    System.out.println("Nom ██ Cognoms ████████ NIF\n");
                    //t.mostrarClients();
                    break;
                case 2:
                    System.out.println("Editar Clients");
                    break;
                case 3:
                    System.out.println("Donar de Baixa un Client");
                    break;
                case 4:
                    System.out.println("Donar de Alta un Client");
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
        switch (numBusquedaSecundari){
            case 1:
                System.out.println("Mostrar Estoc");
                //t.mostrarEstocMenu();
                break;
            case 2:
                System.out.println("Editar Electrodomestic");
                break;
            case 3:
                System.out.println("Esborrar Electrodomestic");
                break;
            case 4:
                System.out.println("Donar de Alta un Electrodomestic");
                es.donarAlta(elec);
                break;
            default:
                System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre entre el 1 y el 4 : ");
                sc.next();
                break;
        }
    }

    private void mostrarMenuEstoc() {
            cargarMenus();
        for (int i = 0; i < menuEstoc.length; i++) {


            System.out.println(" [  "  + (i+1) + " ] " + menuAgenda[i]);

            System.out.println("___________________________________/");
        }
    }

    private void mostraMenuCompres() {
            cargarMenus();
        for (int i = 0; i < menuCompres.length; i++) {


            System.out.println(" [  "  + (i+1) + " ] " + menuCompres[i]);

            System.out.println("___________________________________/");
        }
    }

    private void mostrarMenuAgenda() {
            cargarMenus();
        for (int i = 0; i < menuAgenda.length; i++) {


            System.out.println(" [  "  + (i+1) + " ] " + menuAgenda[i]);

            System.out.println("___________________________________/");
        }
    }

    private int opcioBusquedaPrincipal(){
            int numBusquedaPrincipal;
            numBusquedaPrincipal=sc.nextInt();
            return numBusquedaPrincipal;
    }

    public void cargarMenus() {

        menuP =new String[4];
        menuAgenda=new String[4];
        menuEstoc=new String[4];
        mEstoc=new String[6];
        menuCompres=new String[2];

        //Menu Principal
        menuP[0]="Agenda";
        menuP[1]="Estoc";
        menuP[2]="Compres";
        menuP[3]="Eixir";

        //Menu Agenda
        menuAgenda[0]="Mostrar Clients";
        menuAgenda[1]="Editar Clients";
        menuAgenda[2]="Esborrar Client";
        menuAgenda[3]="Alta Client";

        //Menu Estoc
        menuEstoc[0]="Mostrar Estoc";
        menuEstoc[1]="Editar Electrodomestics";
        menuEstoc[2]="Esborrar Electrodomestics";
        menuEstoc[3]="Alta Electrodomestics";

        //Sub-Menu mostrar Estoc
        mEstoc[0]="[ 1 ]: Estufes";
        mEstoc[1]="[ 2 ]: Forns";
        mEstoc[2]="[ 3 ]: Llavadores";
        mEstoc[3]="[ 4 ]: Microones";
        mEstoc[4]="[ 5 ]: Neveres";
        mEstoc[5]="[ 6 ]: Televisors";

        //Menu Compres
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


            System.out.println(" [  "  + (i+1) + " ] " + menuP[i]);

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

    void tornarMenu() {
        Scanner e = new Scanner(System.in);
        String enter;

        do {
            System.out.println("_________________________________");
            System.out.println(" 'Enter' per a tornar al menu ");
            System.out.println("_________________________________/");
            enter = e.nextLine();

        } while (!(enter.isEmpty()));

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



}




