package pl.aandrzey.wh40kdb.downloader;

import java.util.List;
import java.util.Map;

public interface XMLDownloader {

    void download();

    default boolean isRedirected(Map<String, List<String>> header) {
        for (String hv : header.get(null)) {
            if (hv.contains(" 301 ")
                    || hv.contains(" 302 ")) return true;
        }
        return false;
    }
}
