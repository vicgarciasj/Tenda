import java.util.Date;
import java.util.Scanner;

public class Tenda {
    private static int numBusqueda=0;
    public Scanner sc= new Scanner(System.in);
    public String[] oMenu;

        public static void main (String[]args) {
            Tenda t = new Tenda();
            Agenda a=new Agenda();

            t.portada();
            do {
                t.menu();
                t.mostrarMenu();
                a.carregaClients();
                t.triaOpcio();
                t.tornarMenu();
            } while (numBusqueda != 0);{
                t.sc.close();
             }

        }


    public void triaOpcio(){
        Agenda a = new Agenda();
        Compra cm = new Compra();
        Estoc es= new Estoc();
        Client cl = new Client();
        Estufa estufa=new Estufa();
        Electrodomestic elec= new Electrodomestic();


            System.out.println("████████████████████████████████████████████");
            System.out.print("███ Introdueix una Opcio entre el  1-6: ");
            numBusqueda=sc.nextInt();
            System.out.println("████████████████████████████████████████████");



            switch (numBusqueda){
                case 0:
                    System.out.println("***/////////Fi del Programa/////////***");
                    break;
                case 1:
                    System.out.println("[ 1 ] Donar de alta a un client");
                    a.altaClient(cl);
                    break;

                case 2:
                    System.out.println("[ 2 ] Donar de baixa a un client");

                    System.out.println("█████ Actualment Anulada aquesta opcio █████");
                    es.carregaElectrodomestics();
                    es.llistarElectrodomestics();
                    break;

                case 3:
                    System.out.println("[ 3 ] Donar de alta a un nou Electrodomestic");
                    es.donarAlta(elec);


                    break;

                 case 4:
                    System.out.println("[ 4 ] Comprar electrodomesrics");
                    System.out.println("█████ Actualment Anulada aquesta opcio █████");
                    cm.setTotal(100);
                    break;

                case 5:
                    System.out.println("[ 5 ] Consultar Stock");
                    System.out.println("MOSTRAR ESTUFES");
                    estufa.carregaEstufes();
                    estufa.llistaEstufes();

                    break;

                 case  6:
                    System.out.println("[ 6 ] Mostrar llista de clients\n");
                    System.out.println("Nom ██ Cognoms ████████ NIF\n");
                    a.llistaClients();
                    break;
                default:
                    System.out.print("█████ Valor Incorrecte █████\n███ Introdueix un nou nombre entre el 1 y el 6 : ");
                    sc.next();

                    break;
        }
        }






    public void menu() {

        oMenu = new String[6];

        oMenu[0] = "Donar de alta a un client";
        oMenu[1] = "Donar de baixa a un client";
        oMenu[2] = "Donar de alta un nou Elecrodomestic";
        oMenu[3] = "Comprar electrodomesrics";
        oMenu[4] = "Consultar Stock";
        oMenu[5] = "Mostrar llista de clients";
    }

    public void mostrarMenu() {
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
        for (int i = 0; i < oMenu.length; i++) {


            System.out.println(" [  "  + (i+1) + " ] " + oMenu[i]);

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
            System.out.println(" 'Enter' per a tornar al menu ");
            enter = e.nextLine();

        } while (!(enter.isEmpty()));

    }



}




