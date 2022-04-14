package org.launchcode.java;

public class ArrayListPractice {
    public static void main(String[] args) {
        int arraySize  = 10;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int EvenSum = SumOfEvenNumbersArray(numbers, arraySize);
        System.out.println("Sum of Even numbers : "  + EvenSum);
    }

    public static int SumOfEvenNumbersArray(int[] numbers, int arraySize)
    {
        int i, EvenSum = 0;

        for(i = 0; i < arraySize; i++)
        {
            if(numbers[i] % 2 == 0)
            {
                EvenSum = EvenSum + numbers[i];
            }
        }
        return EvenSum;
    }
}

