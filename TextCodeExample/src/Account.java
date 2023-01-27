//Account class with a constructor that initializes the name
public class Account {
    private String name; //instance variable
    private double balance; // instance varibale

    //constructor initializes name with parameter name
    public Account(String name, double balance){
        this.name = name;

        if (balance>0.0)
            this.balance = balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount>0.0)
            balance = balance + depositAmount;
    }

    public double getBalance(){
        return balance;
    }

    // method to set the name
    public void setName(String name){
        this.name = name;

    }

    public String getName(){
        return name;

    }


}//end class Account
