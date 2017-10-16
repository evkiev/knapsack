import java.util.Scanner;

public class ks_filling {

	public int[] ks_input () {
		final int[] ks_in = new int[4];
		ks_in[0] = 20;ks_in[1] = 100; ks_in[2]=20; ks_in[3]=200;
		String error;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input items number Int (20 by default):");
		if (sc.hasNextInt()){
			ks_in[0]=sc.nextInt();}
		else{error = sc.nextLine();
		System.out.print("your choice -"+error+" is incorrect. value =20\n");}
		
		System.out.println("Input max price & weigth Int (100*20 by default):");
		if (sc.hasNextInt()){
			ks_in[1]=sc.nextInt();}
		else{error = sc.nextLine();
		System.out.print("your choice -"+error+" is incorrect. value =100\n");}
		if (sc.hasNextInt()){
			ks_in[2]=sc.nextInt();}
		else{error = sc.nextLine();
		System.out.println("your choice -"+error+" is incorrect. value =20\n");}
		
		System.out.println("Input max knapsack weight Int (200 by default):");
		if (sc.hasNextInt()){
			ks_in[3]=sc.nextInt();}
		else{error = sc.nextLine();
		System.out.println("your choice -"+error+" is incorrect. value =200\n");}
		System.out.println("your choice (items number, max price, max weight, knapsack capacity) are:");
		for (int i=0;i<4;i++){
			System.out.print(ks_in[i]+"; ");}
		sc.close();
		System.out.println("\n");	
		return ks_in;
	}

}