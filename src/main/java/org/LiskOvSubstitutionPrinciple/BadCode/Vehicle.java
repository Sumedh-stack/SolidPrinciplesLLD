package org.LiskOvSubstitutionPrinciple.BadCode;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    public Boolean hasEngine(){
        return true;
    }
    public Integer gettotalNoOfwheels(){
        return 2;
    }
}


class _Bike extends Vehicle{

}

class Car extends Vehicle{
    @Override
    public Integer gettotalNoOfwheels(){
        return 4;
    }
}

// this is incorrect
class _Bicycle extends Vehicle{
    public Boolean hasEngine(){
        return null;
    }
}

class Main{
    public static void main(String[] args) {
        List<Vehicle> listofVehicles = new ArrayList<>();
        listofVehicles.add(new _Bicycle());
        listofVehicles.add(new _Bike());
        listofVehicles.add(new Car());

        for(Vehicle vehicle:listofVehicles){
            System.out.println(vehicle.hasEngine().toString());// this will give null pointer exception
        }
    }
}
