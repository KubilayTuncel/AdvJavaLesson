package EnumType;

public enum TransactionType {
    Deposit(5),
    Withdraw(10),
    Transfer(15),
    Payment(20),
    Other(100);

    private final int transactionCode;
    //final ifadesini kullandiysak parametreli bir constructor olusturmamiz gerekiyor. Cünkü final yazili valueler bir degerle set edilmesi gerekiyor.

    public int getTransactionCode() {
        return transactionCode;
    }

    //Parametreli const.
    private TransactionType(int transactionCode) {
        this.transactionCode = transactionCode;
    }

}
