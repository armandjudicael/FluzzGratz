public class Main {
    public static void main(String[] args){
        int [] tab = {1,2,3,4,5,6,7,8,9,10,15};
        FluzzGratz.run(tab);
    }
    public class FluzzGratz {
        public static void run(int [] tab){
            for (int value : tab) {
                if (value %3==0) System.out.println("Fluzz");
                if (value%5 == 0) System.out.println("Gratz");
                if (value %3==0 && value%5 == 0) System.out.println("FluzzGratz");
                else System.out.println(value);
            }
        }
    }
}