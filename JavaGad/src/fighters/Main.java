package fighters;

public class Main {

    public static void main(String[] args){

        Fighter f1 = new Fighter("f1", 100, 10);
        Fighter f2 = new Fighter("f2", 100, 10);

        BoxingMatch boxingMatch = new BoxingMatch(f1, f2);

        System.out.println("Winner is: " + boxingMatch.fight());

    }
}
