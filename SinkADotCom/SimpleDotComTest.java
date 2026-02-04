public class SimpleDotComTest{
	public static void main(String[] args){
		SimpleDotCom dotCom = new SimpleDotCom();

		int[] locations = {2,3,4};

		dotCom.setLocationCells(locations);
		
		String userGuess = "2";
	
		String result = dotCom.checkYourself(userGuess);

		String testResult = "failed";

		if(result.equals("hit")){
			testResult = "passed";
		}

		System.out.println(testResult);
	}
}