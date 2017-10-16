public class knapsack {

	public static void main(String args[]){
//input primary data (dimension, price, weight, knapsack weigh
		ks_filling ks = new ks_filling();
		int[] ks_in = new int[4];
		ks_in = ks.ks_input();
		int dimension=ks_in[0]; int price=ks_in[1]; int weight=ks_in[2]; int ksweight=ks_in[3];
		
//filling array of price & weight		
		ks_arrayinput ksin = new ks_arrayinput();
		int[][] ks_array = new int[2][dimension];
		ks_array=ksin.ks_arrayinput(dimension, price, weight);

//optimizing array
		ks_optimizer kopt = new ks_optimizer();
		float[][] ksopt = new float[4][dimension];
		ksopt=kopt.ks_optimizer(ks_array, dimension);		

//task solution (each item has only for 1 time)
		ks_solution ksso=new ks_solution();
		float[][] array_sol = new float [dimension][dimension+1];
		array_sol = ksso.ks_solution(dimension, ksweight, ksopt, ks_array);
		
//control part
		ks_control ksc=new ks_control();
		ksc.ks_control(array_sol, dimension);
					
	}
}