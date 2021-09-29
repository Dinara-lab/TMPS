package factory_method.abstractions;

public interface ICreator {
    IProduct factoryMethod(String type);
}