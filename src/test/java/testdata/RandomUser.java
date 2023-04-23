package testdata;

import com.github.javafaker.Faker;

import java.util.Locale;

public class RandomUser {
    Faker faker = new Faker(new Locale("en"));
   private final String name = faker.name().firstName();
   private final String job = faker.job().position();

   private  final  String email = faker.internet().emailAddress();

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
