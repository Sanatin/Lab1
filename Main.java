public class Main {

    public static void main(String[] args) {

        short[] z = new short[14];

        for (short i = 3; i <= 16; i++){
            z[i-3] = i;
        }

        double[] x = new double[19];

        for (int i = 0; i < 19; i++){
            x[i] = (double) (-15 + Math.random() * 17);
        }

        double[][] w = new double[14][19];

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 19; j++) {
                w[i][j] = getNumber(z[i], x[j]);
            }
        }

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%.5f ", w[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean inArray(short n, short[] array){
        for (short value : array) {
            if (value == n) return true;
        }
        return false;
    }

    public static double getNumber(short z, double x){
        short [] t = {5, 6, 7, 9, 10, 15, 16};
        if(z == 4){
            return Math.asin(Math.pow((x - 6.5) / 17, 2));
        }else if(inArray(z, t)){
            return Math.pow((Math.tan(x) - 0.5) / Math.cos(x), Math.cos(Math.cos(x)));
        }else{
            return Math.sin(Math.cos((2.0/3.0) / Math.cbrt(x)));
        }
    }
}
