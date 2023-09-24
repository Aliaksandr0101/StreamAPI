package Generics;

public class GenericConstructor<T,V> {
    public GenericConstructor(T elementT, V elementV) {
        if (elementT.getClass().isInstance(elementV)){
            System.out.println("The classes coincided");
        } else {
            System.out.println("The classes is not match");
        }
    }

    public static void main(String[] args) {
         GenericConstructor<String, String> GenericOne = new GenericConstructor<>("Car", "Elephant");
         GenericConstructor<String, Double> GenericTwo = new GenericConstructor<>("Car", 78.7);
        AccountTest<String> acc1 = new AccountTest<String>("2345", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        AccountTest<Integer> acc2 = new AccountTest<Integer>(2345, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);



    }
}
 class Account<T>{

    private T id;
    private int sum;

    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
