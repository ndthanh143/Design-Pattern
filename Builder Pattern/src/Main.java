public class Main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentConcreteBuilder().setId(1).setName("Thanh");

        System.out.println(studentBuilder.build());
    }
}