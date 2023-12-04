import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Задача 1
    int [] a = new int [3];
    a[0] = 1;
    a[1] = 2;
    a[2] = 3;
    double [] b = {1.57, 7.654, 9.986};
    double [] c = {1, 2.51, 15120.4};
// Задача 2
        for (int e = 0; e<a.length; e++) {
            if (e == a.length-1) {
                System.out.print(a[e]);
                break;
            }
            System.out.print(a[e] + ", ");
        }
        System.out.println();
        for (int e = 0; e<b.length; e++) {
            if (e == b.length-1) {
                System.out.print(b[e]);
                break;
            }
            System.out.print(b[e] + ", ");
        }
        System.out.println();
        for (int e = 0; e<c.length; e++) {
            if (e == c.length-1) {
                System.out.print(c[e]);
                break;
            }
            System.out.print(c[e] + ", ");
        }
        System.out.println();
// Задача 3
        for (int e = a.length-1; e>=0; e--){
            if (e<=0) {
                System.out.print(a[e]);
                break;
            }
            System.out.print(a[e] + ", ");
        }
        System.out.println();
        for (int e = b.length-1; e>=0; e--){
            if (e<=0) {
                System.out.print(b[e]);
                break;
            }
            System.out.print(b[e] + ", ");
        }
        System.out.println();
        for (int e = c.length-1; e>=0; e--){
            if (e<=0) {
                System.out.print(c[e]);
                break;
            }
            System.out.print(c[e] + ", ");
        }
        System.out.println();
// Задача 4
    for (int e = 0; e<=a.length-1; e++){
        if (a[e] %2 !=0) {
            System.out.println(a[e] + 1);
        }
    }
    // Задание выполнено
    }
}