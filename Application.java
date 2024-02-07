package BuilderPattern;

public class Application {
    public static void main(String[] args) {
        User lauren = new User.UserBuilder()
                .addFirstName("Lauren")
                .addLastName("Tsai")
                .addEmail("laurenTsai.@gmail.com")
                .addAge(25)
                .addPhone("1234567890")
                .addAddress("Hong Kong")
                .build();

        User kieran = new User.UserBuilder()
                .addEmail("kieranWhite@gmail.com")
                .addAddress("London")
                .addLastName("White")
                .addAge(30)
                .addPhone("11-2341-987")
                .addFirstName("Kieran")
                .build();

        User randall = new User.UserBuilder()
                .addLastName("Marshall")
                .addEmail("marshallRand@gmail.com")
                .addAddress("Washington DC, USA")
                .addPhone("911-788544")
                .addFirstName("Randall")
                .addAge(75)
                .build();

        System.out.println(lauren);
        System.out.println();
        System.out.println(kieran);
        System.out.println();
        System.out.println(randall);
    }
}
