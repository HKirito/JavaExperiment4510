package Experiment4.T3;

public class CreditCards {
    private static double BaseRate = 0.006;
    private static Integer LastAccountNumber = 1234566;


    private String AccountHolder;
    private Integer AccountNumber;
    private Integer CreditScore;
    private double Rate;
    private double balance;
    private int CreditLimit;
    private boolean isPay = false;

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    public Integer getCreditScore() {
        return CreditScore;
    }

    public void setCreditScore(Integer creditScore) {
        CreditScore = creditScore;
    }

    public int getCreditLimit() {
        return CreditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        CreditLimit = creditLimit;
    }

    public double getBalance() {
        int b =(int)(balance * 100);
        balance = b * 0.01;
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        AccountHolder = accountHolder;
    }

    public String getsecrtNumber(){
        int k = AccountNumber/1000;
        int y = AccountNumber%1000;
        String str = "";
        for (int i = 0;i<(k+"").length();i++){
            str = str+"*";
        }
        str = str + String.valueOf(y);
        return str;
    }
    /**
     * 构造函数
     * @param name Name
     * @param creditScore Score
     */
    public CreditCards(String name, Integer creditScore){
        CreditScore = creditScore;
        AccountHolder = name;
        AccountNumber = ++LastAccountNumber;
        balance = 0;
        updateLimit(CreditScore);
    }

    /**
     * Update CreditLimit
     * @param creditScore 信用评分
     */
    private void updateLimit(int creditScore){
        if(creditScore>=0){
            if(creditScore<300){
                Rate = BaseRate + 0.1;
                CreditLimit = 1000;
            }else if(creditScore<=500){
                Rate = BaseRate + 0.07;
                CreditLimit = 3000;
            }else if(creditScore<= 700){
                Rate = BaseRate + 0.04;
                CreditLimit = 7000;
            }else{
                Rate = BaseRate + 0.01;
                CreditLimit = 15000;
            }
        }else{
            System.out.println("You CreditScore is too low!");
            return;
        }
    }

    /**
     * Amount Operation
     * @param amount 消费金额
     */
    public void MakePurchase(int amount){
        if (amount + balance > CreditLimit){
            System.out.println("Refuse Operation!");
        }else{
            balance = balance + amount;
        }
    }

    /**
     * Pay Operation
     * @param pay 还款金额
     */
    public void MakePayment(int pay){
        if (pay >= balance){
            balance = 0;
            CreditScore = CreditScore + 10;
            updateLimit(CreditScore);
            System.out.println("Pay For is Succeed!");
        }else if(pay < (balance*0.1)){
            balance = balance - pay;
            Rate = Rate + 0.01;
        }else{
            balance = balance - pay;
        }
        isPay = !isPay;
    }

    public void RaiseRate(){

    }
    public void RaiseLimit(){}

    /**
     * Calculate Balance
     */
    public void CalculateBalance(){
        balance = balance +(balance*(Rate / 12));
    }

    @Override
    public String toString() {
        System.out.println("[Name: "+getAccountHolder()+"\n Number: "
                    +getsecrtNumber()+"\n Balance: "+getBalance()
                    +"\n CreditLimit: "+getCreditLimit()+"]\n");
        return super.toString();
    }

}
