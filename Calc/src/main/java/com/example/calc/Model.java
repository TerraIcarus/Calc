package com.example.calc;

public class Model {
    public long Calculation(long a, long b, String op){
        switch (op)
        {
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                if(b == 0) return 0;
                return a/b;
            case "AC":
                return 0;
        }
        System.out.println("Ты чаво наделал..."+ op);
        return 0;
    }
}
