package StrategyPattern;

public class PayPal implements Strategy {
    String fullname;
    String login;
    String passwd;
    int sum;

    public PayPal(String fullname, String login, String passwd, int sum){
        this.fullname = fullname;
        this.login = login;
        this.passwd = passwd;
        this.sum = sum;

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }


    @Override
    public String doOperation(String fullname, int id, int sum, int time) {
        return null;
    }

    @Override
    public String doOperation1(int cardNum, int cvv, String passwd, int sum) {
        return null;
    }

    @Override
    public String doOperation2(String fullname, String login, String passwd, int sum) {
        return "Fullname:" + fullname + " Login:" + login + " Password:" +passwd + " Sum of money that you pay is:" + sum + " tg";
    }
}
