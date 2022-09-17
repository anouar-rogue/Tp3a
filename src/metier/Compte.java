package metier;

public class Compte {
    private int code;
    private float solde;
    private static int nbComptes;

    public Compte(float s) {
        ++nbComptes;// incrémenter le nombre des comptes
        code = nbComptes;
        solde = s;
    }
    public void verser(float mt){
        solde=solde+mt;
    }
    public void retirer(float mt){
        solde =solde-mt;
    }
    public String toString(){
        return ("Code= "+code+" Solde= "+solde);
    }

    public int getCode() {
        return code;
    }

    public float getSolde() {
        return solde;
    }

    public static int getNbComptes() {
        return nbComptes;
    }
}
