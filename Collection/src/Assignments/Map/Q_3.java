package Assignments.Map;

import java.util.Properties;
import java.util.Iterator;
import java.util.Set;

public class Q_3 {
    Properties states = new Properties();

    public void addStates(String stateName, String capital) {
        states.setProperty(stateName, capital);
    }

    public void listStates() {
        Set<Object> stateNames = states.keySet();
        Iterator<Object> iterator = stateNames.iterator();
        while (iterator.hasNext()) {
            String stateName = (String) iterator.next();
            String capital = states.getProperty(stateName);
            System.out.println("State: " + stateName + ", Capital: " + capital);
        }
    }

    public static void main(String[] args) {
        Q_3 obj = new Q_3();
        obj.addStates("Maharashtra", "Mumbai");
        obj.addStates("Tamil Nadu", "Chennai");
        obj.addStates("Karnataka", "Bengaluru");

        obj.listStates();
    }
}