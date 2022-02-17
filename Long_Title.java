public class Long_Title implements TitleGenerator {
    private String c;

    public Long_Title(String communique) {
        c = communique;
    }

    public String outcome(){
        return "long title generated for " + c;
    };
}
