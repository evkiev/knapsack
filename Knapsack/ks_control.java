public class ks_control {

public void ks_control(float [][] array_sol, int dimension){
	float k=0;
	System.out.println("Control procedure: ");
	
	if (dimension<200){
	System.out.println("Solutions array: ");
	for (int i=0;i<dimension;i++){
		for(int j=0;j<dimension+1;j++){
		System.out.print((int)array_sol[i][j]+" ");
		k=j/40; if (k==(float)j/40 && j!=0){System.out.println();}}
	System.out.println();}
	} else {System.out.println("dimension is too large. Control procedure has being interrupted");}
	
}
}