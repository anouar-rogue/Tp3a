package test;
import metier.Compte;

public class Application {
    public static void main(String[] args) {
        Compte c1 = new Compte(8000);
        Compte c2 = new Compte(9500);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("NBC= "+Compte.getNbComptes());
        System.out.println(c1.getCode());
        System.out.println((c1.getSolde()));
    }
}
