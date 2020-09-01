package com.company;

public class Array {

    private int[] items;
    private int count;


    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count){
            // Create a new Array twice the size.
            int[] newItems = new int[count *2];

            //Copy all the existing items.
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            //Set items to this new Array
            items = newItems;
        }
        items[count++] = item;
//        count++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)


    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
