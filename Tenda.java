

import java.util.*;

public class Tenda {
    public  int opcioBusquedaPrincipal,opcioBusquedaSecundari,opcioMenuEstoc, opcioSubMenuEstoc,opcioBusquedaCompres,numRefBorrar;

    public Scanner sc= new Scanner(System.in);
    public String[] menuP;
    public String[] mEstoc;
    public String[]menuAgenda;
    public String[]menuEstoc;
    public String[]menuCompres;
    public String tip;

    Estoc e = new Estoc();
    Agenda a=new Agenda();




    public static void main (String[]args) {
        Tenda t = new Tenda();


        t.portada();
        do {
            t.carregaMPricipal();
            t.mostrarMenuPrincipal();
            int opcio = t.llegirOpcioPrincipal();
            t.triaOpcioPrincipal(opcio);
            if(!(t.opcioBusquedaPrincipal==4)) {
                t.tornarMenu();
            }

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

                    mostrarMenuEstoc();
                    int opcioME=llegirOpcMenuEstoc();
                    triaOpcioEstoc(opcioME);

                    break;
                case 3:
                    System.out.println("--------------------------------------------");
                    System.out.println("                  Compres                   ");
                    System.out.println("--------------------------------------------");
                    Compra compr=new Compra();
                    mostraMenuCompres();
                    int opcioC=llegirOpcioCompres();
                    triaOpcioCompres(opcioC);

                    break;
                case 4:
                    System.out.println("Eixir del programa\n");
                    System.out.println("--------------------------------------------");
                    System.out.println("                Fi del programa             ");
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
                mostrarClients();
                System.out.println("Intodueix el DNI de el client que vol editar:");
                demanaDNI();
                String dniCli=demanaDNI();
                a.editaClient(dniCli);
                mostrarClients();

                break;
            case 3:
                System.out.println("Donar de Baixa un Client\n");
                mostrarClients();
                System.out.println("Intodueix el DNI de el client que vol donar de baixa:");
                demanaDNI();
                String opcioBC=demanaDNI();a.baixaClient(opcioBC);

                break;
            case 4:
                Agenda ag=new Agenda();
                System.out.println("Donar de Alta un Client\n");
                Client cli= ag.altaClient();
                a.altaNouClient(cli);

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

                System.out.println("Quin tipus de electrodomestic vol esborrar:\n");
                mostrarSubMenuEstoc();
                int opcioBr=llegirOpcSubMenuEstoc();
                triaSubMEstoc(opcioBr);
                System.out.print("Intodueix el NªReferencia  *"+tip+"* que vol esborar: ");
                int numRef=demanaNumRef();
                e.bElectrodomestic(opcioBr,numRef);

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

    private int llegirOpcBorrarElect() {
        System.out.println(" ");
        System.out.println("_______________________________________________________________________/");
        System.out.println("Introdueix el Numero de referencia del electrodomestic que vol esborrar:");
        numRefBorrar=sc.nextInt();
        System.out.println("_______________________________________________________________________/");
        return numRefBorrar;
    }

    public int triaSubMEstoc(int opcioSubMenuEstoc) {  //Ens permet triar la opcio per a mostrar els diferents tipus de electrodomestic y veure les caracteristiques

        switch (opcioSubMenuEstoc) {
            case 1: //Estufes
                tip="Estufa";

                mostrarEstufes();
                break;
           case 2: //Forns
                tip="Forn";
                mostrarForns();
                break;

            case 3: //Llavadores
                tip="Llavadora";

                mostrarLlavadores();
                break;
            case 4: // Microones
                tip="Microones";

                mostrarMicroones();
                break;
            case 5: //Neveres
                tip="Nevera";

                mostrarNeveres();
                break;

            case 6: //Televisors
                tip="Televisio";

                mostrarTelevisors();
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



    private void mostrarSubMenuEstoc() {    //Imprimeix el sub-menu de l'Estoc
        carregaMEstoc();
        for (int i = 0; i < mEstoc.length; i++) {


            System.out.println(" [ "  + (i+1) + " ] " + mEstoc[i]);

            System.out.println("___________________________________/");
        }
    }

    private void mostrarMenuEstoc() {   //Imprimeix el menu de l'Estoc
            carregaMEstoc();
        for (int i = 0; i < menuEstoc.length; i++) {


            System.out.println(" [ "  + (i+1) + " ] " + menuEstoc[i]);

            System.out.println("___________________________________/");
        }
    }

    private void mostraMenuCompres() {  //Imprimeix el menu de les Compres
            carregaMCompres();
        for (int i = 0; i < menuCompres.length; i++) {


            System.out.println(" [ "  + (i+1) + " ] " + menuCompres[i]);

            System.out.println("___________________________________/");
        }
    }

    private void mostrarMenuAgenda() { //Imprimeix el menu de la Agenda
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

    public String demanaDNI(){
        String DNIBorra=sc.nextLine();
        return DNIBorra;
    }

    public int demanaNumRef(){
        int numRefBorra=sc.nextInt();
        return numRefBorra;

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



    public void mostrarClients(){
        System.out.println("Nom ----- Cognoms -------- DNI\n");

        ArrayList<Client> mostrarLlistaCli = a.getLlistaClients();

        Iterator<Client>iterCli=mostrarLlistaCli.iterator();

        while (iterCli.hasNext()) {
            System.out.println(iterCli.next() + " ");
            System.out.println("_____________________________________/");
        }
    }


    public void mostrarEstufes() {

        System.out.println("Estufes Disponibles:\n");
        System.out.println("NªRef --- Marca --- Model --- EE --- Potencia --- PVP --- Quantitat");
        System.out.println("______________________________________________________________________");
        Iterator<Electrodomestic> iterEst = e.getLlistaEstufes().iterator();

        while (iterEst.hasNext()) {
            Electrodomestic elec=iterEst.next();
            System.out.println(elec.toString(elec));
            System.out.println("___________________________________________________________________/");


        }
    }

    public void mostrarForns() {
        System.out.println("Forns Disponibles:\n");
        System.out.println("NªRef --- Marca --- Model -- EE -- Potencia -- PVP ----- Volum -- Quantitat");
        System.out.println("_____________________________________________________________________________");
        Iterator<Electrodomestic> iterFrn = e.getLlistaForn().iterator();

        while (iterFrn.hasNext()) {
            Electrodomestic elec=iterFrn.next();
            System.out.println(elec.toString(elec));
            System.out.println("___________________________________________________________________________/");

        }
    }

    public void mostrarLlavadores() {
        System.out.println("Llavadores Disponibles:\n");
        System.out.println("NªRef --- Marca --- Model --- EE -- Volum ----- PVP  --- Quantitat");
        System.out.println("__________________________________________________________________");

        Iterator<Electrodomestic> iterll = e.getLlistaLlavadores().iterator();

        while (iterll.hasNext()) {
            Electrodomestic elec=iterll.next();
            System.out.println(elec.toString(elec));
            System.out.println("________________________________________________________________/");


        }
    }

    public void mostrarMicroones() {
        System.out.println("Microones Disponibles:\n");
        System.out.println("NªRef --- Marca ---- Model ---- EE -- Potencia -- Volum ---- PVP -- Quantitat");
        System.out.println("______________________________________________________________________________");

        Iterator<Electrodomestic> itermcr = e.getLlistaMicroones().iterator();

        while (itermcr.hasNext()) {
            Electrodomestic elec=itermcr.next();
            System.out.println(elec.toString(elec));
            System.out.println("_______________________________________________________________________________/");

        }
    }



    public void mostrarNeveres() {
        System.out.println("Neveres Disponibles:\n");
        System.out.println("NªRef --- Marca ---- Model ------ EE --- Alura -- Amplaria -- Fons --- Congelador --- PVP --- Quantitat");
        System.out.println("_______________________________________________________________________________________________________");


        Iterator<Electrodomestic> iternv = e.getLlistaNeveres().iterator();

        while (iternv.hasNext()) {
            Electrodomestic elec=iternv.next();
            System.out.println(elec.toString(elec));
            System.out.println("______________________________________________________________________________________________________/");

        }

    }

    public void mostrarTelevisors() {
        System.out.println("Televisors Disponibles:\n");
        System.out.println("NªRef --- Marca ----- Model ------- EE ---- Definicio -- Polzades --- PVP ---- Quantitat");
        System.out.println("________________________________________________________________________________________");

        Iterator<Electrodomestic> itertv = e.getLlistaTelevisors().iterator();

        while (itertv.hasNext()) {
            Electrodomestic elec=itertv.next();
            System.out.println(elec.toString(elec));
            System.out.println("________________________________________________________________________________________/");


        }
    }





}




