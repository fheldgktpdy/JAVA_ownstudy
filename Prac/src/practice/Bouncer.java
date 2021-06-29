package practice;

public class Bouncer {
	public void barkAnimal(Animal animal){
		if(animal instanceof Tiger){
			System.out.println("����");
		}else if(animal instanceof Lion){
			System.out.println("��������");
		}
	}
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
        Bouncer bouncer= new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
	}

}
