public class AssistantChef extends Chef{

    private final int ServiceCharge = 15;
    private final int TotalServed = 534150;

    public AssistantChef(String firstName, String lastName, int age, String username, String password){
        super(firstName,lastName,age,username,password);
        StaticClass.assistantChefs.add(this);
    }

    @Override
    public String toString() {
        return "MasterChef{firstName : "+getFirstName()+", lastName : "+getLastName()+", age : "+String.valueOf(getAge())+"\n"+
                ", service charge : "+String.valueOf(ServiceCharge)+", total sold : "+String.valueOf(TotalServed)+'\n'+
                ", username : "+getUsername()+", password : "+getPassword()+"}\n";
    }

    //TODO
    @Override
    protected int earning() {
        return 0;
    }
}
