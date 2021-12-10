package exchangeDesk;

public class Main {

    public static void main(String[] args) {

        ExchangeDesk exchangeDesk = new ExchangeDesk();
        Ron lei = new Ron(1_000);
        Usd dollar = exchangeDesk.convert(lei, Usd.class, 0.24);
        System.out.println(dollar.toString());
    }
}
