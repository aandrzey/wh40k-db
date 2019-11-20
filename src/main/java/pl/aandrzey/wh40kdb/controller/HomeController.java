package pl.aandrzey.wh40kdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.aandrzey.wh40kdb.downloader.impl.XMLDownloaderImpl;
import pl.aandrzey.wh40kdb.loader.impl.TauXMLLoader;

@Controller
public class HomeController {

    XMLDownloaderImpl XMLDownloader;
    TauXMLLoader tauXMLLoader;

    @Autowired
    public HomeController(XMLDownloaderImpl XMLDownloader, TauXMLLoader tauXMLLoader) {
        this.XMLDownloader = XMLDownloader;
        this.tauXMLLoader = tauXMLLoader;
    }

    @RequestMapping("/download")
    public String home() {
        return "download";
    }

    @RequestMapping("/download/all")
    public String download() {
        XMLDownloader.download();
        return "download";
    }

    @RequestMapping("/load/tau")
    public String load() {
        tauXMLLoader.loadData();
        return "download";
    }
}
