package generic;

public class Findmaximum {
    public static <T extends Comparable<T>> T findMax(T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0){
            max = b;

        }
        if (c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        int intMax1 = findMax(5, 9, 3);
        int intMax2 = findMax(-7, 0, 10);
        int intMax3 = findMax(1, 1, 1);
        System.out.println("Maximum of 5, 9, and 3 is:" +intMax1);
        System.out.println("Maximum of -7, 0, and 10 is:" +intMax2);
        System.out.println("Maximum of 1, 1, and 1 is:" +intMax3);
        //Test cases with other data type(e.g., String, float)
        float floatMax1 = findMax(3.14f, 4.56f, 2.71f);
        String strMax = findMax("Apple", "Peach", "Banana");
        System.out.println("Maximum of 3.14f, 4.56f, and 2.71f is:" +floatMax1);
        System.out.println("Maximum of 'Apple', 'Peach', and 'Banana' is: " +strMax);
    }
}
