public class TestStock {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        Stock stock = new Stock("SBER", "ПАО Сбербанк", 281.50, 282.87);

        /*
         * color select
         */
        if (stock.currentPrice > stock.previousClosingPrice) {
            System.out.println("Акция: " + stock.symbol + " - " + stock.name + " " + stock.previousClosingPrice +
                    " -> " + stock.currentPrice + " " + ANSI_GREEN + (int) (stock.getPercent() * 100) / 100.0 + "%");
        } else {
            System.out.println("Акция: " + stock.symbol + " - " + stock.name + " " + stock.previousClosingPrice +
                    " -> " + stock.currentPrice + " " + ANSI_RED + (int) (stock.getPercent() * 100) / 100.0 + "%");
        }

    }
}
