package com.test;

import java.io.*;
import java.util.*;


public class DigitalString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            int[] P = new int[N];
            int[] Q = new int[N];
            int[] R = new int[N];
            int[] S = new int[N];
            for(int i=0;i<N;i++)
            {
                String[] inp = br.readLine().split(" ");
                P[i] = Integer.parseInt(inp[0]);
                Q[i] = Integer.parseInt(inp[1]);
                R[i] = Integer.parseInt(inp[2]);
                S[i] = Integer.parseInt(inp[3]);
            }

            int out_ = solve(N, P, Q, R, S);
            System.out.println(out_);
        }

        wr.close();
        br.close();
    }
    static int solve(int N, int[] P, int[] Q, int[] R, int[] S){
        // Your code goes here
        return 0;
    }
}
