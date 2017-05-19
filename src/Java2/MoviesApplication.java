package Java2;


public class MoviesApplication {
    public static void main(String[] args) {
        Input entry = new Input();
        MoviesArray list = new MoviesArray();
        Movie[] listOfMovies = MoviesArray.findAll();
        String yesNo = "n";

        do {
            displayMenu();
            switch (options(entry)) {
                case 0:
                    System.out.println("you selected option 0, good bye");
                    System.exit(0);
                case 1:
                    System.out.println("You selected option 1");
                    break;
                case 2:
                    System.out.println("You selected option 2");
                    break;
                case 3:
                    System.out.println("You selected option 3");
                    break;
                default:
                    System.out.println("Invalid option, please enter a number between 0 - 5");
            }
            System.out.println("Would you like to contiue?(Y/N)");
            yesNo = entry.getString();
        } while(yesNo.equalsIgnoreCase("y"));
//        for (int i = 0; i <= 5; i++){
//            System.out.println("Movie " + i + " " + listOfMovies[i].getName()+ "," + listOfMovies[i].getCategory());
//        }



}
        public static void displayMenu() {
        System.out.println("Please choose an option.");
        System.out.println("0.) Exit");
        System.out.println("1.) View all movies");
        System.out.println("2.) Movies in the Animated category");
        System.out.println("3.) Movies in the Drama category");
        System.out.println("4.) Movies in the Horror category");
        System.out.println("5.) Movies in the Sci-Fi category");
    }

        public static int options(Input entry){
        int option = entry.getInt();
        entry.getString();
        return option;
        }





}
