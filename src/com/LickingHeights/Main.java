package com.LickingHeights;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 1;
        int highestNumber = 100;
        String[]firstName = {"Nathan","Grant","Isancor","Mitch"};
        String[]middleName = {"Plants","Charles","Miller","David"};
        String[]lastName = {"Caldwell","Stratton","Walters","Smith"};
print80sRapperName(firstName,middleName,lastName);

        int[] array = createNumberArray(size, lowestNumber, highestNumber);
        String[] Adjectives = {"smart", "artistic", "long", "dumb"};
        String[] Places = {"Colombus", "Egypt", "Cleavland", "France"};
        String[] People = {"Donald Trump", "Obama","Stan Lee", "James Charles"};
        String[] Times = {"1888", "1899", "1999", "2019"};
        String[] Things = {"Pencil sharpener", "Flag", "Chair", "Book"};
        String[] verbs = {"run", "jog", "walk","trot"};
//        Pattern1();
//        Pattern2();
//        Pattern3();
//        Pattern4();
//        Pattern5();
        SentenceGenerator(verbs,Places,Adjectives,People,Times,Things);
        System.out.println("");
        System.out.println("The sum of the array is " + sum(array));
        System.out.println("the minimum of the array is "+ minimum(array));
        System.out.println("The maximum of the array is "+ maximum(array));
printArray(array);
System.out.println("After bubble sort ");
printArray(BubbleSort(array));

    }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }

    public static void Pattern1() {
        for (int rows = 0; rows < 6; rows++) {

            for (int columns = 0; columns < 6; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern2() {
        for (int rows = 1; rows < 7; rows++) {

            for (int columns = 1; columns < 7; columns++) {
                System.out.print(rows);
            }
            System.out.println(rows);
        }
    }

    public static void Pattern3() {
        for (int rows = 1; rows < 7; rows++) {

            for (int columns = 1; columns < 7; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }
    }

    public static void Pattern4() {
        for (int times = 1; times < 7; times++) {

            for (int columns = 1; columns <= times; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern5() {
        for (int times = 1; times < 7; times++) {

            for (int columns = 1; columns <= times; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int minimum(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min < array[1]) {
                array[1] = min;
            }
            min = array[1];
        }
        return min;
    }
    public static int maximum(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max > array[1]) {
                array[1] = max;
            }
            max = array[1];
        }
        return max;
    }
    public static int[] BubbleSort(int []array){
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = i+1; j < n; j++)
                if (array[j] < array[i])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
                return array;
    }
    public static void SentenceGenerator(String[] verbs ,String[]Places, String[]Adjectives, String[]People, String[]Times,String[]Things){
        System.out.println("I was " +randomWord(verbs)+ " down the "+randomWord(Places)+ " around "+randomWord(Times)+ " with my best friend " +randomWord(People)+ " and we "+randomWord(verbs)+ " a "+randomWord(Adjectives )+ " "+randomWord(Things ));
        System.out.print(" that was " +randomWord(verbs )+" " +randomWord( Things) +(". "));
    }
    public static String randomWord(String[] array){
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }
    public static void  print80sRapperName(String[] firstName,String[] middleName, String[]lastName){
        System.out.println(randomWord(firstName) + randomWord(middleName) + randomWord(lastName));
    }
}
