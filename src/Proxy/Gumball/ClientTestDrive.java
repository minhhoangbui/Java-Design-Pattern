package Proxy.Gumball;

import java.rmi.Naming;

public class ClientTestDrive {
    public static void main(String[] args) {
        String[] locations = {"rmi://seattle.mightygumball.com/gumballmachine",
                        "rmi://boulder.mightygumball.com/gumballmachine",
                        "rmi://santafe.mightygumball.com/gumballmachine"};

        GumballMonitor[] gumballMonitors = new GumballMonitor[locations.length];

        for(int i = 0; i < locations.length; i++){
            try{
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(locations[i]);
                System.out.println(machine);
                gumballMonitors[i] = new GumballMonitor(machine);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        for(int i = 0; i < locations.length; i++) {
            gumballMonitors[i].report();
        }
    }
}
