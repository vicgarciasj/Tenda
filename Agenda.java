


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 * Class Agenda
 */
public class Agenda {

    public ArrayList<Client>llistaCli = new ArrayList<Client>();



    public Agenda () {
        carregaClients();

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


    public Client altaClient() {
        Scanner sc= new Scanner(System.in);

        Client cli=new Client();
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

        return cli;

    }

    public void altaNouClient(Client cli){
        llistaCli.add(cli);
    }




    public Boolean baixaClient(String NIF) {
        Iterator<Client>iterCli=getLlistaClients().iterator();

        while (iterCli.hasNext()){
            Client c=iterCli.next();
            if (c.DNI.equals(NIF)){
                this.llistaCli.remove(c);
                System.out.println("Client Esborrat edita");
                return true;
            }
        }
        System.out.println("ERROR***Client NO Esborrat***");
        return false;

    }


    public boolean editaClient(String dni){
        int num=0;
        Iterator<Client>iterCli=getLlistaClients().iterator();
        while (iterCli.hasNext()){
            Client c=iterCli.next();
            if (c.DNI.equals(dni)){
                this.llistaCli.set(num,c);
                System.out.println("Client Esborrat edita");
                return true;
            }
            num++;
        }
        System.out.println("ERROR***Client NO Esborrat***");
        return false;

    }



    private ArrayList<Client> LlistaCli() {

        return this.llistaCli;

    }

    public ArrayList<Client> getLlistaClients() {
        return llistaCli;
    }



}
