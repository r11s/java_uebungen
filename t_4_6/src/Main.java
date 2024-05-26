
import java.net.URI;
import java.net.URL;
import java.io.InputStream;

/*
 * Dieseses liest Daten aus dem Internet
 */
public class Main {
    public static void main(String[] args) throws Exception {

        // make url
        URL url = new URI("https://de.wikipedia.org/wiki/Ball").toURL(); // Internetseite Verbindung oeffnen

        // get stream
        InputStream in = url.openStream();

        // read
        for (int i = 0; i < 1000; ++i) {
            System.out.print((char) (in.read()));
        }
    }
}
/*
 *
 * <!DOCTYPE html>
 * <html class="client-nojs" lang="de" dir="ltr">
 * <head>
 * <meta charset="UTF-8">
 * <title>Ball – Wikipedia</title>
 * ....
 *
 * <!DOCTYPE html>
 * <html class="client-nojs" lang="de" dir="ltr">
 * <head>
 * <meta charset="UTF-8">
 * <title>Ball â Wikipedia</title>
 * <script>(function(){var className="c
 * ...
 */
