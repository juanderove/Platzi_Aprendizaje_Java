public class IncrementDecrement{
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4

        lives--; //Decremento
        System.out.println(lives); //3

        lives++; //Incremento
        System.out.println(lives); //4

        //Prefija
        //Gana 100
        int gift = 100 + lives++; //postfijo -> prefijo seria + ++lives;
        System.out.println(gift);
        System.out.println(lives);
    }
}
