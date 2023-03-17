package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceInterface calculatorServiceImp;

    public CalculatorController(CalculatorServiceInterface calculatorServiceImp) {
        this.calculatorServiceImp = calculatorServiceImp;
    }

    @GetMapping
    public String calculatorInfo() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String folding(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        String calculatorResult = num1 + " + " + num2 + " = " + calculatorServiceImp.folding(num1, num2);
        return calculatorResult;
    }

    @GetMapping(path = "/minus")
    public String deduct(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        String calculatorResult = num1 + " - " + num2 + " = " + calculatorServiceImp.deduct(num1, num2);
        return calculatorResult;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        String calculatorResult = num1 + " * " + num2 + " = " + calculatorServiceImp.multiply(num1, num2);
        return calculatorResult;
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 == 0) {
            return "Ошибка, деление на 0!";
        }
        String calculatorResult = num1 + " / " + num2 + " = " + calculatorServiceImp.divide(num1, num2);
        return calculatorResult;
    }
}
