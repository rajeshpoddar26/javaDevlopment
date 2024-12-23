package departmentDetails.details;

import java.util.logging.Logger;

public class Test {

     Logger logger=Logger.getLogger(getClass().getName());

    public static void doSomethingPrint(){
        Test test= new Test();
        test.logger.info("details {}");
    }


}
