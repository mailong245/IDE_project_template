import BO.Human;
import business.DatabaseBusinessImpl;

public class HelloWorld {

    public static void main(String[] args) {

        DatabaseBusinessImpl dbi = new DatabaseBusinessImpl();

        dbi.getData();
        dbi.findHumanById("Long");

        Human human = new Human();

        human.setName("Long");
        human.setAge("23");
        human.setGender("Male");

        System.out.println(human);

        Utils.method();
        method();
    }

    public static void display() {
        System.out.println("Hello World");
    }

    public static void method() {
        DatabaseBusinessImpl dbi = new DatabaseBusinessImpl();

        dbi.getData();
        int a = 1;
        int b = 2;
        int c = add(a, b);
        int d = add(b, c);
    }

    private static int add(int a, int b) {
        return a + b;
    }


}

