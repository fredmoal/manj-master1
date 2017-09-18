package chaine;

import java.util.Arrays;

public class Url {
    private String protocole;
    private String[] adresse;

    public void initialiserUrl(String url) {
        // décomposition url :
        // http://www.je-comprends.org/que/dalle
        // protocole = http
        // adresse[0] = www.je-comprends.org
        // adresse[1] = que
        // adresse[2] = dalle
        int position = url.indexOf("://");
        protocole = url.substring(0,position);
        String reste = url.substring(position+3,url.length());
        adresse = reste.split("/");

    }

    @Override
    public String toString() {
        return "Url{" +
                "protocole='" + protocole + '\'' +
                ", adresse=" + Arrays.toString(adresse) +
                '}';
    }

    public static void main(String... args) {
        Url url = new Url();
        url.initialiserUrl("http://www.je-comprends.org/que/dalle");
        System.out.println(url);
        url.initialiserUrl("ftp://freedownload.org");
        System.out.println(url);
    }
}
