//Account class with a constructor that initializes the name
public class Account {
    private String name; //instance variable


    //constructor initializes name with parameter name
    public Account(String name){
        this.name = name;

    }

    // method to set the name
    public void setName(String name){
        this.name = name;

    }

    public String getName(){
        return name;

    }


}//end class Account
