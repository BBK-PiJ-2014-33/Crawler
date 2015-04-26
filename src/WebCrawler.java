import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebCrawler implements WebCrawlerInterface {
    //maximum number of distinct links crawler can process
    //defaults to 10
    private static final int maxLinks = 10;
    //maximum depth of search (priority)
    //defaults to 2
    private static final int maxDepth = 2;
    public WebCrawler(){

    }
    //open an HTTP connection to the starting URL and review the entire web page found there
    //save all URL links found within the page to a temporary database table
    //database table contains two columns which are: * column containing complete URLS with base references appended as needed
    //                                               * priority queue number
    //process until either:
    //                      number of distinct links has been exhausted
    //                      all links related to the maximum depth (priority number) have been processed
    //                      there are no links remaining to be processed
    public void crawl(String url, String database)
    {
        //open an HTTP connection to the starting URL
        try{
            URL myUrl = new URL(url);
            HttpURLConnection myConnection = (HttpURLConnection) myUrl.openConnection();
            readStream(myConnection.getInputStream());
        } catch (Exception e){
            e.printStackTrace();
        }
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
    private void readStream(InputStream myInputStream)
    {

    }
}
