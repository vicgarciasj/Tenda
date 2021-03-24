
import java.util.Scanner;


/**
 * Class Client
 */
public class Client {
  public Scanner sc= new Scanner(System.in);
  public String info[];
  public String nom;
  public String cognom1;
  public  String cognom2;
  public String NIF;
  public  String DNI;



  public Client(){

  }

  public Client (String str) {

      String info[] =str.split(";");
        this.nom=info[0];
        this.cognom1=info[1];
        this.cognom2=info[2];
        this.DNI=info[3];
        this.NIF=DNI;

    this.nom=nom;
    this.cognom1=cognom1;
    this.cognom2=cognom2;
    this.NIF=NIF;
    this.NIF=DNI;

  }

  public String toString(){

      return this.nom+" "+this.cognom1+" "+this.cognom2+" "+this.DNI ;
  }

  /*public String getNom() {
      return nom;
  }

  public void setNom(String nom) {
      this.nom = nom;
  }

  public String getCognom1() {
      return cognom1;
  }

  public void setCognom1(String cognom1) {
      this.cognom1 = cognom1;
  }

  public String getCognom2() {
      return cognom2;
  }

  public void setCognom2(String cognom2) {
      this.cognom2 = cognom2;
  }*/
}
