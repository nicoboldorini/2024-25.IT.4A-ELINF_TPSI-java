public class PasswordBreaker {
    final static int PASSWORD_LENGTH = 4;

    public static void main(String[] args) {
        // viene creato un file protetto da una password segreta ...
        PasswordProtectedFile file = new PasswordProtectedFile(PASSWORD_LENGTH);
        // e un cracker che deve scoprire la password del file
        PasswordCracker cracker = new PasswordCracker(file, PASSWORD_LENGTH);

        System.out.println("Un file password protected è stato creato. ");
        System.out.println("Stiamo cercando di violare la password... ");
        System.out.println();
        Cronometro crono = new Cronometro();
        crono.inizio();
        String secret_password = cracker.crack_it();
        crono.fine();
        System.out.println("La password segreta: " + secret_password);
        System.out.println("e' stata violata in: " + crono.elapsed() + " millisecondi");
    }
}