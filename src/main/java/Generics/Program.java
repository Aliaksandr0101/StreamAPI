package Generics;

public class Program {
    public static void main(String[] args) {
        AccountTest<String> acc1 = new AccountTest<>("Vasya", 23);
        AccountTest<Integer> acc2 = new AccountTest<>(456, 33);
        System.out.println(acc1.getId());
        acc2.getId();
    }
}
    interface AccountPlus<T> {

        T getId();
        int getSum();
        void setSum(int sum);

    }
        class AccountTest<T> implements AccountPlus<T>{
            private T id;
            private int sum;

            @Override
            public T getId() {
                return id;
            }

            @Override
            public int getSum() {
                return sum;
            }

            @Override
            public void setSum(int sum) {

            }

            public AccountTest(T id, int sum) {
                this.id = id;
                this.sum = sum;
            }
        }




