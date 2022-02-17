public interface NewsGenerator {
    public TitleGenerator createTitle(String c);
    public FederationGenerator createFederation(String c);
    public SummaryGenerator createSummary(String c);
}

