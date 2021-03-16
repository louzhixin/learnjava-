package com.louclasse;
public class Main {
    public static void main(String[] args) {

        //ligne 8 , collone 9
        //place total 72

        int num = 72;
        int[] arr = new int[num];
        Main obj = new Main();

        obj.selection(arr,3,0);
        obj.selection(arr,3,1);
        obj.selection(arr,3,2);
        obj.selection(arr,3,3);

    }

    /**
     *
     * arr place
     *  x ligne
     *  y collone
     */
    public void selection(int[] arr, int x, int y) {
        int index = (x - 1) * 8 + y - 1;
        if (arr[index] == 0) {
            //égale 1 ,ca va dire été séletionnée
            arr[index] = 1;
            System.out.println("réussir de sécletionner ："  +  "ligne" + x + "colonne" + y);
        } else {
            System.out.println("résussir de sélectionner : " + "ligne" + y + "colonne"  + y );
        }

    }
}