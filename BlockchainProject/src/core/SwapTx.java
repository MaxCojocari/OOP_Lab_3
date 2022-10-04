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

    public String transactionInfo() {
        String s = "Sender:\t\t" + super.sender() + "\n";
        s += "Receiver:\t" + super.receiver() + "\n";
        s += "AmountInETH:\t\t" + amountIn + "\n";
        s += "AmountOutUSDT:\t" + amountOut();
        return s;
    }

    public double amountOut() {
        return amountIn * exchangeRate;
    }
}
