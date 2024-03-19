package tpo2;

/**
 *
 * @author Facundo Biel
 */
public class Restar {
      private  int num1;
      private int num2 ;

      public Restar(int num1, int num2) {
        this.num1 = (int) (num1*Math.random());
        this.num2 = (int) (num2*Math.random());
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
      public void resultadoResta() {
          int resultado=  num1-num2;
          
          System.out.println("el resultado de la resta entre " + num1+ " y " + num2 + " es: " + resultado);
    } 
}
