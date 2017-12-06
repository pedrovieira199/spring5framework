package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pt")
@Primary
public class PrimaryPortugueseGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryPortugueseGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Serviço Primario !!!!! PTTTT";
    }
}
