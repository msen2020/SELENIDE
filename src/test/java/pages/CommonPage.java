package pages;

public abstract class CommonPage {


    public CommonPage() {
//        PageFactory.initElements(driver, this);
    }

    private A0_LoginLogout loginLogout;
    private TestPage test;

    public A0_LoginLogout loginLogout() {
        if (loginLogout == null) {
            loginLogout = new A0_LoginLogout();
        }
        return loginLogout;
    }

    public TestPage test() {
        if (test == null) {
            test = new TestPage();
        }
        return test;
    }
}

