/* CS312 Assignment 2.
* On my honor, Emiliano Villarreal , this programming assignment is my own work.
*
* This program will print out the UT tower with adjustable sizes 
* 
*
*  Name: Emiliano Villarreal
*  email address: ev8559@gmail.com
*  UTEID: ev8550
*  Section 5 digit ID: 52200
*  Grader name:
*/


public class Tower {
  
	static final int ZISE = 3;
	static final int PILLARS = (ZISE * 2) - 1;
	static final int TOWER_CENTERING_TOP_PART = ZISE * 4 + 2;
	static final int TOWER_CENTERING_BODY = ZISE * 4;
	
	public static void main (String[]args) {
		topAndBottomOfUpperSection();
		upperSectionPillars();
		topAndBottomOfUpperSection();
		bodyOfTower();
		TopStageOfFoundation();
		bottomStageOfFoundation();
	}
	
	/* This method will construct the upper and lower part of the top section of the tower, the method 
 	will also include a loop that centers this section appropriatley*/
	public static void topAndBottomOfUpperSection() {
		for (int space = 1; space <= TOWER_CENTERING_TOP_PART; space++) {
		System.out.print(" ");}
			for (int individualHashtags = 1; individualHashtags <= PILLARS; individualHashtags++) {
				System.out.print("#");
				}
			System.out.println("");
	}
	
	/* This method will construct the pillars (|) that make up the upper section of the tower
	the method also includes a loop that will aproppriatley center the pillars */
	public static void upperSectionPillars() {
		int PILLARS_LENGTH= (ZISE * 2) - 2;
		for (int pillarLength = 1; pillarLength <= PILLARS_LENGTH; pillarLength++) {
			for (int space = 1; space <= TOWER_CENTERING_TOP_PART; space++) {
				System.out.print(" ");}
			for (int individualPillars = 1; individualPillars <= PILLARS; individualPillars++) {
					System.out.print("|");
				}
				System.out.println("");
		}
	}
		
	// This method will construct the roof and floor of each story in the tower	
	public static void floorAndRoof() {
		int ROOF_ZISE = (ZISE * 2) + 3;
		for (int roof = 1; roof <= ROOF_ZISE; roof++) {
		System.out.print("~");
		}
		System.out.println("");
	}
	
	//this method will create the individual stories of the UT Tower consisting of |-O-O-|
	public static void windows() {
		System.out.print("|");
		System.out.print("-");
		 for (int i=1; i<= ZISE; i++){
	    	System.out.print("O-");
		 }
		 System.out.println("|");
    }
	
	/*This method will construct the specific number of stories required, it also runs a loop that centers 
	body of the tower appropriately*/
	public static void bodyOfTower() {
		int TOWER_BODY_ZISE = ZISE * ZISE;
		for (int stories = 1; stories <= TOWER_BODY_ZISE; stories++) {
			for (int space = 1; space <= TOWER_CENTERING_BODY; space++) {
				System.out.print(" ");
			}
			floorAndRoof();
			for (int space = 1; space <= TOWER_CENTERING_BODY; space++) {
				System.out.print(" ");
			}
			windows();
		}
		for (int space = 1; space <= TOWER_CENTERING_BODY; space++) {
			System.out.print(" ");
		}
		floorAndRoof();
		
	}
	
	/*this method will print out the lower section of the foundation of the tower*/	
 	public static void bottomStageOfFoundation() {
 		int SECOND_FOUNDATION_ZISE = (ZISE * 5);
 		for (int BottomOfFoundationLevels = 1; BottomOfFoundationLevels <= ZISE; BottomOfFoundationLevels++) {
 			System.out.print("/");
 			for (int SecondFoundationStructure = 1; SecondFoundationStructure <= SECOND_FOUNDATION_ZISE; SecondFoundationStructure++ ) {
 				System.out.print("\"O");
 			}
 			System.out.println("\"\\");
 		}
 	}
 	
 	//This method will construct the top stage of the foundation of the tower
 	public static void TopStageOfFoundation() {
 		int NUM_LINES_TOP_OF_FOUNDATION = ZISE / 2 + 1;
 		int TOP_OF_FOUNDATION_STRUCTURE_SIZE = ZISE * 5 - (ZISE / 2 * 3 );
 		int TOP_OF_FOUNDATION_CENTERING = ZISE / 2 * 3;
 		for (int TopOfFoundationLevels = 1; TopOfFoundationLevels <= NUM_LINES_TOP_OF_FOUNDATION; TopOfFoundationLevels++) {
 			for (int space = 1; space <= TOP_OF_FOUNDATION_CENTERING; space++) {
 				System.out.print(" ");}
 			TOP_OF_FOUNDATION_CENTERING -= 3;
 				System.out.print("/");
 				for (int TopOfFoundationStructure = 1; TopOfFoundationStructure <= TOP_OF_FOUNDATION_STRUCTURE_SIZE; TopOfFoundationStructure++ ) {
 					System.out.print("\"'");
 				}
 				System.out.println("\"\\");
 			TOP_OF_FOUNDATION_STRUCTURE_SIZE += 3;
 		}	
 		
 	}
}
 




