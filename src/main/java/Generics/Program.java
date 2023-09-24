package Generics;

public class Program {
    public static void main(String[] args) {
        AccountTestt acc1 = new AccountTestt("Vasya", 56);
        AccountTestt acc2 = new AccountTestt("Petya", 56);
        Transaction<AccountTestt> personOne = new Transaction<>(acc1,acc2,14);
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
                return null;
            }

            @Override
            public int getSum() {
                return 0;
            }

            @Override
            public void setSum(int sum) {
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
                    if (from.getSum()>sum) {
                        from.setSum(from.getSum()-sum);
                        to.setSum(to.getSum()+sum);
                        System.out.printf("Account %s: %d \nAccount %s: %d \n",
                                from.getId(), from.getSum(), to.getId(), to.getSum());
                    } else {
                        System.out.println("Operation is invalid");
                    }
                }
            }






