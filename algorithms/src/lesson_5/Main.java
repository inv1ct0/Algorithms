package lesson_5;

public class Main {
    static int[] cost = new int[] {548, 154, 367, 451, 117};
    static int[] weight = new int[] {7, 5, 9, 1, 20};
    static int backpackVolume = 25;
    
    public static void main(String[] args) {
        
        System.out.println(recPower(12, 4));
        System.out.print("Максимальная стоимость вещей в рюкзаке: ");
        System.out.println(backpack(cost.length - 1, backpackVolume));}

    static int recPower(int a, int b) {
        if (b == 1) {
            return a;
        }
        
        if (b == 0) {
            return 1;
        }
        return recPower(a, b - 1) * a;
    }
    
    private static int backpack(int i, int _backpackVolume) {
        if (i < 0) {
            return 0;
        }
        if (weight[i] > _backpackVolume) {
            return backpack(i-1, _backpackVolume);
        } else {
            return Math.max(backpack(i-1, _backpackVolume), backpack(i-1, _backpackVolume - weight[i]) + cost[i]);
        }
    }
}