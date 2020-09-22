package Proxy.Gumball;

import java.rmi.Naming;

public class ServerTestDrive {
    public static void main(String[] args) {
        int count;
        GumballMachineRemote gumballMachine;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballachine", gumballMachine);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
