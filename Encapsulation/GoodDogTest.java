public class GoodDogTest{
	public static void main(String[] args){
		GoodDog dog1 = new GoodDog();
		GoodDog dog2 = new GoodDog();
		GoodDog dog3 = new GoodDog();

		dog1.setSize(20);
		dog2.setSize(7);
		dog3.setSize(70);

		dog1.Bark();
		dog2.Bark();
		dog3.Bark();
	}
}