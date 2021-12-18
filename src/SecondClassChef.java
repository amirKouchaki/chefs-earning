public class SecondClassChef extends Chef{
    private final int HOURLY_RATE = 20;
    private final int WORK_HOURS = 40;

    public SecondClassChef(String firstName, String lastName, int age, String username, String password){
        super(firstName,lastName,age,username,password);
        StaticClass.secondClassChefs.add(this);
    }

    @Override
    public String toString() {
        return "MasterChef{firstName : "+getFirstName()+", lastName : "+getLastName()+", age : "+String.valueOf(getAge())+"\n"+
                ", hourly rate : "+String.valueOf(HOURLY_RATE)+", work hours : "+String.valueOf(WORK_HOURS)+'\n'+
                ", username : "+getUsername()+", password : "+getPassword()+"}\n";
    }


    @Override
    protected int earning() {
        return 0;
    }
}
