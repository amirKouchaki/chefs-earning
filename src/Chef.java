import java.io.Serializable;

public abstract class Chef implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final int minAge = 18;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String username;
    protected String password;

    public Chef(String firstName, String lastName, int age, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public static boolean isOfAge(int age){
        return age >= minAge;
    }

    public static boolean attemptLogin(String username,String password){
        Chef chef = StaticClass.findChefByUsername(username);

        if(chef == null)
            return false;

        return chef.password.equals(password);
    }


    protected abstract double earning();

    public static int getMinAge() {
        return minAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    enum Roles{
        MASTER_CHEF,
        SECOND_CLASS_CHEF,
        ASSISTANT_CHEF
    }

}

