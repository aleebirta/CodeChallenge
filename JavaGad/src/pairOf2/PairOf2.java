package pairOf2;

import java.util.Scanner;

public class PairOf2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        int[] fr = new int[n];
        for(int i=0;i<n;i++)
            fr[i]=0;

        int nr=0;

        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();

        for(int i=0;i<n-1;i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] + ar[j] == 0 && fr[i]==0 && fr[j]==0) {
                    nr++;
                    fr[i]=1;
                    fr[j]=1;
                }
            }
        }
        System.out.print(nr);
    }
}
