package StrategyPattern;

class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }
     public String executeStrategy(){
        return strategy.doOperation("Dulat", 26301, 800000, 20);
    }
     public String executeStrategy1(){
        return strategy.doOperation1(5555555, 26301, "qwerty", 30000);
    }
     public String executeStrategy2(){
        return strategy.doOperation2("Dulat", "Dutay2001", "qwerty", 30000);
    }



}