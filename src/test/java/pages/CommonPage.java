package pages;

public abstract class CommonPage {


    public CommonPage() {
//        PageFactory.initElements(driver, this);
    }

        private A0_LoginLogout loginLogout;
        private A1_SignUp signUp;
        private TestSelenide test;

        public A0_LoginLogout loginLogout() {
            if (loginLogout == null) {
                loginLogout = new A0_LoginLogout();
            }
            return loginLogout;
        }

        public A1_SignUp signUp() {
            if (signUp == null) {
                signUp = new A1_SignUp();
            }
            return signUp;
        }

    public TestSelenide test() {
        if (test == null) {
            test = new TestSelenide();
        }
        return test;
    }
    }

