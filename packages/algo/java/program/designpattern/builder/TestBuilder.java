package packages.algo.java.program.designpattern.builder;

    //Purpose: Build complex objects step-by-step.
    //Use Case: DTO/POJO construction in APIs, readable object creation
public class TestBuilder {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setFirstName("Main")
                .setLastName("Adam")
                .setAge(35)
                .setEmail("Main.Adam@example.com")
                .build();

        user.showUserInfo();
    }

}
