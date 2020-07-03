package com.test;



/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
public class TestClass {

    public static void main(String[] args) throws Exception{
        System.out.println("welcome");
         /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int n = Integer.valueOf(br.readLine().trim());
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
