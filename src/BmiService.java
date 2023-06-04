public class BmiService {
    int calculate (double height,int mass) {
        return (int) (mass / Math.pow(height, 2) );
    }
}
