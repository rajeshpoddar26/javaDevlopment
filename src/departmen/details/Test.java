package departmen.details;

import java.util.logging.Logger;

public class Test {
    private static final Logger logger=Logger.getLogger(Test.class.getName());
    private String name;
    private int age;

    Test(){
        logger.info("Default constructor called {}");
    }
    Test(String name,int age){
        logger.info("Parametrized constructor called {}");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
