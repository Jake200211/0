/*
Author: Jacob Almeida
Date: 11-30-2018
*/
import java.util.Scanner;
import java.awt.*;
import javax.swing.tree.*;






class FinalProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Throughout this textbase adventure you will be asked questions.  Type your answer followed immediately by the ENTER key.");
		promptEnterKey();
		
		System.out.println("You wake up in a cool, damp room.");
		promptEnterKey();
		
		System.out.println("The lights are off, but the silhouette of a man is obviously present.  He says, 'The year is 3072.  You, Ryan Pierce, have been chosen... chosen to save the universe.  You must immediately leave our space station and fight with all you have, fight for the fate of our universe.  Come with me'");
		promptEnterKey();
		
		System.out.println("Do you want to willingly go with this man or fight back? (Type go or fight)");
		String potato = input.next();
		
		
		if (potato.equalsIgnoreCase("go")) {
			System.out.println("The man takes you to another room with space and fighting gear that is perfectly tailored to you.  He tells you to get dressed and then go to the mess hall.  The man leaves the room.");
			promptEnterKey();
			System.out.println("Do you want to follow the man's instructions, or find a way of escape? (Type follow or escape)");
		}
		else if (potato.equalsIgnoreCase("fight")) {
			fight();
		}
			String trapezoid = input.next();
			if (trapezoid.equalsIgnoreCase("follow")){
				follow();
			}
			else if (trapezoid.equalsIgnoreCase("escape")) {
				escape();
			}
		}
		
		
	public static void promptEnterKey() {
		System.out.println("Press \"ENTER\" to continue...");
		Scanner peacock = new Scanner(System.in);
		peacock.nextLine();
	}
	
	
	public static void death() {
		System.out.println("You have died.  Thank you for playing and better luck next time!");
		}
		
	
	public static void fight() {
		System.out.println("You rush toward the heavily built man.  As he goes for a jab to what could've been your temple, you slide underneath his legs, pop up instantly, and put him in the sleeper chokehold.  Within a few seconds he is unconscious on the floor.");
		promptEnterKey();
		escape();
	}
	
	
	public static void follow() {
		Scanner cat = new Scanner(System.in);
		System.out.println("You follow the man's instructions, in the mess hall you are fed a gourmet dinner.");
		promptEnterKey();
		System.out.println("For the next few days you are treated with the utmost respect and live like a king.  But one day you wake up in a cold, dark room, or at least what you thought was a room.  You feel light... almost... zero gravity.  You soon realize that you are in a space ship.  Your head is throbbing, the result of what could have only been drugging.  A screen lights up.  On it are the words, 'You, Ryan Pierce, have been chosen... chosen to save the universe.  You must fight for Gregorious the Great, the almighty.  He is the ruler of the universe and has all power.  But an old man named James Mazorow, the evil brother of our beloved professor, Rocky Mazorow, is trying to kill Gregorious the Great.  You must find and destroy Mazorow and bring proof of his death.'  Where would you like to look for James Mazorow first, Samigantu or Elion?");
		String planet = cat.nextLine();
		if (planet.equalsIgnoreCase("Samigantu")) {
			Samigantu();
		}
		else if (planet.equalsIgnoreCase("Elion")) {
			System.out.println("You fly to planet Elion.  When you land you are met by near-human creatures.  They even spoke English.  So you ask them if Mazorow is on the planet.  They all replied with no or that they did not know.  Now the only place left to look in the solar system is Samigantu...");
			Samigantu();
		}
	}
	
	
	public static void Samigantu() {
		Scanner cowDog = new Scanner(System.in);
		System.out.println("You fly to a purplish planet, there is a sign that says 'WELCOME TO SAMIGANTU'.  When you land you are met by a group of odd looking creatures that looked as if they walked straight out of your dreams.  You walk into the nearest building, with the title, 'Little Planet on the Rocks', which ended up being a pub.  You make eye contact with an old man in the back corner of the main room.  Fear shot into his eyes and he immediately ran into a back room.  You try to open the door, but it's locked.  On the screen it says, 'You must take a test to enter.  Get 100% and you may enter, but miss one and you die...");
		promptEnterKey();
		
		String[][] doorQuiz = {
			{"Who is the all powerful ruler of the universe?", "Gregorious the Great"},
			{"Who is his worst enemy?", "James Mazorow"},
			{"What color is the planet Samigantu?", "Purplish"},
			{"What is the name of the bar you are in?", "Little Planet on the Rocks"},
			{"Finish the sentence: Hit or miss", "I guess they never miss huh"}
		};
		
		int doBcorrect = 0;
		
		for (int i = 0; i < doorQuiz.length; i++) {
			System.out.println(doorQuiz[i][0]);
			String moth = cowDog.nextLine();
			if (moth.equalsIgnoreCase(doorQuiz[i][1])) {
				System.out.println("Your answer do B correct!");
				doBcorrect++;
			}else {
				System.out.println("Your answer do B incorrect, the correct answer is " + doorQuiz[i][1]);
				System.out.println("The door makes a loud buzzing sound.  An electrode with electricity crackling off of it strikes you in the chest...");
				death();
			}
		if (doBcorrect == 5) {
		System.out.println("'Congratulations you got 100%, enter the room as you please,' says the screen on the door.  It buzzes, unlocks, and slides open.  You walk in and James is gone, a back door has obviously just been opened.  You run out the door and have the option to go left or right.  Which way would you like to go?");
		}
		String gregIsTheBest = cowDog.nextLine();
		if (gregIsTheBest.equalsIgnoreCase("left")){
			left();
		}
		else if (gregIsTheBest.equalsIgnoreCase("right")){
			System.out.println("You turn right and the path takes you into a maze of sorts.  As you're running a large foot juts out in front of you.  You fall to the ground, above you are Mazorow's henchmen, with their guns trained on you...");
			death();
				}
			}
		}
		
		
	public static void left() {
		Scanner rockyMazorow = new Scanner(System.in);
		System.out.println("You turn left.  The path takes you into a maze of sorts.  You soon begin to see fresh footprints on the ground, so you know Mazorow isn't too far ahead.  Lucky for you, he's old and cannot run very fast.  As you're rounding a corner you catch a glimpse of him.");
		promptEnterKey();
		System.out.println("You have your trusty dagger in hand, prepared in the event that a fight breaks out.  Finally, Mazorow's age gets to him.  He is coughing and wheezing in front of you.");
		promptEnterKey();
		System.out.println("You look around and realize you have entered a wide open space... the perfect place for a fight.  When going into a fight you must make a very crucial decision at the beginning.  Will you fight on the defensive and wait for a chance to strike when possible, or will you go on the offensive and go for the kill?  (Type defensive or offensive)");
		String denverBroncos = rockyMazorow.nextLine();
		if(denverBroncos.equalsIgnoreCase("defensive")){
			System.out.println("You choose to fight this battle defensively.  You hold back and wait for Mazorow to make a move.  When he attacks you, you realize that his skill is far greater than yours.  You are all over the place in an attempt to avoid his needlelike blade.  He continues to rain down attacks on you endlessly.  He has now inflicted cuts on your forearms, shoulder, chest, and abdomen.  You are losing blood and becoming more tired as the fight continues.  Eventually your efforts fail as his blade plunges into your neck... your vision slowly goes dark as your life and blood fade...");
			death();
		}
		else if(denverBroncos.equalsIgnoreCase("offensive")) {
			System.out.println("You choose to fight this battle offensively and go for the kill.  You immediately begin raining attacks on Mazorow.  Although his defensive tactics were great as a result of his age and experience, your speed and agility are superior.  You continue to rain down attacks on him, most of them are ineffective, but you land a few and inflict cuts all over his body.");
			promptEnterKey();
			System.out.println("Mazorow finally collapses from fatigue.  You stare him in the face and say 'For Gregorious the Great,' then plunge your dagger into his heart.  You film the life fading from James Mazorow's death.  This is your proof.");
			ending1();
		}
	}
	
	
	public static void ending1() {
		System.out.println("Congratulations!  You have successfully defeated James Mazorow and completed the first path of this text based adventure.  Play again to complete the second path and to explore all that Ryan Pierce can do!");
	}
	
	
	public static void escape() {
		Scanner chicken = new Scanner(System.in);
		System.out.println("You know you don't have much time to escape, so you immediately head for the door.  Once outside you run down the hallway, you are faced with a fork.  Do you want to go left or right?");
		String kentuckyFriedChicken = chicken.nextLine();
		if(kentuckyFriedChicken.equalsIgnoreCase("left")) {
			System.out.println("You turn left and about 100 yards down the hallway you are met by a motion sensored laser turret, with its sights trained in on you...");
			promptEnterKey();
			death();
		}
		else if(kentuckyFriedChicken.equalsIgnoreCase("right")) {
			promptEnterKey();
			right();
		}
	}
	
	
	public static void right(){
		Scanner dog = new Scanner(System.in);
		System.out.println("You sprint down the right hallway.  About 300 yards down you see a shining green sign that says 'EXIT'!  You get to the door and open it.  There in front of you is a fleet of escape pods.  You jump into the closest one and immediately fly out the open bay door.  No one seems to notice that you're missing.  You look around and there are planets, but none that you recognize.  At this point you realize that you are a long way from earth...");
		promptEnterKey();
		System.out.println("Suddenly the space cruiser you escaped from is headed your way, they've realized that you're gone.  You immediately fly to the closest planet.  There is a sign that says 'WELCOME TO SAMIGANTU'.  You land and are met by odd creatures that you previously thought could only exist in your dreams.  They don't bother you and you walk into the closest building which happened to be a bar.");
		promptEnterKey();
		System.out.println("You ask around for directions back to earth but are directed to an old man in the back corner of the room.  'Hello, my name is James Mazorow.' he said.  'I am the brother of the beloved professor, Rocky Mazorow.  I hear you are trying to find your way back to earth... well I know the way, and if you do what I say then you shall receive the directions.  You must fight Gregorious the Great, the almighty.  He is a curse to the universe and will continue to rule unless something is done about it.'");
		promptEnterKey();
		System.out.println("So will you fight Gregorious the Great? (Type fight or chicken)");
		String monkeyDog = dog.nextLine();
		if (monkeyDog.equalsIgnoreCase("fight")) {
			fightGregorioustheGreat();
		}
		else if (monkeyDog.equalsIgnoreCase("chicken")) {
			System.out.println("You decide to tell the man that you are too chicken to take down the task he has given you.  He tells his guards to grab you.  They take you to another room where there is a guillotine waiting.  They place your head in it and say, 'No cowardly men deserve to live.'  One of them then releases the rope...");
			death();
				}
			}
			
			
	public static void fightGregorioustheGreat(){
		Scanner defeatGregorioustheGreat = new Scanner(System.in);
		System.out.println("You have chosen to fight Gregorious the Great rather than chicken out... great choice.  Mazorow says, 'Fantastic choice, I will gladly add you to my team.  Now we must discuss where to find him.  I assume that Gregorious is either on the planet Elion or Latania.  I will provide you with a spacecraft for transportation... go on, it's just outside.");
		promptEnterKey();
		System.out.println("You walk outside and find an extremely luxurious fighter spacecraft.  Once you get in, the entire inside of the ship lights up and prepares for takeoff.  You zoom off of Samigantu as fast as possible.  Now, where would you like to search for Gregorious the Great first?  (Type Elion or Latania)");
		String fightForMazorow = defeatGregorioustheGreat.nextLine();
		if (fightForMazorow.equalsIgnoreCase("Elion")){
			Elion();
		}
		else if (fightForMazorow.equalsIgnoreCase("Latania")){
			System.out.println("You decide to head to Latania first.  You program the ship's navigation system to take you to Latania, then you drift off to sleep...");
			promptEnterKey();
			System.out.println("You wake up as you are approaching the greenish planet.  You land and are met by odd creatures.  You get off and are met aggressively by them.  They chase you, the whole time their gigantic teeth glaring.  You are fast, but not fast enough, one of them leaps and grabs your foot, tripping you.  Its teeth sink into your neck and you can feel the venom enter your bloodstream.  Within the next few minutes you get weaker and weaker until you finally fade from consciousness.");
			death();
		}
	}
	
	
	public static void Elion(){
		Scanner destroyGregorious = new Scanner(System.in);
		System.out.println("You decide to head to Elion first.  When you arrive you immediately feel an impending sense of doom.  You know for a fact that Gregorious the Great is here, on Elion.");
		promptEnterKey();
		System.out.println("Right as you step out of your spacecraft you can see Gregorious and the shimmering glory that surrounds him, but he isn't alone.  His accomplice, Rocky Mazorow, is standing close by his side.  Although she was almost an entire foot shorter than Gregorious, Rocky's power and poise matched that of her co-worker and friend.  You could not help but shake in their presence.  Now all that's left to do is fight...");
		promptEnterKey();
		System.out.println("You are facing 2 godly beings so this will be the most difficult task that any man has ever faced.  Now comes the most important decision of your life... will you fight on the offensive or defensive position for this battle.");
		String ronaldSwanson = destroyGregorious.nextLine();
		if (ronaldSwanson.equalsIgnoreCase("Offensive")){
			System.out.println("You decide to take the offensive side in this battle purely because defending against the blows of 2 gods is simply impossible.  You slowly walk toward the blinding greatness of the 2 amazing beings with your dagger in hand, but you know you would need more than this... that is why your spacecraft is near.  The suit inside of the spacecraft is equipped with all sorts of technology.");
			promptEnterKey();
			System.out.println("A missile is the first thing you could thing of.  You fire endless missiles at the dyad.  When the dust settles, they both stand there, unscathed.  They continued to shine in all of their glory as they simultaneously scoffed at your puny attemt.  Your next move is to try blades.  You shoot blades our of your arms and run toward Gregorious the Great and Rocky Mazorow.  They begin to run toward you also.  Because Greg is so tall, you slide under his legs and take him from behind.  While Greg is down you rush toward Rocky and take her down as well.  Greg is just beginning to get up when you think of the only way to take the two of them down for good... take away their source of power.  Because Gregorious and Rocky are the god and godess of Computer Programming, that must mean that they have internal computers to give them their almighty power to control everything.  So the most simple solution was... to pour liquid on them.  You take a bucket of emergency water from your spacecraft and pour it on the downed god and godess.  They fizzle and turn back into humans.  Their evilness is gone and they are returned to their human forms of professors that we love so much.");
			ending2();
		}
		else if (ronaldSwanson.equalsIgnoreCase("Defensive")){
			System.out.println("You decide to take the defensive side in this battle.  Both Gregorious and Rocky run toward you, but they stop in the middle.  Of course, you are on the defensive so you wait for them to attack you.  The two purely amazing beings stand in place, completely still for 30 seconds.  Gregorious announces in his most manly and amazing voice, 'The defensive was a terrible choice for you.  While we stood here in silence, what you didn't realize was that we were writing a program to wipe you from existence.'  You begin to feel weak and fall to the ground.  Your last words creep out of your mouth.  You say, 'Gregorious... I don't feel so good.'  You then begin to fade from existence...");
			death();
			}
		}
	public static void ending2(){
		System.out.println("CONGRATULATIONS!  You have successfully defeated GREGORIOUS THE GREAT and ROCKY MAZOROW and turned them back to their human forms that we love so much.  You have completed the second path of this text based adventure.  Come back and play again to complete the first path!");
		}
	}
		
		
	/* Correct path #1:
	Go
	Follow
	Samigantu
	Quiz: Gregorious the Great, James Mazorow, Purplish, Little Planet on the Rocks, I guess they never miss huh.
	Left
	Offensive
	
		Correct path #2:
	Go/Fight
	Escape
	Right
	Fight
	Elion
	Offensive
	*/