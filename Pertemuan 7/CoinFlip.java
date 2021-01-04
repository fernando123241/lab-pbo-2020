import java.util.Random;

public class CoinFlip{
 	public static void main(String[] args) {
 	// Heads and tails
 	Random rand = new Random();
 	double chance = rand.nextDouble();

 		if (chance < 0.5){
 			System.out.println("heads!");
 		}
 		else{
 			System.out.println("tails!");
 		}
 	}
}