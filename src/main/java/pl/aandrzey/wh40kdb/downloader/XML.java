package pl.aandrzey.wh40kdb.downloader;

import lombok.Getter;

@Getter
public enum XML {
    AELDARI_CRAFTWORLDS("https://github.com/BSData/wh40k/blob/master/Aeldari%20-%20Craftworlds.cat", "Aeldari - Craftworlds.cat"),
    AELDARI_DRUKHARI("https://github.com/BSData/wh40k/blob/master/Aeldari%20-%20Drukhari.cat", "Aeldari - Drukhari.cat"),
    AELDARI_FW_CORSAIRS("https://github.com/BSData/wh40k/blob/master/Aeldari%20-%20FW%20Corsairs.cat", "Aeldari - FW Corsairs.cat"),
    TAU_EMPIRE("https://github.com/BSData/wh40k/blob/master/T'au%20Empire.cat", "T'au Empire.cat");


    private final String url;
    private final String fileName;

    XML (String fileUrl, String fileName){
        this.url = fileUrl;
        this.fileName = fileName;
    }

}
