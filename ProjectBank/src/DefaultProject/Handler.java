package DefaultProject;

import java.util.Scanner;

public class Handler {
    // BANK INFO
    String Bank = "UniCredit";
    // DEFAULT INT ( VERSAMENTO )
    int def;
    @Deprecated
    public int versamento(int def) {
        this.def = def;
        return def;
    }
    // INFORMAZIONI ACCOUNT
    String account = "harrysChecking";
    int ac = 0;
    int prelievo1;
    int prelievo2;
    @Deprecated
    public int prelievo1(int prelievo1) {
        this.prelievo1 = prelievo1;
        return prelievo1;
    }
    @Deprecated
    public int prelievo2(int prelievo2) {
        this.prelievo2 = prelievo2;
        return prelievo2;
    }
    public void harrysChecking() {
        Scanner a = new Scanner(System.in);
        System.out.println("Conto Bancario: harrysChecking\n");
        System.out.println("Quantita` versamento:");
        int v = a.nextInt();
        def = v;
        System.out.println("Prima Somma da Prelevare:");
        int p = a.nextInt();
        int pc = v - p;
        System.out.println("Seconda Somma da Prelevare");
        int p2 = a.nextInt();
        int pc2 = p - p2;
        System.out.println(pc2);
    }
    public void momsSaving() {
        Scanner b = new Scanner(System.in);
        System.out.println("Conto Bancario: momsSaving");;

        int def = 1000;
        System.out.println("Somma Default: " + def);
        int calc = def * 365 / 100;
        System.out.println("Somma Default + interesse 10% " + calc);
    }
    public static void main(String[] args) {
        new Handler().harrysChecking();
        new Handler().momsSaving();
    }
}
