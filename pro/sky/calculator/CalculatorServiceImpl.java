package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServiceInterface {
    @Override
    public String calculatorInfo() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int folding(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    @Override
    public int deduct(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    @Override
    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    @Override
    public int divide(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
}
