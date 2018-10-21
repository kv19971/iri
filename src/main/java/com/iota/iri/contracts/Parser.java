package com.iota.iri.contracts;

public class Parser {
    private static Parser parserSingleton = null;
    public static Parser getParserInstance() {
        if(parserSingleton == null) {
            parserSingleton = new Parser();
        }
        return parserSingleton;
    }

    private Parser() {

    }

    public String getResult(String ternContractCode) {
        String contractCode = Converter.getStringFromTrytes(ternContractCode);
        return Integer.toString(getSumFromString(contractCode));
    }

    private Integer getSumFromString(String s) {

        String [] splits = s.split(" ");
        int sum = 0;
        for(String s: splits){
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
