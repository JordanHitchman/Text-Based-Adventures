import java.io.*;
import java.util.ArrayList;

/**
 * Created by Jordan on 13/06/2015.
 */
public class Game {

    Parser parser;
    Room room;
    Player player;


    public Game(){

        parser = new Parser();
        createWorld();
        startMessage();
    }


    public void startMessage(){

        System.out.println("You wake up in a dungeon with no memory, but 2 coins in your pocket. \n 'God! What happened last night?' \n" +
                "You hear a sound in the distance!  \n 'What was that!? H H Hello?' \n" +
                "You hear a voice lurking in the shadows! \n 'Come fourth, destiny is calling you'" +
                "What do you do NEXT?");
    }


    public void loadGame(File file){

        try {
            FileInputStream fileStream = new FileInputStream(file);
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);

            player = (Player) objectStream.readObject();
            room = (Room) objectStream.readObject();

            System.out.println("Game loaded successfully! Continue your journey....");

        } catch(Exception e){

            e.printStackTrace();
            System.out.println("Unable to load game. Have you played before?");

        }

    }

    public void saveGame(File file) {

        try {
            FileOutputStream fileStream = new FileOutputStream(file);
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);


            objectStream.writeObject(player);
            objectStream.writeObject(room);

            objectStream.close();
            fileStream.close();

            System.out.println("Game saved successfully!");

        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Unable to save game, try again!");
        }


    }


    public void createWorld(){

    }

    public static void main(String[] args) throws IOException {

        Game g = new Game();
        boolean finished = false;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while(!finished){
            String read = bf.readLine();
            if(read.equals("QUIT")){
                finished = true;
                System.out.println("Thank you for playing! Have a nice day. :)");

            } else if(read.equals("SaveGame")){
                File file = new File(".", "gameSave.txt");
                g.saveGame(file);
            } else if(read.equals("LoadGame")){
                File file = new File("gameSave.txt");
                g.loadGame(file);
            }
            else {

                System.out.println("What next?");
            }
        }


    }



}
