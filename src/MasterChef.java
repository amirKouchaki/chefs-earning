public class MasterChef extends Chef{

    private static final int CONST_EARNING = 10000;

    public MasterChef(String firstName, String lastName, int age, String username, String password){
        super(firstName,lastName,age,username,password);
        StaticClass.masterChefs.add(this);
    }

    @Override
    public String toString() {
        return "MasterChef{firstName : "+getFirstName()+", lastName : "+getLastName()+", age : "+String.valueOf(getAge())+"\n"+
                ", earning : "+String.valueOf(CONST_EARNING)+'\n'+
                ", username : "+getUsername()+", password : "+getPassword()+"}\n";
    }

    @Override
    protected int earning() {
        return 0;
    }
}
