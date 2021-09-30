package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {12,56,27,17,58,34,31,12,13};
        int se = 0;
        int so = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                se=se+arr[i];
            }
            else{
                so=so+arr[i];
            }
        }
        System.out.println("the sum of even elements: "+se);
        System.out.println("the sum of odd elements: "+so);
    }
}
