public class test1 {
    public static void main(String[] args) {
        int[][] mas = new int[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++)
                if((i+j)%2==0)
                    System.out.print("W ");
                else
                    System.out.print("B ");
            System.out.println();
        }

    }

}