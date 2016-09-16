import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Collections;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    //homepage
      get("/", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("words", Word.all());
        model.put("template", "templates/index.vtl");
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

      post("/", (request, response)->{
      Map<String, Object> model = new HashMap<String, Object>();
      Word aWord = new Word(request.queryParams("word"));
      model.put("words", Word.all());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
  }
}
