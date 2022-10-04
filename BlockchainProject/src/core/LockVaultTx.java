package core;

import java.util.*;

public class LockVaultTx extends Transaction {
    private String assetSymbol;
    private Map<String, Integer> amountLocked = new HashMap<String, Integer>();
    private Map<String, Boolean> isLocked = new HashMap<String, Boolean>();
    private long timeLock;
    private long startTime;

    public LockVaultTx(String sender, int amountLocked) {
        super(sender, "0x52bc8ca51ec4a6df432daddc3d4b092b1cde7417c7a47e198ac66a6c314c87a4");
        assetSymbol = "USDT";
        this.amountLocked.put(sender, amountLocked);
        timeLock = 10;
        this.startTime = System.currentTimeMillis();
        isLocked.put(sender, false);
    }

    public String transactionInfo() {
        String s = "Sender:\t\t" + super.sender() + "\n";
        s += "Receiver:\t" + super.receiver() + "\n";
        s += "Amount:\t\t" + timeLock + " " + assetSymbol;
        return s;
    }

    public int amountLocked(String owner) {
        return amountLocked.get(owner);
    }

    public boolean isAmountLocked(String owner) {
        return isLocked.get(owner);
    }

    public void unlockAmount(String sender) {
        if (startTime + timeLock < System.currentTimeMillis()) 
            isLocked.put(sender, true);
        else System.out.println("EARLY_WITHDRAWING");
    }
}
