import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args)  {

        NewsItemGenerator sprl = new ShortNewsItemGenerator();
        NewsItemGenerator lprl = new LongNewsItemGenerator();
        NewsItem newsItem;

        //For simplicity, we are using strings for the communiques
        //But in fact each would be a long text in English describing at length ALL results for a day at the Olympics

        //STEP 1
        System.out.println("STEP 1: Testing factories");
        System.out.println("TEST CASE 1");
        newsItem = sprl.publish("skating", "communique1");
        System.out.println("Short version for communique1 " + newsItem + "\n");


        System.out.println("TEST CASE 2");
        newsItem = lprl.publish("ski", "communique1");
        System.out.println("Long version for communique1 " + newsItem + "\n");

        System.out.println("TEST CASE 3");
        newsItem = sprl.publish("bobsleigh", "communique2");
        System.out.println("Short version for communique2 " + newsItem + "\n");

        System.out.println("TEST CASE 4");
        newsItem = lprl.publish("hockey", "communique3");
        System.out.println("Long version for communique3 " + newsItem + "\n");
/*
        //STEP 2
        System.out.println("STEP 2: Testing decorators that wrap original news item");
        System.out.println("TEST CASE 5");
        newsItem = sprl.publish("bobsleigh", "communique1");
        newsItem = newsItem.addTranslation(new ArrayList<String>(Arrays.asList("French", "Mandarin")));
        System.out.println("Short version for communique1 " + newsItem + "\n");

        System.out.println("TEST CASE 6");
        newsItem = lprl.publish("bobsleigh", "communique1");
        newsItem = newsItem.addTranslation(new ArrayList<String>(Arrays.asList( "Mandarin", "French")));
        System.out.println("Long version for communique1 " + newsItem + "\n");

        System.out.println("TEST CASE 7");
        newsItem = sprl.publish("hockey", "communique2");
        newsItem = newsItem.addTranslation(new ArrayList<String>(Arrays.asList("Japanese")));
        System.out.println("Short version for communique2 " + newsItem + "\n");

        System.out.println("TEST CASE 8");
        newsItem = lprl.publish("skating", "communique2");
        newsItem = newsItem.addTranslation(new ArrayList<String>(Arrays.asList("Japanese")));
        System.out.println("Long version for communique2 " + newsItem + "\n");

        System.out.println("TEST CASE 9");
        newsItem = sprl.publish("ski", "communique3");
        newsItem = newsItem.addTranslation(new ArrayList<String>(Arrays.asList("Mandarin", "Japanese", "French")));
        System.out.println("Short version for communique3 " + newsItem + "\n");

        System.out.println("TEST CASE 10");
        newsItem = lprl.publish("ski", "communique3");
        newsItem = newsItem.addTranslation(new ArrayList<String>(Arrays.asList("Japanese", "French", "Mandarin")));
        System.out.println("Long version for communique3 " + newsItem + "\n");
*/
    }
}

