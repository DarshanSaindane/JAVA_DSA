class accessModifier{
    public static void main(String[] args){
        BankAccount myAcc = new BankAccount(); //here we called constractor and creat an object name as myAcc.
        myAcc.username = "Darshan"; //here we can access username because it is public 
        // System.out.println(myAcc.username);
        myAcc.setpassword("abcdefghi"); //here we cannot access password because it is private that's why we can 
                                        //can only change the password through setpasssword function we cannot access it.
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setpassword(String pwd){
        password = pwd;
    }
    
}