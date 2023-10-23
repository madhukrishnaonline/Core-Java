package test;

import mk.Regions;
import java.util.*;

public class ImgRegions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Regions rg = new Regions();
		System.out.println("Enter Region_name:");
		rg.region_name = sc.nextLine();
		System.out.println("Enter Region_id:");
		rg.region_id = sc.nextInt();
		rg.setRegions(rg.region_name, rg.region_id);
		rg.getRegions();
		sc.close();
	}//main
}//class