package core;

import java.util.*;

public class LockVaultTx extends Transaction {
    private String assetSymbol;
    private Map<String, Integer> amountLocked = new HashMap<String, Integer>();
    private int timeLock;

    public LockVaultTx(String sender, int amountLocked) {
        super(sender, "0x52bc8ca51ec4a6df432daddc3d4b092b1cde7417c7a47e198ac66a6c314c87a4");
        assetSymbol = "USDT";
        this.amountLocked.put(sender, amountLocked);
        timeLock = 10;
    }

    public String getTransactionInfo() {
        String s = "Sender:\t\t" + super.getSender() + "\n";
        s += "Receiver:\t" + super.getReceiver() + "\n";
        s += "Amount:\t\t" + timeLock + " " + assetSymbol;
        return s;
    }

    public int amountLocked(String owner) {
        return amountLocked.get(owner);
    }
}
