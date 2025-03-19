package category4;

import org.springframework.stereotype.Service;

@Service("formalGreeting")
public class FormalGreetingServiceImpl implements GreetingService {
    public String getGreeting() {
        return "Good day, esteemed Spring Boot user!";
    }
}
