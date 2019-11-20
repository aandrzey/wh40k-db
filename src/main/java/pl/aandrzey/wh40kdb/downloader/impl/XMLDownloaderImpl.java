package pl.aandrzey.wh40kdb.downloader.impl;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;
import pl.aandrzey.wh40kdb.downloader.DataSourceXML;
import pl.aandrzey.wh40kdb.downloader.XMLDownloader;

import java.io.File;
import java.io.IOException;
import java.net.URL;

@Component
public class XMLDownloaderImpl implements XMLDownloader {
    @Override
    public void download() {

        for (DataSourceXML dataSourceXML : DataSourceXML.values()) {
            try {
                FileUtils.copyURLToFile(
                        new URL(dataSourceXML.getUrl()),
                        new File("data/" + dataSourceXML.getFileName()),
                        10000,
                        10000);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
