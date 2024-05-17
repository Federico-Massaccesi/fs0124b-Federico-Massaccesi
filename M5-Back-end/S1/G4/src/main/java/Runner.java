import classes.Toppings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {


    @Autowired
    @Qualifier("Mozzarella")
    Toppings Mozzarella;

    @Override
    public void run(String... args) throws Exception {

        log.info(Mozzarella.toString());
    }
}
