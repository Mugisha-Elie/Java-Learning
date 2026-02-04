public class DogTest{
	public static void main(String[] args){
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();

		dog1.size = 20;
		dog2.size = 7;
		dog3.size = 70;

		dog1.Bark();
		dog2.Bark();
		dog3.Bark();
	}
}