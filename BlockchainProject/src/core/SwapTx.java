package core;

public class SwapTx extends Transaction {
    public String exchangeAddress;
    public String tokenIn;
    public String tokenOut;
    public double amountIn;
    public double exchangeRate;

    public SwapTx(
        String sender, 
        String receiver, 
        String exchangeAddress,
        double exchangeRate
    ) {
        super(sender, receiver);
        this.exchangeAddress = exchangeAddress;
        tokenIn = "ETH";
        tokenOut = "USDT";
        this.exchangeRate = exchangeRate;
    }

    public String getTransactionInfo() {
        String s = "Sender:\t\t" + super.getSender() + "\n";
        s += "Receiver:\t" + super.getReceiver() + "\n";
        s += "Amount:\t\t" + tokenIn + " " + tokenOut + " " + amountOut();
        return s;
    }

    public double amountOut() {
        return amountIn * exchangeRate;
    }
}
