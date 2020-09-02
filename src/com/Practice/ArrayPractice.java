package com.Practice;
class ArrayPractice {
    public static void main(String[] args) {
        int[] mArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt(mArray);
        for(int i=0;i<mArray.length;i++){
            System.out.print(mArray[i]);
        }
    }
}
class ChangeIt{
    static void doIt(int[] z){
        int[] A=z;
        A[0]=99;
    }
}
