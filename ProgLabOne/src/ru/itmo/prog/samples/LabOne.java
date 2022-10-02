package ru.itmo.prog.samples;
public class LabOne {
    public static void main(String[] args) {
        short[] s = createArrayOddSequence( (short)5, (short)17);
        float[] x = createRandomArray(-3f,15f, 14);
        float[][] p = createDoubleArray1(s,x);
        printDoubleArray(p);
    }
    private static short[] createArrayOddSequence(short min, short max){
        short[] arraySequence = new short[max-min+1];
        for (int i = 0;i < (max-min)/2+1; i++){
            arraySequence[i] = (short) (min+i*2);
            //System.out.println(arraySequence[i]);
        }
        return arraySequence;
    }
    private static float[] createRandomArray(float min, float max, int amount) {
        float[] randomArray = new float[amount];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = ((float)(Math.random() * 19) - 3);
        }
        return randomArray;
    }
    private static boolean isInArray(short[] s, float i){
        boolean found = false;
        int searchedValue = s[(int) i];

        for(int x : s){
            if(x == searchedValue){
                found = true;
                break;
            }
        }
        return found;
    }
      static float[][] createDoubleArray1(short[] s, float[] x){
        float[][] doubleArray = new float[7][14];
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 14; j++){
                if (s[i] == 15){
                    doubleArray[i][j] = (float) Math.sin(Math.pow((Math.cbrt(x[i])-1)/Math.pow((2*x[i]),2),2));
                }
                else if (isInArray(s, i)) {
                    doubleArray[i][j] = (float) Math.asin( 1 / (Math.pow(Math.E,Math.pow(Math.sqrt(Math.abs(x[i])), Math.atan(Math.pow(Math.E,-(Math.abs(x[i]))))))));
                }
                else{
                    doubleArray[i][j] = (float) Math.tan(Math.pow((   (0.5 + Math.pow( ( (float)(3/4) / (1 - Math.atan( (x[i]+6)/18 ) ) ), Math.atan( (x[i]+6)/18 )))/3) /4, 2));
                }
            }
        }
        return doubleArray;
      }
      private static void printDoubleArray(float[][]doubleArray){
          for (int i = 0; i < doubleArray.length; i++) {
              for (int j = 0; j < doubleArray[i].length; j++) {
                  System.out.print(String.format("%.5f",doubleArray[i][j]) + "\t");
              }
              System.out.println();
          }
      }
      
}
