package core;

public class TransferTx extends Transaction {
    private String assetSymbol;
    private int amount;

    public TransferTx(String sender, String receiver, String assetSymbol, int amount) {
        super(sender, receiver);
        this.assetSymbol = assetSymbol;
        this.amount = amount;
    }

    public String transactionInfo() {
        String s = "Sender:\t\t" + super.sender() + "\n";
        s += "Receiver:\t" + super.receiver() + "\n";
        s += "Amount:\t\t" + amount + " " + assetSymbol;
        return s;
    }

    public int amount() {
        return amount;
    }

    public String assetSymbol() {
        return assetSymbol;
    }
}
