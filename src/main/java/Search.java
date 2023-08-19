public class Search {
    public static void main(String[] args) {
        int [] numbers = {8, 9 , -5, 7, 78, -15, 0};
        SearchMAxElement element = (int [] arrayNumber) -> {
            int maxElement = arrayNumber[0];
            int preMaxElement = arrayNumber[0];
            for (int i = 0; i < arrayNumber.length; i++) {
                if (arrayNumber[i] > maxElement){
                    preMaxElement = maxElement;
                    maxElement = arrayNumber[i];
                }
            }
            return preMaxElement;
        };
        System.out.println("Second largest element = " + element.scan(numbers));
    }
}
 interface SearchMAxElement{
    int scan(int [] Numbers);
 }
