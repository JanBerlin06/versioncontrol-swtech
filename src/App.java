public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ich will kontrolliert werden:");

        Version version = new Version(1.0, "EIneNeueApp");

        System.out.println(version);
        System.out.println("Ich bin eine Änderung!");
        System.out.println("Ich bin eine weitere Änderung!");
        System.out.println("Und noch eine!");
    }
}
