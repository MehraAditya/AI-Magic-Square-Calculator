import java.util.Scanner;

class OddMagicSquare {
	
	static void generateMagicSquare(int n)
	{
		int[][] magicSquareArr = new int[n][n];

		
		int i = n / 2;
		int j = n - 1;

		
		for (int num = 1; num <= n * n;) {
			if (i == -1 && j == n) 
			{
				j = n - 2;
				i = 0;
			}
			else {
				
				if (j == n)
					j = 0;

			
				if (i < 0)
					i = n - 1;
			}

			
			if (magicSquareArr[i][j] != 0) {
				j -= 2;
				i++;
				continue;
			}
			else
				
				magicSquareArr[i][j] = num++;

			
			j++;
			i--;
		}

		System.out.println("The Magic Square for " + n
						+ ":");
		System.out.println("Sum of each row or column "
						+ n * (n * n + 1) / 2 + ":");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++)
				System.out.print(magicSquareArr[i][j] + " ");
			System.out.println();
		}
	}

	
	public static void main(String[] args)
	{   Scanner in = new Scanner(System.in);
        System.out.printf("Enter the value of odd order matrix : ");	
		int n = in.nextInt();
		in.close();
		generateMagicSquare(n);
	}
}

