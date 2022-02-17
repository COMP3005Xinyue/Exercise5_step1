public class ShortNewsGenerator implements NewsGenerator {

    @Override
    public TitleGenerator createTitle(String communique) {
        return new Short_Title(communique);
    }

    @Override
    public FederationGenerator createFederation(String communique) {
        return new Short_Federation(communique);
    }

    @Override
    public SummaryGenerator createSummary(String communique) {
        return new Short_Summary(communique);
    }
}
