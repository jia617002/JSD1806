package designPatterns.decoratorPattern.component;

public abstract class 饮品 {
    String name;

    public abstract int price();

    public String getName(){
        return name;
    }
}
