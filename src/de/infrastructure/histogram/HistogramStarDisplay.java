package de.infrastructure.histogram;

public class HistogramStarDisplay {

    String getHistogram(int[] frequencyTable){
        //return "A: **\n";
        String result = "";
        for(int i=0; i<frequencyTable.length; i++){
            // "A: **\n";
            result +=  ""+(char)(i+65)+": " + generateSternchen(frequencyTable[i]) + "\n";
        }
        return result;
    }
    String generateSternchen(int n){
        String result = "";
        for(int i=0; i<n; i++) result += "*";
        return result;
    }
}
