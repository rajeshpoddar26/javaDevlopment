package departmen.details;

import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.'
public class Main {
    public static void main(String[] args) {
        Logger logger= Logger.getLogger(Main.class.getName());
        logger.info("Hello And Welcome");

        Test test1 = new Test("Rajesh", 31);
        Test test2 = new Test("Ravi", 24);

        if (test1.getAge() > 30) {
            logger.info("Age greater than 30 {} ");
            logger.info(test1.getName());
        }
        if (test2.getAge() <= 30) {
            logger.info("Age less than 30 {} ");
            logger.info(test2.getName());
        }
    }
}