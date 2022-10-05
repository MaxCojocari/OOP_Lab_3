package actors;

import global.EthereumObject;

abstract class Account extends EthereumObject {
    public String address;
    public int nonce;
    public int balanceETH;

    public abstract String address();
    public abstract int nonce();
    public abstract int balance();
    public abstract void incNonce();
    
    public int chainId() {
        return 144;
    };

    public String currentFork() {
        return "Paris";
    };
    
    public String nativeCurrency() {
        return "ETH";
    };
    
    public String consensusAlgorithm() {
        return "PoS";
    };
}
