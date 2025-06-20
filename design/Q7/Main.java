public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileUser = new MobileApp("Alice");
        Observer webClient = new WebApp("InvestorPro");

        market.registerObserver(mobileUser);
        market.registerObserver(webClient);

        market.setStockData("AAPL", 189.50);
        market.setStockData("GOOGL", 2750.75);

        market.removeObserver(webClient);
        market.setStockData("TSLA", 720.10);
    }
}
