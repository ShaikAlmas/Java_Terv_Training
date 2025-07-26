public class numberPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){ //prints 0
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
            }
        }
        System.out.println( );
        }
        int m=(n/2)+1;
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||j==m||((i==j)&&(i<=m)&&(j==2))){ //prints 1
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
            }
        }
        System.out.println( );
    }
      for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                 if(i==1||i==n||i==m || (j==n && i<=m)||(j==1&&i>=m)){ //prints 2
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
            }
        }
        System.out.println( );
    }
      for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||i==m||j==n){ //prints 3
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
            }
        }
        System.out.println( );
    }
     for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                 if(((j==1)&&(i<=m))||j==m||i==m){ //prints 4
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
            }
        }
        System.out.println( );
    }
  for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                 if(i==1||i==n||i==m || (j==n && i>=m)||(j==1&&i<=m)){ //prints 5
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
            }
        }
        System.out.println( );
    }
     for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                 if(i==1||i==n||i==m || (j==n && i>=m)||(j==1)){ //prints 6
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
            }
        }
        System.out.println( );
}
 for(int i=1;i<=n;i++){
            for(int j=1,k=5;j<=n;j++,k--){
                 if(i==k||i==1){ //prints 7
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
            }
        }
        System.out.println( );
}
 for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                 if(i==1||i==n||i==m||j==1||j==n){ //prints 8
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
            }
        }
        System.out.println( );
}
 for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                 if(i==1||j==n||i==m||(j==1&&i<=m)){ //prints 9
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
            }
        }
        System.out.println( );
}
}
}
