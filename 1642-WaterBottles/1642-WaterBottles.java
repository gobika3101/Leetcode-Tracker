// Last updated: 7/9/2026, 3:05:35 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        int empty = numBottles;
        while(empty>=numExchange){
            int newDrink = empty/numExchange;
            empty = (empty%numExchange) + newDrink;;
            drink = drink + newDrink;
        }
        return drink;
    }
}