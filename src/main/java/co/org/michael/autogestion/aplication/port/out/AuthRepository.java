package co.org.michael.autogestion.aplication.port.out;


public interface AuthRepository {
    String authenticate(String username, String password);
}
