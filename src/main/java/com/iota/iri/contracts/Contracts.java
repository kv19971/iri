package com.iota.iri.contracts;

public class Contracts {
    public static void runContract(String rawCode) {
        Parser parser = Parser.getParserInstance();
        parser.getResult(rawCode);
    }
}
