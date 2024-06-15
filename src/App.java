public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ich will kontrolliert werden:");

        Version version = new Version(1.0, "EIneNeueApp");
        Person pers = new Person("Gerda", 66, "weiblich");

        System.out.println(version);
        System.out.println("Ich bin eine Änderung!");
        System.out.println("Ich bin eine weitere Änderung!");
        System.out.println("Und noch eine!");


        System.out.println("git diff test"); 
        System.out.println(pers); 
    }
}
