package creational.builder;

public class VisitCardWebsiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Visit card");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrie() {
        webSite.setPrice(500);
    }
}
