package com.rk;

public class GenericWorkshop {
    
    public static void main(String[] args) {
/*
        // demo 1
        // initialisasi data
        Integer[] numbers = {10,5,18,12,15};
        Double[] prices = {2.41,8.52,1.23,6.29,2.12};
        Character[] chars = {'c','K','e','D','f'};
        String[] cities = {"Jakarta", "Surabaya", "Bandung", "Yogyakarta","Banjarmasin"};

        // Sort dengan bublesort
        bubbleSort(numbers);
        bubbleSort(prices);
        bubbleSort(chars);
        bubbleSort(cities);

        // Display the sorted arrays
        System.out.print("Sorted dengan tipe Integer: ");
        showData(numbers);
        System.out.print("Sorted dengan tipe Double: ");
        showData(prices);
        System.out.print("Sorted dengan tipe Character: ");
        showData(chars);
        System.out.print("Sorted dengan tipe String: ");
        showData(cities);
        
        // demo 2
        */
        Integer num1 = 10;
        double num2 = 15.84;
        
        double total = add(num1,num2);
        System.out.print("total add: ");
        System.out.println(total); 
        
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        int j;
        boolean flag = true;   
        E temp;   

        while (flag) {
            flag = false;    
            for (j = 0; j < list.length - 1; j++) {
                if (list[j].compareTo(list[j + 1]) > 0) 
                {
                    temp = list[ j];                
                    list[ j] = list[ j + 1];
                    list[ j + 1] = temp;
                    flag = true;               
                }
            }
        }
    }

    public static <E> void showData(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    
    public static <T extends Number> double add(T first, T second) {
      return first.doubleValue() + second.doubleValue();
   }
}
