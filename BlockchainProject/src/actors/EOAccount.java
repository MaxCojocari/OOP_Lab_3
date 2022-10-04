package actors;

public class EOAccount extends Account {
    public String address;
    public int nonce;
    public int balanceETH;
    public int balanceUSDT;

    public EOAccount(String address, int balanceETH, int balanceUSDT) {
        this.address = address;
        this.nonce = 0;
        this.balanceETH = balanceETH;
        this.balanceUSDT = balanceUSDT;
    }

    public String address() {
        return address;
    };

    public int nonce() {
        return nonce;
    };

    public int balance() {
        return balanceETH;
    };

    public void incNonce() {
        nonce++;
    };
    
    public boolean sendETH(int amount, String to) {
        if (amount <= 0) return false;
        balanceETH -= amount;
        return true;
    }
    
    public boolean receiveETH(int amount) {
        if (amount <= 0) return false;
        balanceETH += amount;
        return true;
    }

    public boolean sendUSDT(int amount, String to) {
        if (amount <= 0) return false;
        balanceETH -= amount;
        return true;
    }
    
    public boolean receiveUSDT(int amount) {
        if (amount <= 0) return false;
        balanceETH += amount;
        return true;
    }

    public int balanceUSDT() {
        return balanceUSDT;
    }

    public int balanceETH() {
        return balanceETH;
    }
}
