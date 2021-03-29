


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;


/**
 * Class Agenda
 */
public class Agenda {

    public ArrayList<Client>llistaCli = new ArrayList<Client>();



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
            System.out.println("Error  al carregar clients");
        }
        return null;

    }


    public void altaClient(Client cli) {
        Scanner sc= new Scanner(System.in);
        Tenda t=new Tenda();
        cli =new Client();
        System.out.print("Introdueix nom: ");
        cli.nom=sc.nextLine();
        System.out.print("Introdueix el primer cognom: ");
        cli.cognom1=sc.nextLine();
        System.out.print("Introdueix el segon cognom  del Client: ");
        cli.cognom2=sc.nextLine();
        System.out.print("Introdueix el NIF: ");
        cli.DNI=sc.nextLine();
        System.out.println("██████████████████████████████████████████████");
        System.out.println("Nou Client: "+cli.nom+" "+cli.cognom1+" "+cli.cognom2+" amb DNI:"+cli.DNI);
        System.out.println("██████████████████████████████████████████████");
        t.altCli(cli);

    }




    public Boolean baixaClient(String NIF) {
        Iterator<Client>iter;
        iter=this.llistaCli.iterator();
        while (iter.hasNext()){
            Client c=new Client();
            c=iter.next();
            if (c.NIF== c.DNI){
                this.llistaCli.remove(c);
                return true;
            }
        }
        return false;

    }



    private ArrayList<Client> LlistaCli() {

        return this.llistaCli;

    }

    public ArrayList<Client> getLlistaClients() {
        return llistaCli;
    }



}
