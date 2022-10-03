package actors;

interface Account {
    public String address();
    public int nonce();
    public int balance();
    public void incNonce();
}
