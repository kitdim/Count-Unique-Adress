package kit.org;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Result: " + countUnique("test.txt"));
    }
    public static long countUnique(String fileName) {
        HashSet<String> addresses = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                addresses.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return addresses.size();
    }
}
