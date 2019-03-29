package net.teslaa.courses;

import org.apache.log4j.BasicConfigurator;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        //get("/hello", (req, res) -> "Hello World");
        get("/", (req, res) -> {
            return new ModelAndView(null, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
