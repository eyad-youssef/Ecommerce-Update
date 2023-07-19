package Ecommerce;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class Ecommerce {
    public LoginPage login;
    public RegisterPage register;
    public HomePage home;

    public Ecommerce(){

        this.home = new HomePage();
    }
}
