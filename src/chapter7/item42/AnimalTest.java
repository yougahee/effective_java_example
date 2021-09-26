package chapter7.item42;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void type() {
                System.out.println("포유류");
            }
        };
    }
}
