package DefaultPackage;

public class Handler {
    public void start() {
        System.out.println("Conto Bancario harrysChecking:");
        int def = 1000;
        System.out.println("Somma default: " + def);
        int p1 = def - 500;
        System.out.println("Prelievo 1: " + p1);
        int p2 = p1 - 400;
        System.out.println("Prelievo 2: " + p2 + "\n");
        System.out.println("Conto Bancario momsSaving: " + def );
        int calc = def * 365 / 100;
        System.out.println("Interesse applicato: " + calc);
    }
    public static void main(String[] args) {
        new Handler().start();
    }
}
