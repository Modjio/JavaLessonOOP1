class Stock {
    String symbol;  // tag stock
    String name;    // name stock
    double previousClosingPrice;    // yesterday price stock
    double currentPrice;            // today price stock

    /*
     * default constructor empty
     */

    /*
     * constructor create stocks
     */
    Stock(String newSymbol, String newName, double newPreviousClosingPrice, double newCurrentPrice) {
        symbol = newSymbol;
        name = newName;
        previousClosingPrice = newPreviousClosingPrice;
        currentPrice = newCurrentPrice;
    }

    /*
     * calculates percentage
     */
    double getPercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
