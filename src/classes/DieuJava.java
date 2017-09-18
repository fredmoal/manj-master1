package classes;

public class DieuJava {
    private static DieuJava uniqueInstance = new DieuJava();

    private DieuJava() {

    }

    public static DieuJava getUniqueInstance() {
        return uniqueInstance;
    }
}
