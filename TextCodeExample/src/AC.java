public class AC {

    int a=5, b=4;
    public void setData(int a, int b){

        this.a=a;
        this.b=b;
    }
    public void showData(){
        System.out.println("Value of A="+a);
        System.out.println("Value of B="+b);

    }
    public static void main(String[] args){
        AC myAccount = new AC();
        myAccount.setData(2,3);
        myAccount.showData();
    }
}