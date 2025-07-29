package co.org.michael.autogestion.aplication.port.in;


public interface AuthUseCase {
    String authenticate(String username, String password);
}
