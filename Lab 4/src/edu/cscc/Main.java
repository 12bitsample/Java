package edu.cscc;

import java.util.Arrays;
import java.util.Scanner;

//Michael McAdow, 2/7/22, Lab 4
public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
	    int count = 0; //number of items currently in grocery list
        String [] groceryList = new String [6];
        while (count < groceryList.length) {
            System.out.print("Enter grocery item: ");
            String item = input.next();
            if (!isDuplicate(item, groceryList, count)) {
                groceryList[0] = item;
                count++;

            }else {
                System.out.println("sorry you made duplikate duhh.");
            }
            System.out.println(count);


        }
    }

    public static boolean isDuplicate(String item, String[] list, int listCnt ) {
        boolean result = false;

        for (int i = 0; i < listCnt; i++) {
//            if (item == list[i])
            if (item.equalsIgnoreCase(list[i])) {
                System.out.println("Sorry, item: " + list[i] + " is a duplicate");
                result = true;
            }
//            else {
//                list[i]=item;
//                listCnt++;
//            }
        }
            return result;
    }
}
