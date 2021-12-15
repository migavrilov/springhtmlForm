package com.example.springhtml;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class ApiController {

    ArrayList<Form> info = new ArrayList<>();

    @GetMapping("/")
    public String postForm() {
        return "form.html";
    }

    @PostMapping("/addInfo")
    @ResponseBody
    public String addInfo(@RequestBody Form f) {
        info.add(f);
        return "done";
    }

    @GetMapping("/info")
    @ResponseBody
    public String allInfo() {
        String html = "<table>";
        for (Form f : info) {
            String line = "";
            line += "<tr>";
            line += "<td>"+f.getFio()+"</td>";
            line += "<td>"+f.getEmail()+"</td>";
            line += "<td>"+f.getPhone()+"</td>";
            line += "<td>"+f.getQ1()+"</td>";
            line += "<td>"+f.getQ2()+"</td>";
            line += "<td>"+f.getQ3()+"</td>";
            line += "</tr>";
            html += line;
        }
        html += "</table>";

        return html;
    }
}