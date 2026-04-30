import java.security.SecureRandom;
import java.util.Scanner;

public class NewPasswordTest {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxzyABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-[]"; //caracteres que poderao ser utilizados na senha
    public static String newPassword(int passwordLenght){
        SecureRandom randomChar = new SecureRandom();
        StringBuilder password = new StringBuilder(passwordLenght);

        for(int i = 0; i < passwordLenght; i++){
            int index = randomChar.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }
        return password.toString();
    }
    public static void main(String[] args) {
        int passwordLenght;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento da senha: ");
        passwordLenght = scanner.nextInt();
        scanner.close();

        String password = newPassword(passwordLenght);
        System.out.println(password);
    }

}