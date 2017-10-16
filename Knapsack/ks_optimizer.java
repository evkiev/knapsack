public class ks_optimizer {

	public float[][] ks_optimizer (int[][] ks, int dimension){
		float[][] ks_opt=new float [4][dimension];
		
		
		System.out.println("\nPrice/weight array:");
		for(int i=0;i<dimension;i++){
			ks_opt[0][i]=i+1;
			ks_opt[1][i]=ks[0][i];
			ks_opt[2][i]=ks[1][i];
			ks_opt[3][i]=ks_opt[1][i]/ks_opt[2][i];
			System.out.print(ks_opt[3][i]+" ");
			}
		
			System.out.println();
		
		float a0=0; float a1=0;float a2=0;float a3=0;
		
		for (int i=0;i<dimension-1;i++){
			for(int j=0;j<dimension-1;j++){
				if (ks_opt[3][j]<ks_opt[3][j+1]){
					a0=ks_opt[0][j]; ks_opt[0][j]=ks_opt[0][j+1];ks_opt[0][j+1]=a0;
					a1=ks_opt[1][j]; ks_opt[1][j]=ks_opt[1][j+1];ks_opt[1][j+1]=a1;
					a2=ks_opt[2][j]; ks_opt[2][j]=ks_opt[2][j+1];ks_opt[2][j+1]=a2;
					a3=ks_opt[3][j]; ks_opt[3][j]=ks_opt[3][j+1];ks_opt[3][j+1]=a3;
				}
			}
		}
		System.out.println("\nOptimized array is:");
		for (int i=0;i<4;i++){
			for(int j=0;j<dimension;j++){
				System.out.print(ks_opt[i][j]+" ");}
			System.out.println();}
		
		return ks_opt;
	}
}