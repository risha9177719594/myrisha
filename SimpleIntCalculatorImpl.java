public class SimpleIntCalculatorImpl implements SimpleIntCalculator{
       private double intrestRate;

       public double getIntrestRate() {
              return intrestRate;
       }

       public void setIntrestRate(double intrestRate) {
              this.intrestRate = intrestRate;
       }

       public double simpleIntrest(double principle, int months) {

              return principle*months*intrestRate/100;
       }



}
