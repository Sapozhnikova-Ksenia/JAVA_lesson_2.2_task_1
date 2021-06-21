public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int resultMillBonusWithPrice2000000Kop = service.calculate(2000000);
        System.out.println(resultMillBonusWithPrice2000000Kop);

        int resultMillBonusWithPrice240000Kop = service.calculate(240000);
        System.out.println(resultMillBonusWithPrice240000Kop);

        int resultMillBonusWithPrice0Kop = service.calculate(0);
        System.out.println(resultMillBonusWithPrice0Kop);
    }
}
