public class Main {
    public static void main(String[] args) {

        boolean success = Data.validate("test", "test", "test");
        if(success) {
            System.out.println("Все верно");
        } else {
            System.out.println("Некорректные данные");
        }
    }
}