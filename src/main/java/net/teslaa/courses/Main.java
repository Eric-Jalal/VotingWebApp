package net.teslaa.courses;

import org.apache.log4j.BasicConfigurator;

import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        get("/hello", (req, res) -> "Hello World");
        get("/", (req, res) -> "Hello");
    }
}
