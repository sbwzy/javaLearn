import java.util.*;

public class DotConBust {
    private gameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuess = 0;

    private void setUpGame(){
        // first make some dot coms give them locations
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pet.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guess");

        for (DotCom dotComToSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while (!dotComList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGuess++;
        String result = "miss";
        for (DotCom dotComTest : dotComList){
            result = dotComTest.checkYourself(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if
    }
}
