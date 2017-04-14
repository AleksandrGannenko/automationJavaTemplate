package parentTest;

import org.junit.Test;

/**
 * Created by papaCarlo on 07.04.2017.
 */
public class TestTemplate extends ParentTest{
    public TestTemplate(String browser) {
        super(browser);
    }

    @Test
    public void validLogIn() {
        homePage.openHomePage();
    }
}