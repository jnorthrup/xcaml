package com.github.xcaml.caml;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;

/**
 * A Camel Application
 */
public class MainApp {

  /**
   * A main() so we can easily run these routing rules in our IDE
   */
  public static void main(String... args) throws Exception {
    Main main = new Main();
    main.enableHangupSupport();
    main.addRouteBuilder(new RouteBuilder() {
      /**
       * Let's configure the Camel routing rules using Java code...
       */
      public void configure() {

        // here is a sample which processes the input files
        // (leaving them in place - see the 'noop' flag)
        // then performs content based routing on the message using XPath
        from("file:src/data?noop=true").choice().when(xpath("/person/city = 'London'")).log(
            "UK message").to("file:target/messages/uk").otherwise().log("Other message").to(
            "file:target/messages/others");
      }
    });
    main.run(args);
  }

}
