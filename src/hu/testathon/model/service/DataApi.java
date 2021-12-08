package hu.testathon.model.service;

import hu.testathon.model.domain.TestResult;
import hu.testathon.model.domain.TestValidator;
import jdk.internal.util.jar.JarIndex;

import java.util.List;

public class DataApi {


    private final DataParser dataParser;
    private final List<String>lines;

    public DataApi(String filename,FileReader, DataParser, List<String> lines) {
        this.dataParser = dataParser;
         fileReader;
        this.lines =fileReader.read(filename);


    }

    public TestValidator createValidator(){
        return new TestValidator(dataParser.getAnswers(lines));
    }
    public List<TestResult> getData(){
        return dataParser.getTestResults(lines);
    }

}
