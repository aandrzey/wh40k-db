package pl.aandrzey.wh40kdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.aandrzey.wh40kdb.loader.impl.WeaponCSVLoader;

@SpringBootApplication
public class Wh40kDbApplication {

    private WeaponCSVLoader weaponCSVLoader;

    @Autowired
    public Wh40kDbApplication(WeaponCSVLoader weaponCSVLoader) {
        this.weaponCSVLoader = weaponCSVLoader;
    }

    public static void main(String[] args) {
        SpringApplication.run(Wh40kDbApplication.class, args);
    }

    @Bean
    CommandLineRunner init() { //funkcja ktora uruchamia sie podczas startu aplikacji (za kazdym razem)
        return (args) -> {

            weaponCSVLoader.loadData();

        };
    }

}
