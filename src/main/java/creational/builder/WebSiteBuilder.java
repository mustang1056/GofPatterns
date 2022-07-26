package creational.builder;

public abstract class WebSiteBuilder {
    WebSite webSite;

    void createWebsite(){
        webSite = new WebSite();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrie();

    WebSite getWebSite(){
        return webSite;
    }
}
