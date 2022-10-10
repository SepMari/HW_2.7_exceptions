public class Data {

    private static final String VALID_CHARACTERS="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

    public Data() {

    }

    public static boolean validate (String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } return true;
    }

    private static void check (String login, String password, String confirmPassword)
    throws WrongPasswordException, WrongLoginException {
        if (!valedate(login)){
            throw new WrongLoginException("Некорректный логин");
        }
        if (!valedate(password)){
            throw new WrongPasswordException("Некорректный пароль");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    private static boolean valedate(String s) {
        if (s.length()>20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
