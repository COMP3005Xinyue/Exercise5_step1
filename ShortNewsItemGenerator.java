public class ShortNewsItemGenerator extends NewsItemGenerator {

    @Override
    public NewsItem createNews(String name, String communique) {
        NewsItem newsItem = null;
        NewsGenerator newsGenerator = new ShortNewsGenerator();

        if (name.equals("skating")){
            newsItem = new SkatingNews(newsGenerator, communique);
            newsItem.setName("skating");
        }else if (name.equals("ski")){
            newsItem = new SkiNews(newsGenerator, communique);
            newsItem.setName("ski");
        }else if (name.equals("bobsleigh")){
            newsItem = new BobsleighNews(newsGenerator, communique);
            newsItem.setName("bobsleigh");
        }else if (name.equals("hockey")){
            newsItem = new HockeyNews(newsGenerator, communique);
            newsItem.setName("hockey");
        }

        return newsItem;
    }
}