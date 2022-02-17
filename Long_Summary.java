public class Long_Summary implements SummaryGenerator {
    private String c;

    public Long_Summary(String communique) {
        c = communique;
    }

    public String outcome(){
        return "long summary generated for " + c;
    };
}
