import java.io.Serializable;
import java.util.Random;

public class AssistantChef extends Chef implements Serializable {
    private static final long serialVersionUID = 1L;
    private  int serviceCharged;
    private int totalServed;
    private final int CONST_EARNING = 3130;

    public AssistantChef(String firstName, String lastName, int age, String username, String password){
        super(firstName,lastName,age,username,password);
        Random rand = new Random(System.currentTimeMillis());
        serviceCharged = rand.nextInt(40) + 1;
        totalServed = rand.nextInt(4104241) + 1;
        StaticClass.assistantChefs.add(this);
        StaticClass.save(Roles.ASSISTANT_CHEF);
    }

    @Override
    public String toString() {
        return "MasterChef{firstName : "+getFirstName()+", lastName : "+getLastName()+", age : "+String.valueOf(getAge())+"\n"+
                ", service charge : "+String.valueOf(serviceCharged)+", total sold : "+String.valueOf(totalServed)+'\n'+
                ", username : "+getUsername()+", password : "+getPassword()+" earning : "+earning()+"}\n";
    }

    @Override
    protected double earning() {
        return CONST_EARNING + totalServed * serviceCharged;
    }
}
