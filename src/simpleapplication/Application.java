package simpleapplication;

import java.util.Scanner;

class Application{
 
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisisser la fonction\n 1 pour maxi  \n 2 pour mini \3 pour factorielle \4 pour palindrome");
        int reponse = sc.nextInt();
        MesFonctions mf = new MesFonctions();
        int a, b = 0;
        switch (reponse) {
            case 1:
                System.out.println("Entrer les deux nombres ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("Le maximum est:" + mf.maximum(a, b));
            case 2:
                System.out.println("Entrer les deux nombres ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("Le maximum est:" + mf.minimum(a, b));
            case 3:
                System.out.println("Entrer le nombre");
                a = sc.nextInt();

                System.out.println("Le factoriel est:" + mf.factorielle(a));
            case 4:
                System.out.println("Entrer le nombre/mot");
                String ch = sc.nextLine();
                if (mf.estPalindrome(ch)) {
                    System.out.println("Le mot saisi est un palindrome");
                } else {
                    System.out.println("Le mot saisi n'est pas un palindrome");
                }
                
        }
    }
}
