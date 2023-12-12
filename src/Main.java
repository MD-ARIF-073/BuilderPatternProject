public class Main {
    public static void main(String[] args) {
//        User user = User.Builder.builder()
//                .setName("Arif")
//                .setSurname("Sani")
//                .build();

//        System.out.println(user.toString());
        User user = User.builder().name("Arif").surname("Ishtiaq").build();
        System.out.println(user);

    }
}