import core.Block;
import core.Blockchain;
import core.TransferTx;
import core.TransactionPool;

public class Simulation {
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();
        int i = 0;
        int k = 0;
        TransactionPool TxPool = new TransactionPool();

        TransferTx tx = new TransferTx("Alice", "Bob", "USDT", 10);
        TxPool.addTransaction(tx);
        System.out.println("Transaction # " + (k++) + "\n" + tx.transactionInfo());
        System.out.println("Alice's balance: " + TxPool.alice.balanceUSDT() + " USDT");
        System.out.println("Bob's balance: " + TxPool.bob.balanceUSDT() + " USDT" + "\n");

        tx = new TransferTx("Alice", "Bob", "ETH", 3);
        TxPool.addTransaction(tx);
        System.out.println("Transaction # " + (k++) + "\n" + tx.transactionInfo());
        System.out.println("Alice's balance: " + TxPool.alice.balanceETH() + " ETH");
        System.out.println("Bob's balance: " + TxPool.bob.balanceETH() + " ETH" + "\n");

        Block block = new Block(i, null, TxPool.getPool());
        block.mineBlock(2);
        blockchain.addBlock(block);


        tx = new TransferTx("Alice", "Bob", "ETH", 30);
        TxPool.addTransaction(tx);
        System.out.println("Transaction # " + (k++) + "\n" + tx.transactionInfo());
        System.out.println("Alice's balance: " + TxPool.alice.balanceETH() + " ETH");
        System.out.println("Bob's balance: " + TxPool.bob.balanceETH() + " ETH" + "\n");

        tx = new TransferTx("Alice", "Bob", "USDT", 130);
        TxPool.addTransaction(tx);
        System.out.println("Transaction # " + (k++) + "\n" + tx.transactionInfo());
        System.out.println("Alice's balance: " + TxPool.alice.balanceUSDT() + " USDT");
        System.out.println("Bob's balance: " + TxPool.bob.balanceUSDT() + " USDT" + "\n");

        block = new Block(++i, block.currHash, TxPool.getPool());
        block.mineBlock(1);
        blockchain.addBlock(block);

        blockchain.getBlocks();
    }
}