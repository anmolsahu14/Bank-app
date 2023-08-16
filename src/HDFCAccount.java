import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{

    private String name;

    private String accountNo;

    private String password;

    private double balance;

    final double rateOfInterest = 7.1;

    final String IFSCode = "HDFC123455";

    public HDFCAccount() {

    }

    public HDFCAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo = String.valueOf(UUID.randomUUID());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getIFSCode() {
        return IFSCode;
    }

    @Override
    public String fetchBalance(String password) {

        if(this.password.equals(password)){
            return "Your Balance Is: " + this.balance;
        }

        return "Incorrect Password!!!";
    }

    @Override
    public String addMoney(double amount) {

        this.balance += amount;

        return "Amount added Sucessfully.New Amount : " + this.balance ;
    }

    @Override
    public String withdrawMoney(double amount, String password) {

        if(this.password.equals(password)){
            if(this.balance < amount){
                return "Insufficient Balance";
            }
            this.balance -=amount;
            return "Amount deducted successfully.New Balance : " + this.balance;
        }

        return "Incorrect Password!!";
    }

    @Override
    public String changePassword(String oldpassword, String newpassword) {
        if(this.password.equals(oldpassword)){
            this.password = newpassword;
            return "Password Changed Successfully!!!";
        }
        return "Incorrect Original Password";
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance*year*rateOfInterest)/100.0;
    }


    @Override
    public String toString() {
        return "HDFCAccount{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateOfInterest=" + rateOfInterest +
                ", IFSCode='" + IFSCode + '\'' +
                '}';
    }
}
