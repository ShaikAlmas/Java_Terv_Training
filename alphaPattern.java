public class alphaPattern {
    public static void main(String[] args) {
        int n=5;
        int m=(n/2)+1;
        for(int i=1;i<=n;i++){ //prints A
            for(int j=1;j<=n;j++){
                if(i==1||j==n||j==1||i==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         System.out.println("\n");
      for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){ //prints L
                if(i==n||j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
          for(int i=1;i<=n;i++){
            for(int j=1,k=n;j<=n;j++,k--){ //prints M
                if(j==n||j==1||((i==j)&&(i<=m))||((i==k)&&(k<=m))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
             for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){ //prints A
                if(i==1||j==n||j==1||i==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
             for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){  //prints S
                if(i==1||i==m||i==n||((j==n)&&(i>=m))||((j==1)&&(i<=m))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
