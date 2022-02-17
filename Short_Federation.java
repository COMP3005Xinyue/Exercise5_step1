public class Short_Federation implements FederationGenerator {
    private String c;

    public Short_Federation(String communique) {
        c = communique;
    }

    public String outcome(){
        return "short federation name generated for " + c;
    };
}

