package runners;


import dao.JPAEdificioDAO;
import entities.Edificio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AppRunner implements CommandLineRunner {

    @Autowired
    JPAEdificioDAO jpaEdificioDAO;


    @Override
    public void run(String... args) throws Exception {

   var edificio = Edificio.builder()
            .withIndirizzo("via vai")
           .withCitta("Pisa")
           .withNome("Star Hotel")
            .build();

        jpaEdificioDAO.save(edificio);

    }
}
