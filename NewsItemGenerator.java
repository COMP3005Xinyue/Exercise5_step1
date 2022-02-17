public abstract class NewsItemGenerator {
    public abstract NewsItem createNews(String name, String communique);

    public NewsItem publish(String name, String communique) {
        NewsItem newsItem = createNews(name, communique);
        System.out.println("--- Preparing a long "+ newsItem.getName() + " news item ---");
        System.out.println("Preparing "+ newsItem.getName() +" news");
        System.out.println("Editing this news item");
        System.out.println("Finalizing this new item");
        newsItem.create();
        return newsItem;
    }


}

