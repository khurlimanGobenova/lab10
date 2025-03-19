package category5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    private final HistoryService historyService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService,
                                HistoryService historyService) {
        this.calculatorService = calculatorService;
        this.historyService = historyService;
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        int result = calculatorService.add(a, b);
        historyService.addCalculation("add", a, b, result);
        return result;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        int result = calculatorService.subtract(a, b);
        historyService.addCalculation("subtract", a, b, result);
        return result;
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        int result = calculatorService.multiply(a, b);
        historyService.addCalculation("multiply", a, b, result);
        return result;
    }

    @GetMapping("/divide")
    public double divide(@RequestParam int a, @RequestParam int b) {
        double result = calculatorService.divide(a, b);
        historyService.addCalculation("divide", a, b, result);
        return result;
    }

    @GetMapping("/history")
    public List<String> getHistory() {
        return historyService.getHistory();
    }

    @DeleteMapping("/history")
    public void clearHistory() {
        historyService.clearHistory();
    }
}