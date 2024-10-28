package org.LiskOvSubstitutionPrinciple.GoodCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> listOfVehicles = new ArrayList<>();
        listOfVehicles.add(new Bicycle());
        listOfVehicles.add(new Car());
        listOfVehicles.add(new Bicycle());
        for(Vehicle vehicle:listOfVehicles){
       //     System.out.println(vehicle.hasEngine()); throws error here
            System.out.println(vehicle.getTotalNoofWheels());
        }


        List<EngineVehicle> listOfVehicles2 = new ArrayList<>();
      //  listOfVehicles2.add(new Bicycle()); throws error here
        listOfVehicles2.add(new Car());
        listOfVehicles2.add(new Bike());
        for(Vehicle vehicle:listOfVehicles){
            //     System.out.println(vehicle.hasEngine());
            System.out.println(vehicle.getTotalNoofWheels());
        }
    }
}
