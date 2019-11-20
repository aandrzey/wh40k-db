package pl.aandrzey.wh40kdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.aandrzey.wh40kdb.loader.impl.TauXMLLoader;

@SpringBootApplication
public class Wh40kDbApplication {

    private TauXMLLoader tauXMLLoader;

    @Autowired
    public Wh40kDbApplication(TauXMLLoader tauXMLLoader) {
        this.tauXMLLoader = tauXMLLoader;
    }

    public static void main(String[] args) {
        SpringApplication.run(Wh40kDbApplication.class, args);
    }

    @Bean
    CommandLineRunner init() { //funkcja ktora uruchamia sie podczas startu aplikacji (za kazdym razem)
        return (args) -> {
            //tauXMLLoader.loadData();
        };
    }

}
