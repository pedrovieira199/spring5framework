package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - I was injected by the getter!!!!!";
    }

    @Override
    public String getPortugueseGreeting() {
        return "Serviço Primario !!!!! PTTTT";
    }

    @Override
    public String getGermanGreeting() {
        return "Serviço Alemao -- DE";
    }
}
