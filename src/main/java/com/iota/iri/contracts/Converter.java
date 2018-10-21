package com.iota.iri.contracts;

public class Converter {
    private static String  IOTAALPHABET = "9ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    private static String addPaddingToTrytes(String trytes) {
        if(trytes.length() % 2 != 0) {
            String tmp = "";
            for(int i = 0; i < (2 - trytes.length() % 2); i++) {
                tmp += "9";
            }
            trytes += tmp;
        }
        return trytes;
    }

    private static char [][] getGroupsFromTrytes(String trytes) {
        char [][] groupedStrings = new char[trytes.length()/2][2];
        for(int i = 0; i < trytes.length(); i += 2) {
            groupedStrings[i/2][0] = (trytes.charAt(i));
            groupedStrings[i/2][1] = (trytes.charAt(i+1));
        }
        return groupedStrings;
    }

    private static char getAsciiFromTrytes(char [] trytes) {
        return (char) ((IOTAALPHABET.indexOf(trytes[1])) * 27 + IOTAALPHABET.indexOf(trytes[0]));
    }

    public static String getStringFromTrytes(String trytes) {
        trytes = addPaddingToTrytes(trytes);
        char [][] groups = getGroupsFromTrytes(trytes);
        for(int i = 0; i < groups.length; i++){
            System.out.print(groups[i][0]);
            System.out.print(groups[i][1]);

        }
        System.out.println("");
        char [] buf = new char[trytes.length()/2];

        for(int i = 0; i < groups.length; i++) {

            buf[i] = getAsciiFromTrytes(groups[i]);
        }
        return new String(buf);
    }

}
