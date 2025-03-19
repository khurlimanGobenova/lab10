package category5;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryService {
    private List<String> calculationHistory = new ArrayList<>();

    public void addCalculation(String operation, int a, int b, Object result) {
        String calculation = String.format("%s(%d, %d) = %s", operation, a, b, result.toString());
        calculationHistory.add(calculation);
        System.out.println("Logged calculation: " + calculation);
    }

    public List<String> getHistory() {
        return new ArrayList<>(calculationHistory);
    }

    public void clearHistory() {
        calculationHistory.clear();
    }
}