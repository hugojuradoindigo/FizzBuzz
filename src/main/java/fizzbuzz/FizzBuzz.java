package fizzbuzz;

public class FizzBuzz {
    
    public String evaluteFizzBuzzNumber(int number){
        if (number % 3 == 0) {
            return "fizz";
        }else if (number % 5 == 0) {
            return "buzz";
        }else {
            return String.valueOf(number);
        }
    }
}
