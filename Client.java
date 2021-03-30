
import java.util.Scanner;


/**
 * Class Client
 */
public class Client {
  public String nom;
  public String cognom1;
  public  String cognom2;
  public String NIF;
  public  String DNI;



  public Client(){

  }

  public Client (String str) {

      String info[] =str.split(";");
        nom=info[0];
        cognom1=info[1];
        cognom2=info[2];
        DNI=info[3];
        NIF=DNI;

  }

  public String toString(){

      return this.nom+" "+this.cognom1+" "+this.cognom2+" "+this.DNI ;
  }

  public String getNom() {
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
  }
}
