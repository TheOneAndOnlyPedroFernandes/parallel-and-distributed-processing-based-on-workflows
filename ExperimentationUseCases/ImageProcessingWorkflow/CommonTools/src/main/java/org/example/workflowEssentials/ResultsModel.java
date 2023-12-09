package org.example.workflowEssentials;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class ResultsModel {
    private static final String PATH_TO_TASK_RESULTS_FILE = System.getenv("PATH_TO_TASK_RESULTS_FILE");

    public String[] results;

    public ResultsModel(String... results) {
        this.results = results;
    }

    public void writeToOutputFile() {
        try (FileWriter fileWriter = new FileWriter(PATH_TO_TASK_RESULTS_FILE)) {
            fileWriter.write(new Gson().toJson(this));
            System.out.println("JSON data written to file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing JSON data to file.");
            e.printStackTrace();
        }
    }
}