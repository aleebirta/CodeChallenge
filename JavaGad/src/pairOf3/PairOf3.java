package pairOf3;

import java.util.Scanner;

public class PairOf3 {

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

        for(int i=0;i<n-2;i++) {
            for (int j = i + 1; j < n-1; j++) {
                for(int k=j+1;k<n;k++) {
                    if (ar[i] + ar[j] +ar[k] == 0 && fr[i] == 0 && fr[j] == 0 && fr[k]==0) {
                        nr++;
                        fr[i] = 1;
                        fr[j] = 1;
                        fr[k] = 1;
                    }
                }
            }
        }
        System.out.print(nr);
    }
}
