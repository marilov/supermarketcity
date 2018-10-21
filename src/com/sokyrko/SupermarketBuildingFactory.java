package com.sokyrko;

public class SupermarketBuildingFactory implements BuildingFactory{


    @Override
    public Building createBuilding() {
        return new Supermarket(23,34,56);
    }
}
