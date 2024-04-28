/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.linearsearch;

/**
 *
 * @author kamau
 */
public class LinearSearch {

    public static int search(int[] my_array, int targetValue) {
        for (int i=0; i< my_array.length; i++) {
            if (my_array[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] my_array = {4, 34, 25, 12, 22, 11, 90, 5};
        int targetValue = 11;

        int result = search(my_array, targetValue);
        if (result != -1) {
            System.out.println("we found "+ targetValue+" at index "+result );
        }
        else 
            System.out.println("we never found"+targetValue);
    }
}
