package DefaultPackage;

import java.util.Random;

public class Handler {
    public void Dado() {
        Random a = new Random();
        int b = a.nextInt(6);
        System.out.println(b);
    }
    public static void main(String[] args) {
        new Handler().Dado();
    }
}
