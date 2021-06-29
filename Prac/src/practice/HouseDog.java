package practice;


public class HouseDog extends Dog {
	public HouseDog(String name) {
		this.setName(name);
	}
	public HouseDog(int type){
		if(type==1){
			this.setName("jindo");
		}else if(type==2){
			this.setName("jobjong");
		}
	}
	
	public void sleep(){
		System.out.println(this.name+" zzz in house");
	}
	
	public void sleep(int hour){
		System.out.println(this.name+" zzz in house for " + hour + " hours");
	}
	
	public static void main(String[] args) {
		HouseDog happy = new HouseDog("happy");
		HouseDog houseDog = new HouseDog(2);
		System.out.println(happy.name);
		System.out.println(houseDog.name);
	}

}
