package EnumType;

public class MainTest {

    public static void main(String[] args) {
            useConstantMethod(1);
            useConstantMethod(2);
            useConstantMethod(3);
            useConstantMethod(4);
            useConstantMethod(100);
           // useConstantMethod(5); //CTE vermedi

        useEnumMethod(TransactionType.Deposit);
        useEnumMethod(TransactionType.Payment);
        useEnumMethod(TransactionType.Transfer);
        useEnumMethod(TransactionType.Withdraw);
        useEnumMethod(TransactionType.Other);
       // useEnumMethod(TransactionType.A); //CTE

        use(5);

    }

    //eski tarz
    private static void useConstantMethod(int i){
        if(i==TransactionTypeConstant.Deposit) {
            System.out.println("Money is depositing");
        }else if(i==TransactionTypeConstant.Withdraw){
            System.out.println("Money is withdrawing");
        }else if(i==TransactionTypeConstant.Transfer) {
            System.out.println("Money is transfering");
        }else if (i==TransactionTypeConstant.Payment) {
            System.out.println("Money is paying");
        }else if(i==TransactionTypeConstant.Other){
            System.out.println("Other Transaction");
        }

    }

    //enum yapiyla
    private static void useEnumMethod(TransactionType transactionType){
        if (transactionType==TransactionType.Deposit){
            System.out.println("Money is depositing");
        }else if(transactionType==TransactionType.Withdraw){
            System.out.println("Money is withdrawing");
        }else if(transactionType==TransactionType.Transfer){
            System.out.println("Money is transfering");
        }else if(transactionType==TransactionType.Payment){
            System.out.println("Money is paying");
        }else if (transactionType==TransactionType.Other){
            System.out.println("Other Transaction");
        }

        //Enum yapiya has methodlar
        System.out.println("Enum name : "+ transactionType.name()); //isimlerine göre cagirmamiza yariyor
        System.out.println("Enum Code Value : " +transactionType.getTransactionCode()); //Verdigimiz numeric syilara göre cagirmamiza yariyor
        System.out.println("Enum ordinal : " +transactionType.ordinal()); //Enum class array gibi calistigi icin index numarasina göre cagirmamizi sagliyor.
    }
    private static void use(int i){
        if(i == TransactionType.Deposit.getTransactionCode()){
            System.out.println("Money is depositing use methodundan");
        }
    }

}
