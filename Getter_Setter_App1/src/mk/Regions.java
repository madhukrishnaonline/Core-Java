package mk;

public class Regions {
	public String region_name;
	public int region_id;

	public void setRegions(String region_name, int region_id) {
		this.region_name = region_name;
		this.region_id = region_id;
	}

	public void getRegions() {
		System.out.println("===Regions===");
		System.out.println("Region_name:" + region_name);
		System.out.println("Region_id:" + region_id);
	}
}//class