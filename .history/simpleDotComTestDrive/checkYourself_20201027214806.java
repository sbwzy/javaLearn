public class checkYourself(String stringGuess) {
    int guess = Integer.parseInt(stringGuess);
    String result = "miss";

    for (int cell : locationCells){
        if(guess == cell){
            result = "hit";
            numOfHits++;
            break;
        }
    }

    if (numOfHits == locationCells.length){
        result = "kill";
    }

    System.out.println(result);
    return result;
}
