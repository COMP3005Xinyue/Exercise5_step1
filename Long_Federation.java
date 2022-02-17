public class Long_Federation implements FederationGenerator {
    private String c;

    public Long_Federation(String communique) {
        c = communique;
    }

    public String outcome(){
        return "ong federation name generated for " + c;
    };
}
