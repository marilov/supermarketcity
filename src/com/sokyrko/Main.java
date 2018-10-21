package com.sokyrko;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        BuildingFactory buildingFactory = new SupermarketBuildingFactory();

        City city = new City();
        city.createCity();

    }
}

