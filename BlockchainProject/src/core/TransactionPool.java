package core;

import java.util.ArrayList;
import actors.EOAccount;
import crypto.USDTCoin;
import crypto.ETHCoin;

public class TransactionPool {
    private USDTCoin USDT = new USDTCoin(
        "0xC6CDE7C39eB2f0F0095F41570af89eFC2C1Ea828",    
        1000000
    );

    private ETHCoin ETH = new ETHCoin(1000000);

    public EOAccount alice = new EOAccount(
        "0xb63780a4145b755dad6230723572f9bc947efbea4743840bf16d24376e4f7005",
        1000, 
        1000
    );
    public EOAccount bob = new EOAccount(
        "0xb63780a4145b755dad6230723572f9bc947efbea4743840bf16d24376e4f7005",
        500, 
        3000
    );

    private ArrayList<TransferTx> T = new ArrayList<TransferTx>();
    private int maxPoolSize = 2;

    public TransferTx getTransaction(int i) {
        return T.get(i);
    }

    public int getNrTransactions() {
        return T.size();
    }

    public void getTransactionInfo() {
        for (TransferTx t: T) {
            System.out.println(t.getTransactionInfo());
        }
    }

    public void addTransaction(TransferTx t) {
        int amount = t.getAmount();
        String receiver = t.getReceiver();
        String assetName = t.getAssetSymbol();
        boolean isUSDT = assetName.equals("USDT");
        boolean success;


        success = isUSDT ? alice.sendUSDT(amount, receiver) : alice.sendETH(amount, receiver);
        if (!success) return;

        success = isUSDT ? bob.receiveUSDT(amount) : bob.receiveETH(amount);
        if (!success) return;

        t.setChecked();
        if (isPoolFull()) T.clear();
        T.add(t);
    }

    public boolean isPoolFull() {
        return T.size() >= maxPoolSize;
    }

    public boolean checkTotalBTC() {
        return alice.getBalanceUSDT() + bob.getBalanceUSDT() <= USDT.getTotalSupply();
    }

    public boolean checkTotalETH() {
        return alice.getBalanceETH() + bob.getBalanceETH() <= ETH.getTotalSupply();
    }

    public ArrayList<TransferTx> getPool() {
        return T;
    }
}
