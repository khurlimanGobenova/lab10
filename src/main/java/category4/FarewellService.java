package category4;

import org.springframework.stereotype.Service;

public interface FarewellService {
    String getFarewell();
}

@Service
class FarewellServiceImpl implements FarewellService {
    public String getFarewell() {
        return "Goodbye, Spring Boot!";
    }
}