package departmen.details;

import java.util.logging.Logger;

public class Test {
    private static final Logger logger=Logger.getLogger(Test.class.getName());
    private String name;
    private int age;

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

}
