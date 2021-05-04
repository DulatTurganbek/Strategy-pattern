package StrategyPattern;

public interface Strategy {
    public String doOperation(String fullname, int id, int sum, int time);
    public  String doOperation1(int cardNum, int cvv, String passwd, int sum);
    public String doOperation2(String fullname, String login, String passwd, int sum);
}


