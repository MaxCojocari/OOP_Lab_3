package crypto;

interface Asset {
    public String name();
    public String symbol();
    public int decimals();
    public void transfer(int amount, String from, String to);
    public int balanceOf(String address);
}
