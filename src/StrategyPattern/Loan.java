package StrategyPattern;

public class Loan implements Strategy{

    String fullname;
    int id;
    int sum;
    int time;

    public Loan(String fullname, int id, int sum, int time){
        this.fullname = fullname;
        this.id = id;
        this.sum = sum;
        this.time = time;

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum(){
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getTime(){
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }





    @Override
    public String doOperation(String fullname, int id, int sum, int time) {
        return "Fullname: " + fullname +" ID: " + id + " Sum: " + sum + " Money back time after: " + time + " years";
    }

    @Override
    public String doOperation1(int cardNum, int cvv, String passwd, int sum) {
        return null;
    }

    @Override
    public String doOperation2(String fullname, String login, String passwd, int sum) {
        return null;
    }
}
