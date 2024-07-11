public class Patterns {
    public static void main(String[] args){
        pattern6(5);
    }

    static void pattern1(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row=1; row<=n; row++){
            for(int col=n; col>=row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row=1; row<=2*n-1; row++){
            int colLen= row<=n? row:2*n-row;
            for(int col=1; col<=colLen; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int row=1; row<=n; row++){
            int spaces= n-row;
            for(int col=spaces; col>=1; col--){
                System.out.print("  ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int row=1; row<=n; row++){
            int spaces= row-1;
            for(int col=1; col<=spaces; col++){
                System.out.print(" ");
            }
            for(int col=n; col>=row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int row=1; row<=n; row++){
            int spaces= n-row;
            for(int col=1; col<=spaces; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1; col++){
                System.out.print("*");
            }
            for(int col=spaces; col>=1; col--){
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int row=1; row<=n; row++){
            int spaces= row-1;
            for(int col=spaces; col>=1; col--){
                System.out.print(" ");
            }
            
            for(int col=2*(n-row)+1; col>=1; col--){
                System.out.print("*");
            }
            for(int col=1; col<=spaces; col++){
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}
