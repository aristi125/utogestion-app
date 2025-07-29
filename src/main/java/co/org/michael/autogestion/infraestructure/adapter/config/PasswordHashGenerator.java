package co.org.michael.autogestion.infraestructure.adapter.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordHashGenerator {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        // Cambia por las contraseñas que quieras encriptar
        String[] passwords = {"juan123", "anita225", "reymis*/"};

        for (String plain : passwords) {
            String hashed = passwordEncoder.encode(plain);
            System.out.println("Password: " + plain + " -> Hash: " + hashed);
        }
    }
}
