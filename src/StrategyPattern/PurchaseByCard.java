package StrategyPattern;

public class PurchaseByCard implements Strategy{
    int cardNum;
    int cvv;
    String passwd;
    int sum;

    public PurchaseByCard(int cardNum, int cvv, String passwd, int sum){
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.passwd = passwd;
        this.sum = sum;

    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
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
        return "Card Number:" + cardNum + " CVV number:" + cvv + " Password: " + passwd + " Sum of money that you pay is:" + sum + " tg";
    }

    @Override
    public String doOperation2(String fullname, String login, String passwd, int sum) {
        return null;
    }
}
