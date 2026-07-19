package opencart.pages;

import com.microsoft.playwright.Page;

public class HomePage {
    Page page;
    //1.String locators -OR
    private String search="input[name='search']";
    private String searchIcon="div#search button";
    private String searchPageHeader="div#content h1";


    //2.Constructor of the page class
    public HomePage(Page page) {
        this.page = page;
    }
    //3.Page actions/methods
    public String getHomePageTitle() {
        String title=page.title();
        System.out.println("Page title is: "+title);
        return title;
    }
    public String getHomePageURL() {
        String url=page.url();
        System.out.println("Page url is: "+url);
        return url;
    }
    public String doSearch(String productName) {
        page.fill(search,productName);
        page.click(searchIcon);
        String header=page.textContent(searchPageHeader);
        System.out.println("Search page header is: "+header);
        return header;
    }
}
