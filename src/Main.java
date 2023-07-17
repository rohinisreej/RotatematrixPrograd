import java .util.Scanner;

class RotateMatrix{
    public static void rotatematrix(int[][] array,int n,int m)
    {
        int temp=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i<j)
                {
                    temp=array[i][j];
                    array[i][j]=array[j][i];
                    array[j][i]=temp;
                }
            }
        }
        int t=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                t=array[i][j];
                array[i][j]=array[i][n-1-j];
                array[i][n-1-j]=t;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row=scanner.nextInt();
        System.out.println("Enter the col: ");
        int col=scanner.nextInt();
        System.out.println("Enter the values: ");
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        RotateMatrix rm=new RotateMatrix();
        rm. rotatematrix(arr,row,col);

    }
}