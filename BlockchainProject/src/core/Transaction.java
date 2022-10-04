package core;

import global.EthereumObject;

abstract class Transaction extends EthereumObject {
    private String sender;
    private String receiver;
    private boolean checked;

    public Transaction(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
        this.checked = false;
    }

    public abstract String transactionInfo();

    public String sender() {
        return sender;
    }

    public String receiver() {
        return receiver;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }
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
