public class test {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("ZomatoMobileApp1");
        Observer webApp = new WebApp("ZomatoWebApp1");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(59.61);
        stockMarket.setStockPrice(45.79);

        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setStockPrice(158.14);
    }
}