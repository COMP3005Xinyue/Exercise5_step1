

public abstract class NewsItem {
    String name;
    TitleGenerator tg;
    FederationGenerator fg;
    SummaryGenerator sg;

    abstract void create();

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(name + " news item\n");
        result.append(tg.outcome());
        result.append("\n");
        result.append(fg.outcome());
        result.append("\n");
        result.append(sg.outcome());
        result.append("\n");

        return result.toString();
    }
}

