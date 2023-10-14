package webservice;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date datDeCreation;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Compte() {
    }

    public Compte(int code, double solde, Date datDeCreation) {
        this.code = code;
        this.solde = solde;
        this.datDeCreation = datDeCreation;
    }
}
