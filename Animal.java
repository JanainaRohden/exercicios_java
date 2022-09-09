import java.util.Objects;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.next();
        String two = scanner.next();
        String three = scanner.next();


       if (Objects.equals(one, "vertebrado") && Objects.equals(two, "ave") && Objects.equals(three, "carnivoro")){
           System.out.println("aguia");
       }
       else if (Objects.equals(one, "vertebrado") && Objects.equals(two, "ave") && Objects.equals(three, "onivoro")) {
           System.out.println("pomba");
       } 
       else if (Objects.equals(one, "vertebrado") && Objects.equals(two, "mamifero") && Objects.equals(three, "onivoro")) {
           System.out.println("homem"); 
       }
       else if (Objects.equals(one, "vertebrado") && Objects.equals(two, "mamifero") && Objects.equals(three, "herbivoro")) {
           System.out.println("vaca");
       }
       else if (Objects.equals(one, "invertebrado") && Objects.equals(two, "inseto") && Objects.equals(three, "hematofago")) {
           System.out.println("pulga");
       }
       else if (Objects.equals(one, "invertebrado") && Objects.equals(two, "inseto") && Objects.equals(three, "herbivoro")) {
           System.out.println("lagarta");
       }
       else if (Objects.equals(one, "invertebrado") && Objects.equals(two, "anelideo") && Objects.equals(three, "hematofago")) {
           System.out.println("sanguessuga");
       }
       else if (Objects.equals(one, "invertebrado") && Objects.equals(two, "anelideo") && Objects.equals(three, "onivoro")) {
           System.out.println("minhoca");
       }
    }
}
