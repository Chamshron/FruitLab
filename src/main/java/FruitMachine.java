import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FruitMachine {

    private int winnings;
    private String reelOne;
    private String reelTwo;
    private String reelThree;

    private String reelFour;

    private String reelFive;
    private ArrayList<String> fruits;


    public FruitMachine(int winnings) {
        this.winnings = winnings;
        this.fruits = new ArrayList<String>();
        fruits.add("Strawberry");
        fruits.add("Orange");
        fruits.add("Lemon");
        fruits.add("Apple");
    }

    public void spin(){
        Random random = new Random();
        int resultOfOne = random.nextInt(4);
        reelOne = fruits.get(resultOfOne);
        int resultOfTwo = random.nextInt(4);
        reelTwo = fruits.get(resultOfTwo);
        int resultOfThree = random.nextInt(4);
        reelThree = fruits.get(resultOfThree);
        int resultOfFour = random.nextInt(4);
        reelFour = fruits.get(resultOfFour);
        int resultOfFive = random.nextInt(4);
        reelFive = fruits.get(resultOfFive);
        if(reelOne.equals(reelTwo) && reelTwo.equals(reelThree) && reelThree.equals(reelFour) && reelFour.equals(reelFive)){
            System.out.println("Congratulations! You have won £" + winnings);
            System.out.println(reelOne);
            System.out.println(reelTwo);
            System.out.println(reelThree);
            System.out.println(reelFour);
            System.out.println(reelFive);
        } else{
            System.out.println("Better luck next time!");
            System.out.println(reelOne);
            System.out.println(reelTwo);
            System.out.println(reelThree);
            System.out.println(reelFour);
            System.out.println(reelFive);
        }
    }

    public int getWinnings() {
        return winnings;
    }

    public void setWinnings(int winnings) {
        this.winnings = winnings;
    }

}
