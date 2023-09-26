package Generics;

public class Program {
    public static void main(String[] args) {
        AccountTestt acc1 = new AccountTestt("Vasya", 5000);
        AccountTestt acc2 = new AccountTestt("Petya", 4300);
        Transaction<AccountTestt> personOne = new Transaction<>(acc1,acc2,14);
        Transaction<AccountTestt> personTwo = new Transaction<>(acc1,acc2,14);
        Transaction<AccountTestt> personThree = new Transaction<>(acc1,acc2,14);
        personOne.execute();

    }
}
    interface AccountPlus {
        String getId();
        int getSum();
        void setSum(int sum);
    }
        class AccountTestt implements AccountPlus {
            private String id;
            private int sum;

            public AccountTestt(String id, int sum) {
                this.id = id;
                this.sum = sum;
            }
            @Override
            public String getId() {
                return id;
            }
            @Override
            public int getSum() {
                return sum;
            }

            @Override
            public void setSum(int sum) {
                this.sum = sum;
            }
        }

            class Transaction<T extends  AccountPlus>{
                private T from;
                private T to;
                private int sum;

                public Transaction(T from, T to, int sum) {
                    this.from = from;
                    this.to = to;
                    this.sum = sum;
                }

                public void execute(){

                    if (from.getSum() > sum)
                    {
                        from.setSum(from.getSum() - sum);
                        to.setSum(to.getSum() + sum);
                        System.out.printf("Account %s: %d \nAccount %s: %d \n",
                                from.getId(), from.getSum(),to.getId(), to.getSum());
                    }
                    else{
                        System.out.printf("Operation is invalid");
                    }
                }
            }






