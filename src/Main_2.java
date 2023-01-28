class StockLowException extends Exception {
    public StockLowException(String message) {
        super(message);
    }
}

class Stocks {
    private final float rate;

    public Stocks(float rate) {
        this.rate = rate;
    }

    public void checkRate(float rate) throws StockLowException {
        if (rate < this.rate) {
            throw new StockLowException("Under Loss");
        } else {
            System.out.println("Rate is good");
        }
    }
}

public class Main_2 {
    public static void main(String[] args) {
        Stocks stock = new Stocks(10.0f);
        try {
            stock.checkRate(5.0f);
        } catch (StockLowException e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        }
    }
}