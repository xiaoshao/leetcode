package com.first;

public class Solutions{

    public static void main(String[] args){
        System.out.println(firstBadVersion(2126753390));
    }


    public static int firstBadVersion(int n) {
        int begining = 1;
        int end = n;
        while(begining != end){
            if(isBadVersion(begining)){
                return begining;
            }

            int temp = (begining + end) / 2;

            if(isBadVersion(temp)){
                end = temp;
            }else{
                begining = temp + 1;
            }
        }

        return end;
    }

    public static boolean isBadVersion(int version){
        return version == 1702766719;
    }
}