package pl.aandrzey.wh40kdb.downloader;

import lombok.Getter;

@Getter
public enum DataSourceXML {
    AELDARI_CRAFTWORLDS("https://raw.githubusercontent.com/BSData/wh40k/master/Aeldari%20-%20Craftworlds.cat", "Aeldari - Craftworlds.cat"),
    AELDARI_DRUKHARI("https://raw.githubusercontent.com/BSData/wh40k/master/Aeldari%20-%20Drukhari.cat", "Aeldari - Drukhari.cat"),
    AELDARI_FW_CORSAIRS("https://raw.githubusercontent.com/BSData/wh40k/master/Aeldari%20-%20FW%20Corsairs.cat", "Aeldari - FW Corsairs.cat"),
    TAU_EMPIRE("https://raw.githubusercontent.com/BSData/wh40k/master/T'au%20Empire.cat", "T'au Empire.cat");


    private final String url;
    private final String fileName;

    DataSourceXML(String fileUrl, String fileName){
        this.url = fileUrl;
        this.fileName = fileName;
    }

}
