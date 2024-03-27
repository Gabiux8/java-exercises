package lt.techin.praktinis;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // 1.Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.
        // 1. An array and example are provided to test the program. You can change the values of the array elements.

        int[] arr = {3, 2, 1, 4, 6, 5};

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);

    }

    //2. Metodas turi grąžinti pirmą masyvo elementą
    //2. The method must return the first element of the array
    public static int getFirstElement(int[] arr) {
        //TODO
        return arr[0];
    }

    //3. Metodas turi grąžinti paskutinį masyvo elementą
    //3. The method must return the last element of the array
    public static int getLastElement(int[] arr) {
        //TODO
        return arr[arr.length - 1];
    }

    //4. Raskite mažiausią masyvo elementą
    //4. Find the smallest element of an array
    public static int getMin(int[] arr) {
        //TODO
        int min = arr[0];

        for (int i=0; i< arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

    //5. Raskite didžiausią masyvo elementą
    //5. Find the largest element of the array
    public static int getMax(int[] arr) {
        //TODO
        int max = arr[0];

        for (int i=1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //6. Suskaičiuokite masyvo elementų sumą
    //6. Calculate the sum of the array elements
    public static int getSum(int[] arr) {
        //TODO
       int sum = 0;
       for (int i = 0; i < arr.length; i++) {
           sum = sum + arr[i];
       }
       return sum;
    }

    //7. Raskite masyvo elementų vidurkį
    //7. Find the average of the array elements
    public static int getAverage(int[] arr) {
        //TODO
        return 0;
    }

    //8. Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    //8. Count how many numbers in the array are greater than the given number n
    public static int countElements(int[] arr, int n) {
        //TODO
        return 0;
    }

    //9. Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    //9. The method must return true if the array contains an element whose value is equal to n
    public static boolean contains(int[] arr, int n) {
        //TODO
        return false;
    }

    //10. Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    //10. Find the last index of the element whose value is equal to n
    public static int lastIndexOf(int[] arr, int n) {
        //TODO
        return 0;
    }






}
