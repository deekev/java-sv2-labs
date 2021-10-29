package stringmethods;

public class UrlManager {

    private String protocol;
    private int port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        protocol = identifyProtocol(url);
        host = identifyHost(url);
        path = identifyPath(url);
        query = identifyQuery(url);
    }

    public String getProtocol() {
        return protocol;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public boolean hasProperty(String key) {
        if(!"".equals(query) && query.contains(key)) {
            return true;
        }
        return false;
    }

    public String getProperty(String key) {
        if(hasProperty(key)) {
            int indexBefore = query.indexOf(key) + key.length() + 1;
            int indexAfter = query.indexOf("&", indexBefore);
            return query.substring(indexBefore, indexAfter);
        }
        return "";
    }

    private String identifyProtocol(String url) {
        url = url.trim().toLowerCase();
        return url.substring(0, url.indexOf(":"));
    }

    private String identifyHost(String url) {
        url = url.trim().toLowerCase();
        int indexBefore = url.indexOf("/");
        int indexAfter = url.indexOf("/", indexBefore + 2);
        return url.substring(indexBefore + 2, indexAfter);
    }

    private String identifyPath(String url) {
        if (url.length() > protocol.length() + 3 + host.length() + 1){
            return url.substring(url.indexOf(host) + host.length() + 1, url.indexOf("?"));
        }
        return "";
    }

    private String identifyQuery(String url) {
        if (url.contains("?")) {
            return url.substring(url.indexOf("?") + 1);
        }
        return "";
    }
}