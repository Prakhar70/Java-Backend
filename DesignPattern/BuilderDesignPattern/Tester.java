package DesignPattern.BuilderDesignPattern;

import DesignPattern.BuilderDesignPattern.User.Builder;

public class Tester {
    public static void main(String[] args) {
        Builder builder =new Builder(0, null);
        builder.setAge(12);
        builder.setPhoneNumber("12121");
        
        new User(builder);
    }
}
