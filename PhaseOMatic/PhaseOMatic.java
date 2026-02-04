public class PhaseOMatic{
	public static void main(String[] args){

		String[] wordListOne = {"24/7","multiTiar","30,OOO foot","B-to-B","win-win","frontend", "web-based","pervasive", "smart","sigma","critical-path" , "dynamic"};

		String[] wordListTwo = {"empowered", "sticky","value-added.", "oriented", "centric", "distributed","clustered", "branded","outaide-the-box", "positioned","networked", "focused" , "leveraged", "aligned","targeted", "shared", "cooperative", "accelerated"};

		String[] wordListThree = {"process", "tippingpoint", "solution", "architecture", "core competency","strategy", "mindshare", "portal", "apace", "vision","paradigm", "session"};

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		int randOne = (int) (Math.random() * oneLength);
		int randTwo = (int) (Math.random() * twoLength);
		int randThree = (int) (Math.random() * threeLength); 

		String phase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];
		
		System.out.println(phase);
	}
}