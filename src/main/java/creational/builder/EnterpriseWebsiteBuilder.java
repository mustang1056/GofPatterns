package creational.builder;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Enterprise website");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrie() {
        webSite.setPrice(1000);
    }
}
