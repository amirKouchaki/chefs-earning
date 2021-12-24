import java.io.*;
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

    public static void save(Chef.Roles ROLE) {
        try {
            File file = new File(ROLE.toString() + ".txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            switch (ROLE) {
                case MASTER_CHEF -> objectOutputStream.writeObject(masterChefs);
                case SECOND_CLASS_CHEF -> objectOutputStream.writeObject(secondClassChefs);
                case ASSISTANT_CHEF -> objectOutputStream.writeObject(assistantChefs);
            }
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
