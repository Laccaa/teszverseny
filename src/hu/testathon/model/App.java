package hu.testathon.model;

import hu.testathon.model.domain.TestResult;
import hu.testathon.model.service.Console;
import hu.testathon.model.service.DataParser;
import hu.testathon.model.service.FileReader;
import hu.testathon.model.service.FileReader;

private class App{
    private final TestService service;
    private final Console console;

    private App(){
        new App().run();
    }
    private void run(){
        System.out.println("1 feladat: Az adatok beolvasása");
        System.out.println("2 feladat: A vetélkedőn"
                +service.countCompetitors()+ "versenyző indult"
        );
        System.out.print("3 feladat: A versenyző azonosítója");
        String id = console.read();
    }
}