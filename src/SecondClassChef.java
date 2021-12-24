import java.io.Serializable;
import java.sql.Time;
import java.util.Random;

public class SecondClassChef extends Chef implements Serializable {
    private static final long serialVersionUID = 1L;
    private int hourlyRate;
    private int workHours;

    public SecondClassChef(String firstName, String lastName, int age, String username, String password){
        super(firstName,lastName,age,username,password);
        Random rand = new Random(System.currentTimeMillis());
        hourlyRate = rand.nextInt(500) + 1;
        workHours = rand.nextInt(168) + 1;
        StaticClass.secondClassChefs.add(this);
        StaticClass.save(Roles.SECOND_CLASS_CHEF);
    }

    @Override
    public String toString() {
        return "MasterChef{firstName : "+getFirstName()+", lastName : "+getLastName()+", age : "+String.valueOf(getAge())+"\n"+
                ", hourly rate : "+String.valueOf(hourlyRate)+", work hours : "+String.valueOf(workHours)+'\n'+
                ", username : "+getUsername()+", password : "+getPassword()+" earning : "+earning()+"}\n";
    }


    @Override
    protected double earning() {
        if(workHours <= 40)
            return workHours * hourlyRate;
        else
            return workHours * 1.5 * hourlyRate;

    }
}
