


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 * Class Agenda
 */
public class Agenda {

    ArrayList<Client>llistaCli = new ArrayList<Client>();
    Iterator<Client>iterCli;


    public Agenda () {

        llistaCli.add(carregaClients());

    }

    public Client carregaClients() {
        try {

            File fc= new File("clients.txt");
            Scanner sc= new Scanner(fc);

            while (sc.hasNextLine()){
                String strLine= sc.nextLine();
                Client c= new Client(strLine);
                llistaCli.add(c);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("Error clients");
        }
        return null;
    }


    public void altaClient(Client c) {

        Scanner sc= new Scanner(System.in);
        c =new Client();
        System.out.print("Introdueix nom: ");
        c.nom=sc.nextLine();
        System.out.print("Introdueix el primer cognom: ");
        c.cognom1=sc.nextLine();
        System.out.print("Introdueix el segon cognom  del Client: ");
        c.cognom2=sc.nextLine();
        System.out.print("Introdueix el NIF: ");
        c.NIF=sc.nextLine();
        System.out.println("██████████████████████████████████████████████");
        System.out.println("Nou Client: "+c.nom+" "+c.cognom1+" "+c.cognom2+" amb NIF:"+c.NIF);

        this.llistaCli.add(c);

    }

    public void baixaClient(String NIF) {
        ArrayList<Client>llistaCli = new ArrayList<Client>();


    }



    public void llistaClients() {

        iterCli = llistaCli.iterator();
        while (iterCli.hasNext()) {
            System.out.println(iterCli.next() + " ");
            System.out.println("_________________________________/");

        }


    }
}
