
public class WebCrawler implements WebCrawlerInterface {
    //maximum number of distinct links crawler can process
    //defaults to 10
    private int maxLinks = 10;
    //maximum depth of search (priority)
    //defaults to 2
    private int maxDepth = 2;
    public WebCrawler(){

    }
    //open an HTTP connection to the starting URL and review the entire web page found there
    //save all URL links found within the page to a temporary database table
    //database table contains two columns which are: * column containing complete URLS with base references appended as needed
    //                                               * priority queue number
    public void crawl(String url, String database)
    {

    }
    public int search (String url)
    {
        return 1;
    }
    private void setMaxLinks(int numberOfLinks)
    {

    }
    private void setMaxDepth(int myDepth)
    {

    }
}
