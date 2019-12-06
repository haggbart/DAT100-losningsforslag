package Oppgave1;

public class D {
    public static double f(int a, double b){
        return a - b;
    }
    public static double f(double a, int b){ // denne blir kjørt
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(f(4.0, 7)); // 11.0
    }
}
