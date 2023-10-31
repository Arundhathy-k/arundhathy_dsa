package ArrayProblems;

public class FloydsTriangle {

	public void displayFloydsTriangle()
	{
		int rows = 4;
		int num = 20;
		for(int i=1;i<=rows;i++)
		{
			for(int j =1; j<=i;j++)
			{
				System.out.print(num+ " ");
				++num;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		FloydsTriangle ft = new FloydsTriangle();
		ft.displayFloydsTriangle();
	}

}
