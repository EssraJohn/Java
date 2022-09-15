public class Main {
    public static void main(String[] args) {
        Box mybox= new Box();
        mybox.width= 2;
        mybox.depth= 5;
        mybox.height = 3;
        double vol;
        vol= mybox.depth * mybox.height * mybox.width;
        System.out.println("Vol is:" +vol);
    }
}