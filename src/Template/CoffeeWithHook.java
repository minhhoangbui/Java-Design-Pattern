package Template;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String ans = getUserInput();

        if (ans.toLowerCase().startsWith("y"))
            return true;
        else
            return false;
    }

    private String getUserInput() {
        String ans = null;
        System.out.println("Would you like to add condiments to your cup of coffee?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            ans = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO fails to read your answer!!!");
        }

        if (ans == null) {
            return "no";
        }
        return ans;
    }
}
