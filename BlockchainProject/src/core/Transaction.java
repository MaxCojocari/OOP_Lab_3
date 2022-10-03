package core;

abstract class Transaction {
    private String sender;
    private String receiver;
    private boolean checked;

    public Transaction(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
        this.checked = false;
    }

    public abstract String getTransactionInfo();

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public boolean getChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }
}
