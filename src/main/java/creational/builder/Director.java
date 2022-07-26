package creational.builder;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder webSiteBuilder) {
        this.builder = webSiteBuilder;
    }

    WebSite buildWebsite(){
          builder.createWebsite();
          builder.buildName();
          builder.buildCms();
          builder.buildPrie();

          WebSite webSite = builder.getWebSite();

          return webSite;
    }
}
