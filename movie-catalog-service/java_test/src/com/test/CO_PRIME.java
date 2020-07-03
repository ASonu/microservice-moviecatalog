package com.test;

import java.io.*;
import java.util.*;

public class CO_PRIME {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        int a_size = Integer.parseInt(br.readLine().trim());
        String[] arr_a = br.readLine().split(" ");
        int[] a = new int[a_size];
        for(int i_a=0; i_a<arr_a.length; i_a++)
        {
            a[i_a] = Integer.parseInt(arr_a[i_a]);
        }

        long out_ = non_coprime_subarrays(a, n);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static long non_coprime_subarrays(int[] a, int n){
        // Your Code Goes Here
        int count =0;
        for(int i=0; i < n-1; i++){
            for(int j =1; j < n; j++){
                if(coprime(a[i],a[j])){
                    count ++;
                }
            }
        }
        return count;
    }

    static boolean coprime(int a, int b){
        return (gcd(a,b) == 1);
    }

    static int gcd(int a, int b){
        if(a == 0 || b == 0)
            return 0;

        if( a== b)
            return a;

        if(a > b){
            return gcd(a-b,b);
        } else {
            return gcd (a,b-a);
        }
    }
}
