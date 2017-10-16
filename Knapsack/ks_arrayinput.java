public class ks_arrayinput {

	public int[][] ks_arrayinput (int dim, int price, int weight){
	
		int[][] a_in = new int[2][dim];
		System.out.println("\nYour primary kid is:");
		for (int i=0;i<dim;i++){
			a_in[0][i]=(int)(Math.random()*price*0.89+0.1*price);
			System.out.print(a_in[0][i]+" ");
		}
		System.out.println();
		for (int i=0;i<dim;i++){
			a_in[1][i]=(int)(Math.random()*0.89*weight+0.1*weight);
			System.out.print(a_in[1][i]+" ");
		}		
		System.out.println();
		return a_in;
	}
}