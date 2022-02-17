public class Short_Summary implements SummaryGenerator {
    private String c;

    public Short_Summary(String communique) {
        c = communique;
    }

    public String outcome(){
        return "short summary generated for " + c;
    };
}

