import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.staticfiles.Location;

public class Main {
    private static Context context;

    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/", Location.CLASSPATH);
        }).start(9000);


        // app.get("/hello-world", ctx -> ctx.result("Hello World"));
        // app.get("/hi-world", ctx -> ctx.result("This is a GET request"));

        // app.get("/html-example", ctx -> {

        //  ctx.result("<html><body><h1><We have sent HTML using Javalin</hi></body></html>");

        // app.get("/json-example", context -> context.contentType("application/jason"));
        // context.result("{\"field1\": 5, \"field2\": [5,10,\"hello\"]}");

        // app.get("/form-get", content -> {
        //  String word = content.queryParam("word");
        //  System.out.println(word);

        // if (word.equals(""))
        //   word = "nothing";

        //  StringBuilder jb = new StringBuilder(word);
        //  System.out.println(jb);

        //  jb.append(jb.charAt(0))
        //         .append("ay")
        //       .deleteCharAt(0);
// app.get("/hello-world", ctx -> ctx.result("Hello World"));
        app.post("/add", anything -> {
            int add1 = Integer.parseInt(anything.formParam("number1"));
            int add2 = Integer.parseInt(anything.formParam("number2"));
            anything.result(String.valueOf(add1 + add2));
        });


        app.post("/subtract", anything1 -> {
            int subtract1 = Integer.parseInt(anything1.formParam("number3"));
            int subtract2 = Integer.parseInt(anything1.formParam("number4"));
            anything1.result(String.valueOf(subtract1 - subtract2));
        });


        app.post("/multiply", anything2 -> {
            int multiply1 = Integer.parseInt(anything2.formParam("number5"));
            int multiply2 = Integer.parseInt(anything2.formParam("number6"));
            anything2.result(String.valueOf(multiply1 * multiply2));
        });

        app.post("/divide", anything3 -> {
            int divide1 = Integer.parseInt(anything3.formParam("number7"));
            int divide2 = Integer.parseInt(anything3.formParam("number8"));
            anything3.result(String.valueOf(divide1 / divide2));

        });



    }
}




         // We can make more  different GET end points
        // That is what is in the  app.get("/hello-world", ctx -> {
        // should be different ie app.get(" must be different  ")
