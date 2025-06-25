import java.util.Scanner;
public class Final_project {
//main method
    public static void main(String[] args) {
        mainMenu();

    }//mainMenu method
    public static void mainMenu(){


        Scanner input = new Scanner(System.in);

        System.out.println("+==============================================+");
        System.out.println("|                PET CHOOSE HELPER             |");
        System.out.println("+==============================================+");
        System.out.println("|                     PRESS                    |");
        System.out.println("|                     1)To Start               |");
        System.out.println("|                     2)To Exit                |");
        System.out.println("|                     and ENTER                |");
        System.out.println("+==============================================+");
        System.out.print(":");
        int x = input.nextInt();
        if(x == 1)
            petChooseHelperMenu();
        else if(x == 2){
            System.out.println("Thanks for using the Pet Chooser!");
            System.exit(0);
        }
        else{
            System.out.println("invalid input");
            mainMenu();
        }

    }

    public static void petChooseHelperMenu(){

        Scanner input = new Scanner(System.in);

        System.out.println("+==============================================+");
        System.out.println("|                PET CHOOSE HELPER             |");
        System.out.println("+==============================================+");
        System.out.println("|                                              |");
        System.out.println("|        Welcome to the Pet Choose Helper!     |");
        System.out.println("|      Let's find the perfect pet for you.     |");
        System.out.println("+==============================================+");
        System.out.println("\t 1) Choose a pet based on your preferences.");
        System.out.println("\t 2) We help you find your best fit.");
        System.out.print("\n[Enter 1 or 2]:");
        int choice = input.nextInt();

        if (choice == 1)
            basedOnPreference();
        else if (choice == 2)
            basedOnLifestyle();
        else{
            System.out.println("Invalid input");
        }

    }


    public static void basedOnPreference() {

        Scanner input = new Scanner(System.in);
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║              BASED ON PREFERENCE              ║");
        System.out.println("╚═══════════════════════════════════════════════╝");

        int petChoice;

        do {
            System.out.println("What pet would you like to choose?");
            System.out.println("\t1) Dog");
            System.out.println("\t2) Cat");
            System.out.println("\t3) Bird");
            System.out.println("\t4) Fish");
            System.out.println("\t5) Rabbit");
            System.out.println("\t6) Other");
            System.out.println("\t7)go back");
            System.out.print("Enter choice (1-6): ");
            petChoice = input.nextInt();

            if (petChoice == 1) {
                dogChoice();
            }
            else if (petChoice == 2) {
               catChoice();
            }
            else if (petChoice == 3) {
                birdChoice();
            }
            else if (petChoice == 4) {
               fishChoice();
            }
            else if (petChoice == 5) {
                rabbitChoice();
            }
            else if(petChoice == 7)
                petChooseHelperMenu();
            else {

                System.out.println("\nSorry we do not have other pet in storage for the moment.");
                System.out.println("___________________________________________________________");
            }
        } while (petChoice == 7);

    }


    public static void dogChoice(){

        Scanner input = new Scanner(System.in);

        String pet = "dog";

        String[][][][][] dog = new String[3][2][3][3][3];

        String[] sizes = {"Small", "Medium", "Large"};
        String[] genders = {"Male", "Female"};
        String[] ages = {"Puppy/Kitten", "Adult", "Senior"};
        String[] temperaments = {"Calm", "Playful", "Protective"};
        String[] breeds = {"Bulldog", "German shepherd", "Golden retriever"};
        String[] dogNames = {
                "Buddy", "Charlie", "Max", "Bella", "Lucy", "Daisy", "Bailey", "Molly", "Coco", "Lola",
                "Rocky", "Sadie", "Toby", "Maggie", "Jake", "Sophie", "Jack", "Chloe", "Oliver", "Zoe",
                "Duke", "Lily", "Bear", "Roxy", "Tucker", "Gracie", "Murphy", "Abby", "Buster", "Ginger",
                "Harley", "Sasha", "Zeus", "Mia", "Bentley", "Penny", "Teddy", "Ruby", "Riley", "Nala",
                "Jax", "Luna", "Scout", "Emma", "Oscar", "Ellie", "Sam", "Maya", "Gus", "Izzy",
                "Henry", "Sandy", "Bandit", "Princess", "Thor", "Athena", "Apollo", "Pepper", "Benny", "Annie",
                "Hunter", "Belle", "Shadow", "Maddie", "Marley", "Dixie", "Boomer", "Sally", "Ace", "Willow",
                "Blue", "Cookie", "Diesel", "Harper", "Rocco", "Suki", "Copper", "Hazel", "Ranger", "Angel",
                "Winston", "Cali", "Gunner", "Minnie", "Otis", "Stella", "Boomer", "Nikki", "Chester", "Piper",
                "Roscoe", "Gracie", "Ziggy", "Honey", "Bruno", "Lexi", "Rudy", "Belle", "Finn", "Misty",
                "Louie", "Sugar", "Chance", "Peanut", "Cash", "Cleo", "Moose", "Sierra", "Jake", "Lacey",
                "Sparky", "Fiona", "Rusty", "Maya", "Baxter", "Angel", "Boomer", "Sadie", "Simba", "Izzy",
                "Jasper", "Coco", "King", "Tasha", "Brady", "Zelda", "Joey", "Maggie", "Romeo", "Ella",
                "Rex", "Lady", "Scout", "Sandy", "Tank", "Penny", "Louie", "Lola", "Zeke", "Mia",
                "Thor", "Harley", "Ranger", "Molly", "King", "Sasha", "Boomer", "Ruby", "Toby", "Lucy",
                "Max", "Chloe", "Bear", "Bella", "Rocky", "Daisy", "Zeus", "Lily", "Jack", "Sadie",
                "Hunter", "Piper"};

        System.out.println("Please choose the best options that fit your preferences.");

        // Size
        System.out.println("1. What size of pet are you looking for?");
        System.out.println("\t1) Small");
        System.out.println("\t2) Medium");
        System.out.println("\t3) Large");
        System.out.print("Enter choice (1-3): ");
        int sizeChoice = input.nextInt();
        String size = "";
        if (sizeChoice == 1) {
            size = sizes[0];
        } else if (sizeChoice == 2) {
            size = sizes[1];
        } else {
            size = sizes[2];
        }

        // Gender
        System.out.println("\n2. What gender do you prefer?");
        System.out.println("\t1) Male");
        System.out.println("\t2) Female");

        System.out.print("Enter choice (1-2): ");
        int genderChoice = input.nextInt();
        String gender = "";
        if (genderChoice == 1) {
            gender = genders[0];
        } else {
            gender = genders[1];
        }

        // Age
        System.out.println("\n3. What age range do you prefer?");
        System.out.println("\t1) Puppy/Kitten");
        System.out.println("\t2) Adult");
        System.out.println("\t3) Senior");
        System.out.print("Enter choice (1-3): ");
        int ageChoice = input.nextInt();
        String age = "";
        if (ageChoice == 1) {
            age = ages[0];
        } else if (ageChoice == 2) {
            age = ages[1];
        } else {
            age = ages[2];
        }

        // Temperament
        System.out.println("\n4. What kind of temperament are you looking for?");
        System.out.println("\t1) Calm");
        System.out.println("\t2) Playful");
        System.out.println("\t3) Protective");
        System.out.print("Enter choice (1-3): ");
        int tempChoice = input.nextInt();
        String temperament = "";
        if (tempChoice == 1) {
            temperament = temperaments[0];
        } else if (tempChoice == 2) {
            temperament = temperaments[1];
        } else {
            temperament = temperaments[2];
        }

        // Breed
        System.out.println("\n5. What breed do you prefer?");
        System.out.println("\t1) Bulldog");
        System.out.println("\t2) German shepherd");
        System.out.println("\t3) Golden retriever");
        System.out.print("Enter choice (1-3): ");
        int breedChoice = input.nextInt();
        String breed = "";
        if (breedChoice == 1) {
            breed = breeds[0];
        } else if (breedChoice == 2) {
            breed = breeds[1];
        } else {
            breed = breeds[2];
        }

        // Summary
        System.out.println("\nThank you! Here's a summary of your preferences:");
        System.out.println("Pet: " + pet);
        System.out.println("Size: " + size);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Temperament: " + temperament);
        System.out.println("Breed: " + breed);

        int count = 0;


        for (int i = 0; i < sizeChoice; i++) {
            for (int j = 0; j < genderChoice; j++) {
                for (int k = 0; k < ageChoice; k++) {
                    for (int l = 0; l < tempChoice; l++) {
                        for (int m = 0; m < breedChoice; m++) {

                            dog[i][j][k][l][m] = dogNames[count];
                            count++;
                        }
                    }
                }
            }

        }
        // final result
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Based on your preference, we have matched you with a pet named " +
                dog[sizeChoice - 1][genderChoice - 1][ageChoice - 1][tempChoice - 1][breedChoice - 1]);
        System.out.println("----------------------------------------------------------------------------");

        mainMenu();
        
    }
    public static void catChoice(){
        Scanner input = new Scanner(System.in);

        String pet = "cat";

        String[][][][][] cat = new String[3][2][3][3][3];

        String[] sizes = {"Small", "Medium", "Large"};
        String[] genders = {"Male", "Female"};
        String[] ages = {"Puppy/Kitten", "Adult", "Senior"};
        String[] breeds = {"Domestic Shorthair","Main coon","Ragdoll"};
        String[] temperaments = {"Calm", "Playful", "Protective"};
        String[] catNames = {
                "Whiskers", "Mittens", "Shadow", "Luna", "Oreo", "Simba", "Milo", "Cleo", "Smokey", "Chloe",
                "Leo", "Nala", "Tigger", "Zoe", "Bella", "Oliver", "Socks", "Ginger", "Toby", "Pepper",
                "Tiger", "Lily", "Boots", "Midnight", "Misty", "Kitty", "Pumpkin", "Mocha", "Sassy", "Mochi",
                "Garfield", "Tom", "Felix", "Tuna", "Snowball", "Ash", "Cuddles", "Salem", "Jasper", "Buttons",
                "Fuzzy", "Cinnamon", "Mimi", "Dusty", "Lucky", "Maple", "Stormy", "Binx", "Cupcake", "Jinx",
                "Bandit", "Casper", "Yuki", "Marshmallow"};

        System.out.println("Please choose the best options that fit your preferences.");

        // Size
        System.out.println("1. What size of pet are you looking for?");
        System.out.println("\t1) Small");
        System.out.println("\t2) Medium");
        System.out.println("\t3) Large");
        System.out.print("Enter choice (1-3): ");
        int sizeChoice = input.nextInt();
        String size = "";
        if (sizeChoice == 1) {
            size = sizes[0];
        } else if (sizeChoice == 2) {
            size = sizes[1];
        } else {
            size = sizes[2];
        }

        // Gender
        System.out.println("\n2. What gender do you prefer?");
        System.out.println("\t1) Male");
        System.out.println("\t2) Female");

        System.out.print("Enter choice (1-2): ");
        int genderChoice = input.nextInt();
        String gender = "";
        if (genderChoice == 1) {
            gender = genders[0];
        } else {
            gender = genders[1];
        }

        // Age
        System.out.println("\n3. What age range do you prefer?");
        System.out.println("\t1) Puppy/Kitten");
        System.out.println("\t2) Adult");
        System.out.println("\t3) Senior");
        System.out.print("Enter choice (1-3): ");
        int ageChoice = input.nextInt();
        String age = "";
        if (ageChoice == 1) {
            age = ages[0];
        } else if (ageChoice == 2) {
            age = ages[1];
        } else {
            age = ages[2];
        }

        // Breed
        System.out.println("\n4. What breed do you prefer?");
        System.out.println("\t1) Domestic shorthair");
        System.out.println("\t2) Main coon");
        System.out.println("\t3) Ragdoll");
        System.out.print("Enter choice (1-3): ");
        int breedChoice = input.nextInt();
        String breed = "";
        if (breedChoice == 1) {
            breed = breeds[0];
        } else if (breedChoice == 2) {
            breed = breeds[1];
        } else {
            breed = breeds[2];
        }

        // Temperament
        System.out.println("\n5. What kind of temperament are you looking for?");
        System.out.println("\t1) Calm");
        System.out.println("\t2) Playful");
        System.out.println("\t3) Protective");
        System.out.print("Enter choice (1-3): ");
        int tempChoice = input.nextInt();
        String temperament = "";
        if (tempChoice == 1) {
            temperament = temperaments[0];
        } else if (tempChoice == 2) {
            temperament = temperaments[1];
        } else {
            temperament = temperaments[2];
        }

        // Summary
        System.out.println("\nThank you! Here's a summary of your preferences:");
        System.out.println("Pet: " + pet);
        System.out.println("Size: " + size);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Temperament: " + temperament);

        int count = 0;

        for (int i = 0; i < sizeChoice; i++) {
            for (int j = 0; j < genderChoice; j++) {
                for (int k = 0; k < ageChoice; k++) {
                    for (int l = 0; l < breedChoice; l++) {
                        for(int m = 0; m < tempChoice ; m++){

                            cat[i][j][k][l][m] = catNames[count];
                            count++;
                        }
                    }
                }
            }
        }
        // final result
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Based on your preference, we have matched you with a pet named " +
                cat[sizeChoice - 1][genderChoice - 1][ageChoice - 1][breedChoice-1][tempChoice - 1]);
        System.out.println("----------------------------------------------------------------------------");
        mainMenu();

    }
    public static void birdChoice(){
        Scanner input = new Scanner(System.in);

        String pet = "Bird";
        String[][][][] bird = new String[3][3][3][2];

        String[] sizes = {"Small", "Medium", "Large"};
        String[] ages = {"young", "Adult", "Senior"};
        String[] breeds = {"parakeet","cockatiel","finch"};
        String[] temperaments = {"Calm", "Playful"};
        String[] birdNames = {"Kiwi", "Sunny", "Sky", "Peaches", "Blue", "Buddy", "Coco", "Angel", "Rio",
                "Chirpy", "Feathers", "Mango", "Jade", "Pico", "Tiki", "Zazu", "Bubbles",
                "Pepper", "Lemon", "Mocha", "Twinkle", "Echo", "Lola", "Charlie", "Benny",
                "Daisy", "Rico", "Poppy", "Nibbles", "Milo", "Kiki", "Snowy", "Shadow", "Sunny",
                "Pumpkin", "Pip", "Rosie", "Indigo", "Beaky", "Tango", "Cinnamon", "Pearl",
                "Basil", "Chico", "Saffron", "Storm", "Jazz", "Lucky", "Robin", "Coral",
                "Tofu", "Dusty", "Nimbus", "Peanut"};

        System.out.println("\nPlease choose the best options that fit your preferences.");

        // Size
        System.out.println("1. What size of pet are you looking for?");
        System.out.println("\t1) Small");
        System.out.println("\t2) Medium");
        System.out.println("\t3) Large");
        System.out.print("Enter choice (1-3): ");
        int sizeChoice = input.nextInt();
        String size = "";
        if (sizeChoice == 1) {
            size = sizes[0];
        } else if (sizeChoice == 2) {
            size = sizes[1];
        } else {
            size = sizes[2];
        }

        // Age
        System.out.println("\n2. What age range do you prefer?");
        System.out.println("\t1) young");
        System.out.println("\t2) Adult");
        System.out.println("\t3) Senior");
        System.out.print("Enter choice (1-3): ");
        int ageChoice = input.nextInt();
        String age = "";
        if (ageChoice == 1) {
            age = ages[0];
        } else if (ageChoice == 2) {
            age = ages[1];
        } else {
            age = ages[2];
        }

        // Breed
        System.out.println("\n3. What breed do you prefer?");
        System.out.println("\t1) Parakeet");
        System.out.println("\t2) Cockatiel");
        System.out.println("\t3) Finch");
        System.out.print("Enter choice (1-3): ");
        int breedChoice = input.nextInt();
        String breed = "";
        if (breedChoice == 1) {
            breed = breeds[0];
        } else if (breedChoice == 2) {
            breed = breeds[1];
        } else {
            breed = breeds[2];
        }

        // Temperament
        System.out.println("\n4. What kind of temperament are you looking for?");
        System.out.println("\t1) Calm");
        System.out.println("\t2) Playful");
        System.out.print("Enter choice (1-2): ");
        int tempChoice = input.nextInt();
        String temperament = "";
        if (tempChoice == 1) {
            temperament = temperaments[0];
        } else if (tempChoice == 2) {
            temperament = temperaments[1];
        }

        // Summary
        System.out.println("\nThank you! Here's a summary of your preferences:");
        System.out.println("Pet: " + pet);
        System.out.println("Size: " + size);
        System.out.println("Age: " + age);
        System.out.println("Temperament: " + temperament);

        int count = 0;
        for (int i = 0; i < sizeChoice; i++) {
            for (int j = 0; j < ageChoice; j++) {
                for (int k = 0; k < breedChoice; k++) {
                    for (int l = 0; l < tempChoice; l++) {
                            bird[i][j][k][l] = birdNames[count];
                            count++;
                    }
                }
            }
        }
        // final result
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Based on your preference, we have matched you with a pet named " +
                bird[sizeChoice - 1][ageChoice - 1][breedChoice - 1][tempChoice - 1]);
        System.out.println("----------------------------------------------------------------------------");
        mainMenu();

    }
    public static void fishChoice() {
        Scanner input = new Scanner(System.in);

        String pet = "Fish";

        String[][] fish = new String[3][3];

        String[] sizes = {"Small", "Medium", "Large"};
        String[] breeds = {"Goldfish", "Betta", "Angelfish"};
        String[] fishNames = {"Betta", "Goldfish", "Guppy", "Molly", "Neon Tetra",
                "Platy", "Angelfish", "Zebra Danio", "Corydoras"};

        System.out.println("Please choose the best options that fit your preferences.");

        // Size
        System.out.println("1. What size of pet are you looking for?");
        System.out.println("\t1) Small");
        System.out.println("\t2) Medium");
        System.out.println("\t3) Large");
        System.out.print("Enter choice (1-3): ");
        int sizeChoice = input.nextInt();
        String size = "";
        if (sizeChoice == 1) {
            size = sizes[0];
        } else if (sizeChoice == 2) {
            size = sizes[1];
        } else {
            size = sizes[2];
        }

        // Breed
        System.out.println("\n2. What breed do you prefer?");
        System.out.println("\t1) Goldfish");
        System.out.println("\t2) Betta");
        System.out.println("\t3) Angelfish");
        System.out.print("Enter choice (1-3): ");
        int breedChoice = input.nextInt();
        String breed = "";
        if (breedChoice == 1) {
            breed = breeds[0];
        } else if (breedChoice == 2) {
            breed = breeds[1];
        } else {
            breed = breeds[2];
        }

        // Summary
        System.out.println("\nThank you! Here's a summary of your preferences:");
        System.out.println("Pet: " + pet);
        System.out.println("Size: " + size);
        System.out.println("Breed: " + breed);

        int count = 0;

        for (int i = 0; i < sizeChoice; i++) {
            for (int m = 0; m < breedChoice; m++) {

                fish[i][m] = fishNames[count];
                count++;
            }
        }
        // final result
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(" Based on your preference, we have matched you with a pet named " +
                fish[sizeChoice - 1][breedChoice - 1]);
        System.out.println("----------------------------------------------------------------------------");
        mainMenu();

    }
    public static void rabbitChoice(){
        Scanner input = new Scanner(System.in);

        String pet = "Rabbit";

        String[][][] rabbit = new String[3][2][3];

        String[] sizes = {"Small", "Medium", "Large"};
        String[] genders = {"Male", "Female"};
        String[] ages = {"juvenile", "Adult", "Senior"};
        String[] rabbitNames = {"Thumper", "Snowball", "Cocoa", "Flopsy", "BunBun", "Hazel", "Nibbles", "Oreo",
                "Luna", "Marshmallow", "Clover", "Pepper", "Willow", "Binky", "Mochi", "Toffee", "Velvet",
                "Maple"};

        System.out.println("Please choose the best options that fit your preferences.");

        // Size
        System.out.println("1. What size of pet are you looking for?");
        System.out.println("\t1) Small");
        System.out.println("\t2) Medium");
        System.out.println("\t3) Large");
        System.out.print("Enter choice (1-3): ");
        int sizeChoice = input.nextInt();
        String size = "";
        if (sizeChoice == 1) {
            size = sizes[0];
        } else if (sizeChoice == 2) {
            size = sizes[1];
        } else {
            size = sizes[2];
        }

        // Gender
        System.out.println("\n2. What gender do you prefer?");
        System.out.println("\t1) Male");
        System.out.println("\t2) Female");

        System.out.print("Enter choice (1-2): ");
        int genderChoice = input.nextInt();
        String gender = "";
        if (genderChoice == 1) {
            gender = genders[0];
        } else {
            gender = genders[1];
        }

        // Age
        System.out.println("\n3. What age range do you prefer?");
        System.out.println("\t1) juvenile");
        System.out.println("\t2) Adult");
        System.out.println("\t3) Senior");
        System.out.print("Enter choice (1-3): ");
        int ageChoice = input.nextInt();
        String age = "";
        if (ageChoice == 1) {
            age = ages[0];
        } else if (ageChoice == 2) {
            age = ages[1];
        } else {
            age = ages[2];
        }

        // Summary
        System.out.println("\nThank you! Here's a summary of your preferences:");
        System.out.println("Pet: " + pet);
        System.out.println("Size: " + size);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);


        int count = 0;
        //for loop to find the pet name
        for (int i = 0; i < sizeChoice; i++) {
            for (int j = 0; j < genderChoice; j++) {
                for (int k = 0; k < ageChoice; k++) {
                            rabbit[i][j][k] = rabbitNames[count];
                            count++;
                }
            }
        }
        // final result
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Based on your preference, we have matched you with a pet named " +
                rabbit[sizeChoice - 1][genderChoice - 1][ageChoice - 1]);
        System.out.println("----------------------------------------------------------------------------");
        mainMenu();
    }
        public static void basedOnLifestyle () {
            Scanner input = new Scanner(System.in);

            System.out.println();
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Please answer a few questions so we can match you with your ideal pet.");

            System.out.println("\n1. What type of home do you live in?");
            System.out.println("   1) Apartment");
            System.out.println("   2) House with yard");
            System.out.println("   3) Farm or rural area");
            System.out.print("[Enter 1-3]:");
            int q1 = input.nextInt();

            System.out.println("2. How much time can you spend with a pet each day?");
            System.out.println("   1) Less than 1 hour");
            System.out.println("   2) 1-3 hours");
            System.out.println("   3) More than 3 hours");
            System.out.print("[Enter 1-3]:");
            int q2 = input.nextInt();

            System.out.println("3. Are you looking for a pet that is:");
            System.out.println("   1) Low maintenance");
            System.out.println("   2) Moderate care");
            System.out.println("   3) High energy and interactive");
            System.out.print("[Enter 1-3]:");
            int q3 = input.nextInt();

            System.out.println("4. Do you have any allergies to fur or dander?");
            System.out.println("   1) Yes");
            System.out.println("   2) No");
            System.out.print("[Enter 1-2]:");
            int q4 = input.nextInt();

            System.out.println("5. How would you describe your current financial situation?");
            System.out.println("   1) I'm struggling financially");
            System.out.println("   2) I can manage my expenses");
            System.out.println("   3) I'm financially comfortable");
            System.out.println("   4) I have a lot of disposable income");
            System.out.print("[Enter 1-4]:");
            int q5 = input.nextInt();

            System.out.println("6. How long are you away from home each day?");
            System.out.println("   1) Rarely away");
            System.out.println("   2) 4-6 hours");
            System.out.println("   3) More than 8 hours");
            System.out.print("[Enter 1-3]:");
            int q6 = input.nextInt();

            String petMatch;

            // if statements to match the user choice with the right pet
            if ((q1 == 2 || q1 == 3) && (q2 == 2 || q2 == 3) && (q3 == 2 || q3 == 3) && q4 == 2 &&
                            (q5 == 2 || q5 == 3 || q5 == 4) && (q6 == 1 || q6 == 2)) {
                petMatch = "Dog";
            }
            else if ((q1 == 1 || q1 == 2) && q2 == 2 && (q3 == 1 || q3 == 2) && q4 == 2 &&
                            (q5 == 2 || q5 == 3 || q5 == 4) && (q6 == 1 || q6 == 2)) {
                petMatch = "Cat";
            }
            else if ((q1 == 1 || q1 == 2) && (q2 == 1 || q2 == 2) && (q3 == 1 || q3 == 2) &&
                            (q4 == 1 || q4 == 2) && (q5 == 1 || q5 == 2 || q5 == 3) && q6 == 2) {
                petMatch = "Bird";
            }
            else if (q2 == 1 && q3 == 1 && q4 == 1 && (q5 == 1 || q5 == 2 || q5 == 3 || q5 == 4) &&
                            (q6 == 2 || q6 == 3)) {
                petMatch = "Fish";
            }
            else if ((q1 == 2 || q1 == 3) && q2 == 2 && (q3 == 1 || q3 == 2) && q4 == 2 &&
                            (q5 == 2 || q5 == 3 || q5 == 4) && q6 == 1) {
                petMatch = "Rabbit";
            }
            else {
                petMatch = "We couldn’t determine a perfect match, but we recommend starting with a fish or bird!";
            }

            if(petMatch.equalsIgnoreCase("We couldn’t determine a perfect match, but we recommend starting with a fish or bird!")){
                System.out.println("We couldn’t determine a perfect match, but we recommend starting with a fish or bird!");
            }
            else{
                System.out.println("_______________________________________________________________________________");
                System.out.println(" Based on your lifestyle, a " + petMatch + " pet is the right choice for you.");
                System.out.println("_______________________________________________________________________________");
            }



            //Redirecting to the others methods
            if(petMatch.equals("Dog"))
                dogChoice();
            else if(petMatch.equals("Cat"))
                catChoice();
            else if(petMatch.equals("Bird"))
                birdChoice();
            else if(petMatch.equals("Fish"))
                fishChoice();
            else if(petMatch.equals("Rabbit"))
                rabbitChoice();
            else
                mainMenu();
        }
    }
