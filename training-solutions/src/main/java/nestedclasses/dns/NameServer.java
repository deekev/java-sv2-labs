package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    List<DnsEntry> entries = new ArrayList<>();

    public void addEntry(String hostName, String hostIp) {
        if (!isEntriesNull() && !isEntryExist(hostName, hostIp)) {
            entries.add(new DnsEntry(hostName, hostIp));
        }
    }

    public String getIpByName(String hostName) {
        return getEntryByName(hostName).ip;
    }

    public String getNameByIp(String hostIp) {
        return getEntryByIp(hostIp).name;
    }

    public void removeEntryByName(String hostName) {
        DnsEntry entryToRemove = getEntryByName(hostName);
        entries.remove(entryToRemove);
    }

    public void removeEntryByIp(String hostIp) {
        DnsEntry entryToRemove = getEntryByIp(hostIp);
        entries.remove(entryToRemove);
    }

    private boolean isEntriesNull() {
        if (entries == null) {
            throw new NullPointerException("Entries is null");
        }
        return false;
    }

    private boolean isEntriesEmpty() {
        if (entries.isEmpty()) {
            throw new IllegalArgumentException("Entries is empty");
        }
        return false;
    }

    private boolean isEntryExist(String hostName, String hostIp) {
        if (!isEntriesNull() || !isEntriesEmpty()) {
            for (DnsEntry actual : entries) {
                if (hostName.equals(actual.name) || hostIp.equals(actual.ip)) {
                    throw new IllegalArgumentException("Already exists");
                }
            }
        }
        return false;
    }

    private DnsEntry getEntryByName(String hostName) {
        if (!isEntriesNull() || !isEntriesEmpty()) {
            for (DnsEntry actual : entries) {
                if (hostName.equals(actual.name)) {
                    return actual;
                }
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    private DnsEntry getEntryByIp(String hostIp) {
        if (!isEntriesNull() || !isEntriesEmpty()) {
            for (DnsEntry actual : entries) {
                if (hostIp.equals(actual.ip)) {
                    return actual;
                }
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public class DnsEntry {

        private String name;
        private String ip;

        public DnsEntry(String name, String ip) {
            this.name = name;
            this.ip = ip;
        }
    }
}
