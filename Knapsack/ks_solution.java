public class ks_solution {

	//experience with github
	public float[][] ks_solution(int dimension, int ksweight, float ksopt[][], int ks_array[][]){
		float[][] array_solu = new float [dimension][(dimension+1)];
		int j=0; int i=0;
		float sum; float sum_weight; int k=0; 
		float best_kid_sum=0; float best_kid_weight = 0;int best_kid_number=0;
		
			for(i=0; i<dimension;i++){
				sum=0; sum_weight=0;
				for(j=0;j<dimension;j++){
					if (k==i && k==j){k++; if(j<dimension-1){j++;}}

					if((sum_weight+ksopt[2][j])<ksweight){
						array_solu[i][j]=ksopt[0][j];
						sum+=ksopt[1][j];
						sum_weight+=ksopt[2][j];
						array_solu[i][dimension]=sum;}

					if(best_kid_sum<array_solu[i][dimension]){
						best_kid_sum=array_solu[i][dimension];
						best_kid_number=i;
						best_kid_weight=sum_weight;}
					}
				System.out.println(i+ ": sum "+array_solu[i][dimension]+
						" weight "+sum_weight+
						" best_numb "+best_kid_number);
				}

			System.out.println(	"\n****************************\n"+
								"The best kid is "+best_kid_number+
								".\nwith full cost: "+array_solu[best_kid_number][dimension]+
								".\nThe full weith is: "+best_kid_weight+
								"\n****************************\nThe kid is:");
			float l=0;
			for (i=0;i<dimension;i++){
				System.out.print((int) array_solu[best_kid_number][i]+" ");
				l=i/40; if(l==(float)i/40 && i!=0){System.out.println();}}
			System.out.print("\n****************************\n");
			return array_solu;
	}
}