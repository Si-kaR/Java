public class EggBasket1{
	public static void main(String[] args){
		//Declaring variables
		int numberOfBaskets, eggsPerBasket, totalEggs;
		//Assigning variables
		numberOfBaskets = 10;
		eggsPerBasket = 6;

		totalEggs = eggsPerBasket*numberOfBaskets;

		System.out.println(String.format("\nIf you have %d eggs per basket and there are %d baskets,\nthen the total number of eggs is %d.",eggsPerBasket, numberOfBaskets,totalEggs));
		System.out.println(String.format("\nThis can be obtained by multiplying (number of eggs) by (number of baskets\ni.e. %d by %d = %d)",eggsPerBasket, numberOfBaskets,totalEggs));
	}
}
