package stringmethods;

public class UrlManagerMain {

    public static void main(String[] args) {

        UrlManager urlManager = new UrlManager("https://earthquake.usgs.gov/fdsnws/event/1/query" +
                "?format=geojson&starttime=2014-01-01&endtime=2014-01-02");

        System.out.println(urlManager.getProtocol());
        System.out.println(urlManager.getHost());
        System.out.println(urlManager.getPath());
        System.out.println(urlManager.getQuery());
        System.out.println(urlManager.hasProperty("endtime"));
        System.out.println(urlManager.getProperty("starttime"));
        System.out.println(urlManager.getProperty("format"));
        System.out.println(urlManager.hasProperty("size"));
        System.out.println(urlManager.getProperty("size"));
    }
}