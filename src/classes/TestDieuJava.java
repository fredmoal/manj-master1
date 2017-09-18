package classes;

public class TestDieuJava {
    public static void main(String... args) {
        DieuJava dieuJava = DieuJava.getUniqueInstance();
        DieuJava dieuJava2 = DieuJava.getUniqueInstance();
        System.out.println(dieuJava== dieuJava2);
    }
}
