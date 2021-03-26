package com.company;

import java.util.Scanner;

public class logic {
    public static void main(String[] args){
        System.out.print("請輸入:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String input[] = line.split(" ");
        boolean bln[] = new boolean[3];
        System.out.println("輸出:");

        if (input.length != 3) {
            System.out.println("IMPOSSIBLE");
            return;
        } else {
            for (int i = 0; i < input.length; i++) {
                int x = 0;
                try {
                    x = Integer.valueOf(input[i].trim());
                    if (i < 2) {
                        if (x < 0 || x >= 10000) {
                            throw new Exception();
                        }
                    } else {
                        if (x < 0 || x > 1) {
                            throw new Exception();
                        }
                    }
                    bln[i] = x > 0 ? true : false;
                } catch (Exception e) {
                    System.out.println("IMPOSSIBLE");
                    return;
                }
            }
        }

        int count=0;
        if ((bln[0] && bln[1]) == bln[2]) {
            System.out.println("AND");
            count++;
        }
        if ((bln[0] || bln[1]) == bln[2]) {
            System.out.println("OR");
            count++;
        }
        if ((bln[0] ^ bln[1]) == bln[2]) {
            System.out.println("XOR");
            count++;
        }
        if(count==0){
            System.out.println("IMPOSSIBLE");
        }
    }
}
