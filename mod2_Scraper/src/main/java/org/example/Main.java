package org.example;

import org.jsoup.Jsoup;
import org.w3c.dom.Document;

import java.io.IOException;
import java.sql.Connection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // sample output:  System.out.printf("Hello and welcome!");


    }


    // Press Shift+F10 or click the green arrow button in the gutter to run the code.
    // Press Shift+F9 to start debugging your code. We have set one breakpoint
    // for you, but you can always add more by pressing Ctrl+F8.
    public static Document getDocument(String url) {
        Connection conn = Jsoup.connect(url);
        Document document = null;
        try {
            document = conn.get();
        } catch (IOException e) {
            e.printStackTrace();
            // handle error
        }
        return document;
    }
}

