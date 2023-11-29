public class CalculateRadiusCircle {
    public static void main(String[] args) {
        String radiusStr = "7";
        double radiusDouble = Double.parseDouble(radiusStr);
        int radiusInt = (int) radiusDouble;
        double area = ((double)22/7) * radiusInt * radiusInt;
        System.out.println("Area = " + area);
    }
}
