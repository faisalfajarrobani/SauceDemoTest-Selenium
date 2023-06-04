package StepDefinitions;

import com.apptest.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

//    Run driver before start the testing
    @Before
    public void BrowserStart() throws InterruptedException {
        DriverRun();
    }

//    Stop driver after start the testing
    @After
    public void BrowserStop(){
        DriverStop();
    }
}
