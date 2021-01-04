package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class PrimeFactors {
    public List<Object> of(int number)
    {
        List listOfPrimeFactor = new ArrayList<Integer>();
        if(number == 2)
            listOfPrimeFactor.add(number);
        return listOfPrimeFactor;
    }
}
