import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lab11 {
    private class Client{
        private final int time;
        public int getTime() {
            return time;
        }
        public Client(){
            time = new Random().nextInt(20);
        }
    }

    private class Operator{
        private List<Client> clients = new ArrayList<>();
    }

    private List<Operator> operators = new ArrayList<>();

    public static void main(String[]args){
        new Lab11();
    }

}
