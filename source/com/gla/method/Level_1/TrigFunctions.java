public class TrigFunctions {
    public double[] calculateTrigonometricFunctions(double angle) {
        double r = Math.toRadians(angle);
        return new double[]{Math.sin(r), Math.cos(r), Math.tan(r)};
    }
}