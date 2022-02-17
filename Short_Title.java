public class Short_Title implements TitleGenerator {
    private String c;

    public Short_Title(String communique) {
        c = communique;
    }

    public String outcome(){
        return "short title generated for " + c;
    };
}
