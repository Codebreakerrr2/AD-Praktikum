package Aufgabe1;


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.Arrays;

public class AccumulatorClient {

    public static void main(String[] args) {
        double[] inputData= null;
        if(!StdIn.isEmpty()){
             inputData= StdIn.readAllDoubles();
        }
        //Preconditions.checkNotNull(inputData);
       Arrays.sort(inputData);
       double max= inputData[inputData.length-1];
       int trials= inputData.length;

        Accumulator accumulator= (Integer.parseInt(args[0])==0) ? new SimpleAccumulator(): new VisualAccumulator(max,trials);
        while(!StdIn.isEmpty()){
            accumulator.addDataValue(StdIn.readDouble());
        }
    }
}
