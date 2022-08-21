package codes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");float a = input.nextFloat();
        float b = input.nextFloat();
        Perimetr(a,b);

        int array[] = {1, 2, 3, 4, 5};
        showmas(array);
        showmas_adv(1,2,3,4,5,6,7,8,array[0]);

        modul(3.5, 4.6, 3.1);
        modul(3, 4, 5, 6);
        modul(3, 5, 4.3); // DOUBLE в итоге
    }

    static float Perimetr(float a, float b){
        float res = 2 * (a+b);
        System.out.println(res);
        return res;
    }

    static void showmas(int massive[]){
        for (int ai: massive){
            System.out.printf("%d, ",ai);
        }
        System.out.println();
    }

    static void showmas_adv(int ...massive){
        for (int ai: massive){
            System.out.printf("%d, ",ai);
        }
        System.out.println();
    }


    static void modul(int ...x){
        for (int ai: x){
            System.out.printf("%d, ",ai);
        }
        System.out.println();
    }
    static void modul(double ...x){
        for (double ai: x){
            System.out.printf("%f, ",ai);
        }
        System.out.println();
    }
}
