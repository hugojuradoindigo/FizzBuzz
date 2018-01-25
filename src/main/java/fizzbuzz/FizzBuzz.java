package fizzbuzz;

public class FizzBuzz {
    
    public String evaluteFizzBuzzNumber(int number){
        if (isFizzBuzz(number)) {
            return "fizzbuzz";
        }else if (isFizz(number)) {
            return "fizz";
        }else if (isBuzz(number)) {
            return "buzz";
        }else {
            return String.valueOf(number);
        }
    }
    
    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
    
    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }
    
    private boolean isFizzBuzz(int number) {
        return (number % 3 == 0 && number % 5 == 0);
    }
}
