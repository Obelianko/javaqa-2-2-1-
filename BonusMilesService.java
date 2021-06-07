public class BonusMilesService {
    public int calculate(int price) {
        int cost = 20_000; //в рублях
        int miles = 20; // rub
        int totalBonus = price / miles;
        return totalBonus;
    }
}

