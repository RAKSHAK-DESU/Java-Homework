public class PhraseOMatic {
    public static void main (String[] args){
        // make 4 sets of words to choose from !
        String[] wordListOne= {"interpreter", "Tokyo-based strategist", "marketing specialist",
                "advertising producer", "game designer", "brand consultant",
                "startup founder", "digital strategist", "UX researcher",
                "data analyst", "no-code expert", "Japanese language specialist",
                "business developer", "growth hacker", "media planner",
                "public relations manager", "creative director", "entrepreneur"
        };

        String[] wordListTwo={"Minato-ku", "penthouse living", "Mercedes-Benz", "jetski adventures",
                "rooftop parties", "high-end dining", "Tokyo nightlife",
                "designer fashion", "luxury brands", "media industry connections",
                "VIP events", "exclusive networking", "socialite lifestyle",
                "elite circles", "celebrity meetups", "international travel",
                "famous collaborations", "entrepreneurial success"
        };

        String[] wordListThree= {"Dragon Ball", "Goku mindset", "super saiyan energy",
                "fighting game tournaments", "arcade culture", "retro gaming",
                "eSports competitions", "pixel art design", "boss fights",
                "sound effect engineering", "character animations", "multiplayer gaming",
                "one-on-one battle strategy", "gaming industry insights",
                "shonen hero mentality", "power-ups and leveling up",
                "Japanese gaming culture", "competitive gaming"
        };

        String[] wordListFour= {"JLPT mastery", "kanji decoding", "omiyage culture",
                "keigo etiquette", "izakaya nights", "samurai discipline",
                "kimono aesthetics", "Shibuya adventures", "Tokyo street vibes",
                "convenience store runs", "karaoke battles", "onsen relaxation",
                "Harajuku fashion trends", "Shinkansen journeys",
                "matcha appreciation", "Mikuru Asakura mindset", "Terrace House nostalgia",
                "language exchange mastery", "Akihabara explorations"
        };

        //Find out How many words are in each lit
        int oneLength= wordListOne.length;
        int twoLength= wordListTwo.length;
        int threeLength= wordListThree.length;
        int fourLength= wordListFour.length;

        //Generate Four Random Numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1= randomGenerator.nextInt(oneLength);
        int rand2= randomGenerator.nextInt(twoLength);
        int rand3= randomGenerator.nextInt(threeLength);
        int rand4= randomGenerator.nextInt(fourLength);

        //Now build a phrase
        String phrase = "As a " + wordListOne[rand1]+", I navigate through the fast-paced world of " +wordListTwo[rand2]+", balancing my passion for  "
                +wordListThree[rand3]+ " with my deep appreciation for "+wordListFour[rand4];

        //Print out the phrase
        System.out.println(phrase);
    }
}
