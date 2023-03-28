package full_gu;

import java.util.*;
public class Random_pass_gen
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Random rn= new Random();
        char chl,chu,ss,finl;

        String alpha_upr="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alpha_low="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String sp="!@#$%^&*()_-=+[}]{|<,>.?/;:'";
        String rand,rand2;

        StringBuilder sb1= new StringBuilder();

        int i,n,indchl,indchu,indn,inds,fin;

        System.out.println("\t\t\t\t\t\t\t\t\t\t\tA good password is atleast 25+ characters long!\n\n");
        System.out.println("Enter the number of characters of your password:");
        n=sc.nextInt();

        for(i=0;i<n;i++) {
            indchl =rn.nextInt(alpha_low.length());
            chl =alpha_low.charAt(indchl);
            sb1.append(chl);

            indchu =rn.nextInt(alpha_upr.length());
            chu =alpha_upr.charAt(indchu);
            sb1.append(chu);

            indn =rn.nextInt(num.length());
            sb1.append(indn);

            inds =rn.nextInt(sp.length());
            ss =sp.charAt(inds);
            sb1.append(ss);
        }

        rand=sb1.toString();

        StringBuilder sb2= new StringBuilder();

        for(i=0;i<n;i++) {
            fin=rn.nextInt(rand.length());
            finl=rand.charAt(fin);
            sb2.append(finl);
        }

        rand2=sb2.toString();
        System.out.println("Your random password is: "+rand2);
        System.out.println("Make sure your password is random enough! If not, re-run the generator!(Most passwords are secure!)");
    }
}
