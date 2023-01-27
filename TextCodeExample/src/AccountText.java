public class AccountText{

    public static void main(String[] args){
        Account account1 = new Account("Chandimal",100.0);
        Account account2 = new Account("Tharuka",200.0);

        System.out.printf("account name is : %s%n",account1.getName());
        System.out.printf("account balance is : %s%n",account1.getBalance()+"$");

    }

}
