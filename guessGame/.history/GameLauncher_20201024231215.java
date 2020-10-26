public class GameLauncher{
    public static void main(String[] args) {
        guessGame game = new guessGame();
        game.startGame();
    }
}

class guessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random()*10);
        System.out.println("I'm thinking of a number of between of 0 and 9...");

        while(true){
            System.out.println("Number to guess is "+targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guess1 = p1.number();
            System.out.println("Player one guessed "+guess1);
            guess2 = p2.number();
            System.out.println("Player two guessed "+guess1);
            guess3 = p3.number();
            System.out.println("Player three guessed "+guess1);

            if (guess1 == targetNumber){
                p1isRight = true;
            }
            if (guess2 == targetNumber){
                p2isRight = true;
            }
            if (guess3 == targetNumber){
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over!");
                break;
            }else{
                System.out.println("Players will have to try again!");
            }
        }
    }
}