package Generics;

public class Program {
    public static void main(String[] args) {
        AccountTest<String> acc1 = new AccountTest<>("Vasya", 56);
        AccountTest<String> acc2 = new AccountTest<>("Petya", 56);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
        System.out.println(acc1.getSum());
    }
}
    interface AccountPlus<T> {
        T getId();


    }
        class AccountTest<T> implements AccountPlus<T> {
            private T id;

            public int getSum() {
                return sum;
            }

            private int sum;

            @Override
            public T  getId() {
                return id;
            }

            public AccountTest(T id, int sum) {
                this.id = id;
                this.sum = sum;

            }
        }




