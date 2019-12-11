package pl.aandrzey.wh40kdb.downloader;

import lombok.Getter;

@Getter
public enum DataSourceXML {
    AELDARI_CRAFTWORLDS("https://raw.githubusercontent.com/BSData/wh40k/master/Aeldari%20-%20Craftworlds.cat", "Aeldari - Craftworlds.cat"),
    AELDARI_DRUKHARI("https://raw.githubusercontent.com/BSData/wh40k/master/Aeldari%20-%20Drukhari.cat", "Aeldari - Drukhari.cat"),
    AELDARI_FW_CORSAIRS("https://raw.githubusercontent.com/BSData/wh40k/master/Aeldari%20-%20FW%20Corsairs.cat", "Aeldari - FW Corsairs.cat"),
    AELDARI_HARLEQUINS("https://raw.githubusercontent.com/BSData/wh40k/master/Aeldari%20-%20Harlequins.cat", "Aeldari - Harlequins.cat"),
    AELDARI_YNNARI("https://raw.githubusercontent.com/BSData/wh40k/master/Aeldari%20-%20Ynnari.cat", "Aeldari - Ynnari.cat"),
    CHAOS_CSM("https://raw.githubusercontent.com/BSData/wh40k/master/Chaos%20-%20Chaos%20Space%20Marines.cat", "Chaos - Chaos Space Marines.cat"),
    CHAOS_DEMONS("https://raw.githubusercontent.com/BSData/wh40k/master/Chaos%20-%20Daemons.cat", "Chaos - Daemons.cat"),
    CHAOS_DARK_MECHANICUM("https://raw.githubusercontent.com/BSData/wh40k/master/Chaos%20-%20Dark%20Mechanicum.cat", "Chaos - Dark Mechanicum.cat"),
    CHAOS_DEATH_GUARD("https://raw.githubusercontent.com/BSData/wh40k/master/Chaos%20-%20Death%20Guard.cat", "Chaos - Death Guard.cat"),
    CHAOS_FW_HERETIC_ASTARTES("https://raw.githubusercontent.com/BSData/wh40k/master/Chaos%20-%20FW%20Heretic%20Astartes.cat", "Chaos - FW Heretic Astartes.cat"),
    CHAOS_FW_RENEGADE_AND_HERETICS("https://raw.githubusercontent.com/BSData/wh40k/master/Chaos%20-%20FW%20Renegade%20and%20Heretics.cat", "Chaos - FW Renegade and Heretics.cat"),
    CHAOS_GELLERPOX_INFECTED("https://raw.githubusercontent.com/BSData/wh40k/master/Chaos%20-%20Gellerpox%20Infected.cat", "Chaos - Gellerpox Infected.cat"),
    CHAOS_QUESTOR_TRAITORIS("https://raw.githubusercontent.com/BSData/wh40k/master/Chaos%20-%20Questor%20Traitoris.cat", "Chaos - Questor Traitoris.cat"),
    CHAOS_SERVANTS_OF_THE_ABBYSS("https://raw.githubusercontent.com/BSData/wh40k/master/Chaos%20-%20Servants%20of%20the%20Abyss.cat", "Chaos - Servants of the Abyss.cat"),
    CHAOS_THOUSAND_SONS("https://raw.githubusercontent.com/BSData/wh40k/master/Chaos%20-%20Thousand%20Sons.cat", "Chaos - Thousand Sons.cat"),
    CHAOS_TITANICUS_TRAITORIS("https://raw.githubusercontent.com/BSData/wh40k/master/Chaos%20-%20Titanicus%20Traitoris.cat", "Chaos - Titanicus Traitoris.cat"),
    FALLEN("https://raw.githubusercontent.com/BSData/wh40k/master/Fallen.cat", "Fallen.cat"),
    IMPERIUM_ADEPTUS_ASTRA_TELEPATHICA("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Adeptus%20Astra%20Telepathica.cat", "Imperium - Adeptus Astra Telepathica.cat"),
    IMPERIUM_ADEPTUS_CUSTODES("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Adeptus%20Custodes.cat", "Imperium - Adeptus Custodes.cat"),
    IMPERIUM_ADEPTUS_MECHANICUS("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Adeptus%20Mechanicus.cat", "Imperium - Adeptus Mechanicus.cat"),
    IMPERIUM_ADEPTUS_MINISTORUM("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Adeptus%20Ministorum.cat", "Imperium - Adeptus Ministorum.cat"),
    IMPERIUM_ADEPTUS_TITANICUS("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Adeptus%20Titanicus.cat", "Imperium - Adeptus Titanicus.cat"),
    IMPERIUM_ASTRA_MILITARUM("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Astra%20Militarum.cat", "Imperium - Astra Militarum.cat"),
    IMPERIUM_BLACKSTONE_FORTRESS("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Blackstone%20Fortress.cat", "Imperium - Blackstone Fortress.cat"),
    IMPERIUM_BLOOD_ANGELS("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Blood%20Angels.cat", "Imperium - Blood Angels.cat"),
    IMPERIUM_DARK_ANGELS("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Dark%20Angels.cat", "Imperium - Dark Angels.cat"),
    IMPERIUM_DEATHWATCH("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Deathwatch.cat", "Imperium - Deathwatch.cat"),
    IMPERIUM_ELUCIDIAN_STARSTRIDERS("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Elucidian%20Starstriders.cat", "Imperium - Elucidian Starstriders.cat"),
    IMPERIUM_FW_ADEPTUS_ASTARTES("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20FW%20Adeptus%20Astartes.cat", "Imperium - FW Adeptus Astartes.cat"),
    IMPERIUM_FW_DEATH_KORPS_OF_KRIEG("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20FW%20Death%20Korps%20of%20Krieg.cat", "Imperium - FW Death Korps of Krieg.cat"),
    IMPERIUM_FW_ELYSIANS("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20FW%20Elysians.cat", "Imperium - FW Elysians.cat"),
    IMPERIUM_GREY_KNIGHTS("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Grey%20Knights.cat", "Imperium - Grey Knights.cat"),
    IMPERIUM_INQUISITION("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Inquisition.cat", "Imperium - Inquisition.cat"),
    IMPERIUM_LEGION_OF_THE_DAMNED("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Legion%20of%20the%20Damned.cat", "Imperium - Legion of the Damned.cat"),
    IMPERIUM_OFFICIO_ASSASSINORUM("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Officio%20Assassinorum.cat", "Imperium - Officio Assassinorum.cat"),
    IMPERIUM_QUESTOR_IMPERIALIS("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Questor%20Imperialis.cat", "Imperium - Questor Imperialis.cat"),
    IMPERIUM_SISTERS_OF_SILENCE("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Sisters%20of%20Silence.cat", "Imperium - Sisters of Silence.cat"),
    IMPERIUM_SPACE_MARINES("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Space%20Marines.cat", "Imperium - Space Marines.cat"),
    IMPERIUM_SPACE_WOLVES("https://raw.githubusercontent.com/BSData/wh40k/master/Imperium%20-%20Space%20Wolves.cat", "Imperium - Space Wolves.cat"),
    NECRONS("https://raw.githubusercontent.com/BSData/wh40k/master/Necrons.cat", "Necrons.cat"),
    ORKS("https://raw.githubusercontent.com/BSData/wh40k/master/Orks.cat", "Orks.cat"),
    TAU_EMPIRE("https://raw.githubusercontent.com/BSData/wh40k/master/T'au%20Empire.cat", "T'au Empire.cat"),
    TYRANIDS_GENESTEALER_CULTS("https://raw.githubusercontent.com/BSData/wh40k/master/Tyranids%20-%20Genestealer%20Cults.cat", "Tyranids - Genestealer Cults.cat"),
    TYRANIDS("https://raw.githubusercontent.com/BSData/wh40k/master/Tyranids.cat", "Tyranids.cat");


    private final String url;
    private final String fileName;

    DataSourceXML(String fileUrl, String fileName) {
        this.url = fileUrl;
        this.fileName = fileName;
    }

}
