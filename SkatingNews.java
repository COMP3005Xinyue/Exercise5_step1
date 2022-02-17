public class SkatingNews extends NewsItem {
    NewsGenerator newsGenerator;
    String c;

    public SkatingNews(NewsGenerator news, String communique){
        newsGenerator = news;
        c = communique;
    }

    void create(){
        tg = newsGenerator.createTitle(c);
        fg = newsGenerator.createFederation(c);
        sg = newsGenerator.createSummary(c);
    }
}
