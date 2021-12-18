import java.util.ArrayList;

public class StaticClass {
    public static ArrayList<MasterChef> masterChefs = new ArrayList<>();
    public static ArrayList<SecondClassChef> secondClassChefs = new ArrayList<>();
    public static ArrayList<AssistantChef> assistantChefs = new ArrayList<>();

    public static Chef findChefByUsername(String username) {
        for (MasterChef chef :
                masterChefs)
            if (username.equals(chef.getUsername()))
                return chef;

        for (SecondClassChef chef :
                secondClassChefs)
            if (username.equals(chef.getUsername()))
                return chef;

        for (AssistantChef chef :
                assistantChefs)
            if (username.equals(chef.getUsername()))
                return chef;

        return null;
    }
}
