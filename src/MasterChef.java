import java.io.Console;
import java.io.Serializable;

public class MasterChef extends Chef implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final int CONST_EARNING = 10000;
    public MasterChef(String firstName, String lastName, int age, String username, String password){
        super(firstName,lastName,age,username,password);
        StaticClass.masterChefs.add(this);
        StaticClass.save(Roles.MASTER_CHEF);
    }

    @Override
    public String toString() {
        return "MasterChef{firstName : "+getFirstName()+", lastName : "+getLastName()+", age : "+String.valueOf(getAge())+"\n"+
                ", earning : "+String.valueOf(CONST_EARNING)+'\n'+
                ", username : "+getUsername()+", password : "+getPassword()+" earning : "+earning()+"}\n";
    }

    @Override
    protected double earning() {
        return CONST_EARNING;
    }
}
