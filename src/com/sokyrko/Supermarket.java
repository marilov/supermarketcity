package com.sokyrko;
import java.util.ArrayList;
import java.util.List;

public class Supermarket extends Building {

    private List<Person>  employee;

    public List<Person> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Person> employee) {
        this.employee = employee;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    private List<Product> products;


    public Supermarket(int height, int width, int length) {
        super(height, width, length);
        employee = new ArrayList<>();
        products = new ArrayList<>();
    }

    @Override
    public void addPerson(Person person) {
        employee.add(person);

    }

    @Override
    public void addInventory(Inventory inventory) {
        if(inventory instanceof Product) {
            products.add((Product) inventory);
        }else{
            try{
                products.add((Product) inventory);
            }
            catch (Exception e){
                System.out.println("This is not a product");
            }
        }

    }
}
