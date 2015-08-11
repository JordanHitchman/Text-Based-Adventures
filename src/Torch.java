/**
 * Created by Jordan on 29/07/2015.
 */


    public class Torch extends item {

        Boolean lit = false;
        Player player;

        public Torch(Player player){
            lit = false;
            this.player = player;
        }

    @Override
    String getName() {
        return null;
    }

    public void useItem(){


        }

    @Override
    String getDescription() {
        return !lit? "It looks like it could be lit" : "It looks hot!";
    }



        public void lightTorch(){
lit = true;
        }

        public boolean stackable(){
            return false;
        }


    }

