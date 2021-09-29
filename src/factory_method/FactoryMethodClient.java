package factory_method;

import factory_method.abstractions.IProduct;

public class FactoryMethodClient {

    public static void main(String[] args) {

        IProduct product = CreatorImpl.getInstance().factoryMethod("Type 1");
        IProduct product1 = CreatorImpl.getInstance().factoryMethod("Type 2");
        IProduct product2 = CreatorImpl.getInstance().factoryMethod("Type 3");
        IProduct product3 = CreatorImpl.getInstance().factoryMethod("Type 4");

        System.out.println(product);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }


}
