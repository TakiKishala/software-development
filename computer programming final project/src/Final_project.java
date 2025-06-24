import java.util.Scanner;


public class Final_project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" =========================================");
        System.out.println("|             PET CHOOSE HELPER          |");
        System.out.println(" =========================================");
        System.out.println();
        System.out.println("Welcome to the Pet Choose Helper!");
        System.out.println("Let's find the perfect pet for you.");
        System.out.println("\t 1) if you like to choose a pet based on your preferences ");
        System.out.println("\t 2) if you would like us to help you find the best fit for you");
        System.out.print("[Enter 1 or 2]: ");
        int choice = input.nextInt();

        if (choice == 1)
            basedOnPreference();
        else if (choice == 2)
            basedOnLifestyle();
        else
            System.out.println("Invalid input");

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
            System.out.print("Enter choice (1-6): ");
            petChoice = input.nextInt();

            if (petChoice == 1) {
                dogChoice();
            } else if (petChoice == 2) {
               catChoice();
            } else if (petChoice == 3) {
                birdChoice();
            } else if (petChoice == 4) {
               fishChoice();
            } else if (petChoice == 5) {
                rabbitChoice();
            } else {

                System.out.println("\nSorry we do not have other pet in storage for the moment");
                System.out.println("___________________________________________________________");
            }
        } while (petChoice == 6);

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
        System.out.println(" Based on your preference, we have matched you with a pet named " +
                dog[sizeChoice - 1][genderChoice - 1][ageChoice - 1][tempChoice - 1][breedChoice - 1]);


    }
    public static void catChoice(){
        Scanner input = new Scanner(System.in);

        String pet = "cat";

        String[][][][] cat = new String[3][2][3][3];

        String[] sizes = {"Small", "Medium", "Large"};
        String[] genders = {"Male", "Female"};
        String[] ages = {"Puppy/Kitten", "Adult", "Senior"};
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

        // Summary
        System.out.println("\nThank you! Here's a summary of your preferences:");
        System.out.println("Pet: " + pet);
        System.out.println("Size: " + size);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Temperament: " + temperament);

        int count = 0;

        for (int i = 0; i < sizeChoice; i++) {
            for (int j = 0; j < genderChoice; j++) {
                for (int k = 0; k < ageChoice; k++) {
                    for (int l = 0; l < tempChoice; l++) {

                            cat[i][j][k][l] = catNames[count];
                            count++;
                    }
                }
            }
        }
        // final result
        System.out.println(" Based on your preference, we have matched you with a pet named " +
                cat[sizeChoice - 1][genderChoice - 1][ageChoice - 1][tempChoice - 1]);

    }
    public static void birdChoice(){
        Scanner input = new Scanner(System.in);



        String pet = "dog";

        String[][][][] dog = new String[3][2][3][3];

        String[] sizes = {"Small", "Medium", "Large"};
        String[] genders = {"Male", "Female"};
        String[] ages = {"Puppy/Kitten", "Adult", "Senior"};
        String[] temperaments = {"Calm", "Playful", "Protective"};

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


        // Summary
        System.out.println("\nThank you! Here's a summary of your preferences:");
        System.out.println("Pet: " + pet);
        System.out.println("Size: " + size);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Temperament: " + temperament);

        int count = 0;


        for (int i = 0; i < sizeChoice; i++) {
            for (int j = 0; j < genderChoice; j++) {
                for (int k = 0; k < ageChoice; k++) {
                    for (int l = 0; l < tempChoice; l++) {


                            dog[i][j][k][l] = dogNames[count];
                            count++;

                    }
                }
            }

        }
        // final result
        System.out.println(" Based on your preference, we have matched you with a pet named " +
                dog[sizeChoice - 1][genderChoice - 1][ageChoice - 1][tempChoice - 1]);



    }
    public static void fishChoice(){
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
        System.out.println(" Based on your preference, we have matched you with a pet named " +
                dog[sizeChoice - 1][genderChoice - 1][ageChoice - 1][tempChoice - 1][breedChoice - 1]);


    }
    public static void rabbitChoice(){
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
        System.out.println(" Based on your preference, we have matched you with a pet named " +
                dog[sizeChoice - 1][genderChoice - 1][ageChoice - 1][tempChoice - 1][breedChoice - 1]);


    }
        public static void basedOnLifestyle () {
            Scanner input = new Scanner(System.in);


            System.out.println();
            System.out.println("Please answer a few questions so we can match you with your ideal companion.");
            System.out.println("--------------------------------------------------");

            System.out.println("1. What type of home do you live in?");
            System.out.println("   a) Apartment");
            System.out.println("   b) House with yard");
            System.out.println("   c) Farm or rural area");
            String q1 = input.nextLine();

            System.out.println("2. How much time can you spend with a pet each day?");
            System.out.println("   a) Less than 1 hour");
            System.out.println("   b) 1-3 hours");
            System.out.println("   c) More than 3 hours");
            String q2 = input.nextLine();

            System.out.println("3. Are you looking for a pet that is:");
            System.out.println("   a) Low maintenance");
            System.out.println("   b) Moderate care");
            System.out.println("   c) High energy and interactive");
            String q3 = input.nextLine();

            System.out.println("4. Do you have any allergies to fur or dander?");
            System.out.println("   a) Yes");
            System.out.println("   b) No");
            String q4 = input.nextLine();

            System.out.println("5. How would you describe your current financial situation?");
            System.out.println("   a) I'm struggling financially");
            System.out.println("   b) I can manage my expenses");
            System.out.println("   c) I'm financially comfortable");
            System.out.println("   d) I have a lot of disposable income");
            System.out.print("Enter choice (1-4): ");
            String q5 = input.nextLine();

            System.out.println("6. How long are you away from home each day?");
            System.out.println("   a) Rarely away");
            System.out.println("   b) 4-6 hours");
            System.out.println("   c) More than 8 hours");
            String q6 = input.nextLine();



            String petMatch = "";

            if (
                    (q1.equals("b") || q1.equals("c")) &&
                            (q2.equals("b") || q2.equals("c")) &&
                            (q3.equals("b") || q3.equals("c")) &&
                            q4.equals("b") &&
                            (q5.equals("2") || q5.equals("3") || q5.equals("4")) &&
                            (q6.equals("a") || q6.equals("b"))
            ) {
                petMatch = "Dog";
            } else if (
                    (q1.equals("a") || q1.equals("b")) &&
                            q2.equals("b") &&
                            (q3.equals("a") || q3.equals("b")) &&
                            q4.equals("b") &&
                            (q5.equals("2") || q5.equals("3") || q5.equals("4")) &&
                            (q6.equals("a") || q6.equals("b"))
            ) {
                petMatch = "Cat";
            } else if (
                    (q1.equals("a") || q1.equals("b")) &&
                            (q2.equals("a") || q2.equals("b")) &&
                            (q3.equals("a") || q3.equals("b")) &&
                            (q4.equals("a") || q4.equals("b")) &&
                            (q5.equals("1") || q5.equals("2") || q5.equals("3")) &&
                            q6.equals("b")
            ) {
                petMatch = "Bird";
            } else if (
                    q2.equals("a") &&
                            q3.equals("a") &&
                            q4.equals("a") &&
                            (q5.equals("1") || q5.equals("2") || q5.equals("3") || q5.equals("4")) &&
                            (q6.equals("b") || q6.equals("c"))
            ) {
                petMatch = "Fish";
            } else if (
                    (q1.equals("a") || q1.equals("b")) &&
                            q2.equals("b") &&
                            (q3.equals("a") || q3.equals("b")) &&
                            q4.equals("b") &&
                            (q5.equals("2") || q5.equals("3") || q5.equals("4")) &&
                            q6.equals("a")
            ) {
                petMatch = "Rabbit";
            } else {
                petMatch = "We couldn’t determine a perfect match, but we recommend starting with a fish or bird!";
            }

            System.out.println(" Based on your lifestyle, a " + petMatch + " is the right choice for you.");


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




        }
    }
