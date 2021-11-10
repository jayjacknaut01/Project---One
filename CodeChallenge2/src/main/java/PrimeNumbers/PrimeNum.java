package PrimeNumbers;

public class PrimeNum<num> {

    public Object num;

    public String main(String[] args) {

        if ((num * num - 1) % 2 == 0) {
            return " not prime";
        } else
        {
            return "prime";
        }

    }
}


