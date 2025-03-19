package category4;

import org.springframework.stereotype.Service;

@Service("defaultGreeting")
public class GreetingServiceImpl implements GreetingService {
    public String getGreeting() {
        return "Hello, Spring Boot!";
    }
}
