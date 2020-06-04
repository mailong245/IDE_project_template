public class HelloWorld {

    public static void main(String[] args) {
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
        int a = 1;
        int b = 2;
        int c = add(a, b);
        int d = add(b, c);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    public static class Human {
        private String name;
        private String age;
        private String gender;

        public Human() {
        }

        public Human(String name, String age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }

}

