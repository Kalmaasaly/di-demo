package guru.springframework.didemo.Repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello 1- I'm PrimaryGreetingService" ;
    }

    @Override
    public String getSpanishGreeting() {
        return "Service2 de Saludo Primrio";
    }

    @Override
    public String getGermanGreeting() {
        return "primäre 3Begrüßung";
    }
}
