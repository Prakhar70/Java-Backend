package DesignPattern.BuilderDesignPattern;

public class User {
    private final int id;
    private final String name;
    private final String phoneNumber;
    private final int age;
    private User(Builder builder){
        this.id= builder.id;
        this.name=builder.name;
        this.phoneNumber=builder.phoneNumber;
        this.age=builder.age;
        
    }
    public static class Builder{
        private final int id;
        private final String name;
        private String phoneNumber;
        private int age;
        public Builder(int id, String name){
            this.id=id;
            this.name=name;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public User build(){
            return new User(this);
        }

    }


}
