public class WebApp implements Observer {
    private String client;

    public WebApp(String client) {
        this.client = client;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Web App (" + client + "): " + stockName + " is now $" + stockPrice);
    }
}
