package net.teslaa.courses;

import org.apache.log4j.BasicConfigurator;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        //get("/hello", (req, res) -> "Hello World");
        get("/", (req, res) -> {
            return new ModelAndView(null, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/sign-in", (req, res) -> {
            Map<String, String> mapModel = new HashMap<>();
            mapModel.put("username", req.queryParams("username"));
            return new ModelAndView(mapModel, "sign-in.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
