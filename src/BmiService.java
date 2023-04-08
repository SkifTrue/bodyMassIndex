public class BmiService {
    public int calculate(int mass, double height){
        int index;
        index = (int) ((int) (mass) / Math.pow(height, 2));

        return index;
    }
}
