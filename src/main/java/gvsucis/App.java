package gvsucis;

public class App {
    public static void main(String[] args) {
        SalariedEmployee sam = new SalariedEmployee("Sam Jones", 50000.0);
        sam.recordHours(0, 40);
        sam.recordHours(1, 32);
        sam.recordHours(3, 43);
        sam.recordHours(4, 41);
        sam.recordHours(5, 12);
        sam.printPayStatement(6, System.out);

        System.out.println();

        HourlyEmployee george = new HourlyEmployee("George Jones", 28.0);
        george.recordHours(0, 40);
        george.recordHours(1, 32);
        george.recordHours(3, 43);
        george.recordHours(4, 41);
        george.recordHours(5, 15);
        george.printPayStatement(6, System.out);

        // After your refactor is complete, the code below should compile and run:
        /*
        Employee employees[] = {sam, george};
        for (Employee e : employees) {
            e.printPayStatement(6, System.out);
        }
        */
    }
}
