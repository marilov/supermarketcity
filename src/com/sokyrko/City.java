package com.sokyrko;

import java.util.ArrayList;
import java.util.List;

public class City {

    private List<BuildingFactory> buildingFactories;
    private List<Building> buildings = new ArrayList<>();
    private List<Person> citizens;
    private MaternityHouse maternityHouse = new MaternityHouse();
    private Validator peopleValidator;

    public void setBuildingFactories(List<BuildingFactory> buildingFactories) {
        this.buildingFactories = buildingFactories;
    }

    public void createCity() {

        for (BuildingFactory buildingFactory : buildingFactories) {
            Building building = buildingFactory.createBuilding();
            buildings.add(building);

            List<Person> people = maternityHouse.createPeople();
            for (Person person : people) {
                if (peopleValidator.validate(person)) {
                    Employee employee = new Employee();
                    building.addPerson(employee);
                }
            }


        }

    }

}
