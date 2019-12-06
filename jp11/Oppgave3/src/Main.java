public class Main {
    public static void main(String[] args) {
        var sim = new Simulering(100);

//        System.out.println(sim.toString());
        //Utskrift.printTerninger(sim);

        //sim.printResult();

//        System.out.println(Utskrift.terninger(sim));

        long startTime = System.currentTimeMillis();
        Utskrift.fullPrint(sim);

        long stopTime = System.currentTimeMillis();
        System.out.println("Time to execute: " + (stopTime - startTime));



    }
}
