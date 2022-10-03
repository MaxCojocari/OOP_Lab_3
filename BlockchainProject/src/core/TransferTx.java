package core;

public class TransferTx extends Transaction {
    private String assetSymbol;
    private int amount;

    public TransferTx(String sender, String receiver, String assetSymbol, int amount) {
        super(sender, receiver);
        this.assetSymbol = assetSymbol;
        this.amount = amount;
    }

    public String getTransactionInfo() {
        String s = "Sender:\t\t" + super.getSender() + "\n";
        s += "Receiver:\t" + super.getReceiver() + "\n";
        s += "Amount:\t\t" + amount + " " + assetSymbol;
        return s;
    }

    public int getAmount() {
        return amount;
    }

    public String getAssetSymbol() {
        return assetSymbol;
    }
}
