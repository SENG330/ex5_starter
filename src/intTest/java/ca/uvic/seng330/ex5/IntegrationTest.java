package ca.uvic.seng330.ex5;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class IntegrationTest {

  // go and see if the service is working
  @Test
  public void testGithub() {
    ObjectMapper objectMapper = new ObjectMapper();
    String s = "https://api.github.com/users/";
    String name = "";

    try {
      s += URLEncoder.encode("neilernst", "UTF-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
      fail(); // good practice to force fail when an exception happens
    }
    URL url = null;
    try {
      url = new URL(s);
    } catch (MalformedURLException e) {
      e.printStackTrace();
      fail();
    }
    // read from the URL
    Scanner scan = null;
    try {
      scan = new Scanner(url.openStream());
    } catch (IOException e) {
      fail();
    }
    String str = new String();
    while (scan.hasNext())
      str += scan.nextLine();
    scan.close();

    // build a JSON object
    try {
      JsonNode jsonNode = objectMapper.readTree(str);
      name = jsonNode.get("name").asText();
    } catch (IOException e) {
      e.printStackTrace();
      fail();
    }
    assertEquals("NeilErnst", name);
  }
}

