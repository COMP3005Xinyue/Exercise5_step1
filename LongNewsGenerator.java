public class LongNewsGenerator implements NewsGenerator {

    @Override
    public TitleGenerator createTitle(String communique) {
        return new Short_Title(communique);
    }

    @Override
    public FederationGenerator createFederation(String communique) {
        return new Long_Federation(communique);
    }

    @Override
    public SummaryGenerator createSummary(String communique) {
        return new Long_Summary(communique);
    }
}
