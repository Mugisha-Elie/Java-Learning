class GuessGame{
	Player p1;
	Player p2;
	Player p3;

	int number;

	void startGame(){
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int p1Guess = 0;
		int p2Guess = 0;
		int p3Guess = 0;

		boolean p1IsRight = false;
		boolean p2IsRight = false;
		boolean p3IsRight = false;

		number = (int) (Math.random() * 10);
		System.out.println("Game Started");
		System.out.println("I am thinking of a number between 0 and 9..."); 

		
		while(true){
			p1.guess();
			p2.guess();
			p3.guess();

			p1Guess = p1.number;
			System.out.println("Player 1 guessed " + p1Guess);

			p2Guess = p2.number;
			System.out.println("Player 2 guessed " + p2Guess);

			p3Guess = p3.number;
			System.out.println("Player 3 guessed " + p3Guess);

			if(p1Guess == number){
				p1IsRight = true;
				System.out.println("We have a winner");
				System.out.println("Player 1 got it right " +p1Guess);
			}

			if(p2Guess == number){
				p2IsRight = true;
				System.out.println("We have a winner");
				System.out.println("Player 2 got it right " +p2Guess);
			}

			if(p3Guess == number){
				p3IsRight = true;
				System.out.println("We have a winner");
				System.out.println("Player 3 got it right " +p3Guess);
			}

			if(p1IsRight || p2IsRight || p3IsRight){
				break;
			}
		
		}
	}
}