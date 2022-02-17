public class SkiNews extends NewsItem {
    NewsGenerator newsGenerator;
    String c;

    public SkiNews(NewsGenerator news, String communique){
        newsGenerator = news;
        c = communique;
    }

    void create(){
        tg = newsGenerator.createTitle(c);
        fg = newsGenerator.createFederation(c);
        sg = newsGenerator.createSummary(c);
    }
}
