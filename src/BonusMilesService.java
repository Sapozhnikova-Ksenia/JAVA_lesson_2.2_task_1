public class BonusMilesService {
    public int calculate(int ticketPriceInKop) {
        int oneMillinBonus = 20_00;
        int resultMillBonus = ticketPriceInKop / oneMillinBonus;
        return resultMillBonus;
    }
}
