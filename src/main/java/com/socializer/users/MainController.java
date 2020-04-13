package com.socializer.users;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/auth")
public class MainController {

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String index() {
        System.out.println("HOII");
        return "{ \"key\": \"value\", \"foo\": \"bar\", \"aa\": \"bb\" }"; // return test Json data
    }

    @RequestMapping(value = "/message", method = RequestMethod.POST)
    public String index(@RequestBody Map<String, Object> payload) {
        System.out.println(payload);
        return "{ \"key\": \"value\", \"foo\": \"bar\", \"aa\": \"bb\" }";
    }



}
