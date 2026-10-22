
package com.example.PropertyManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatbotPageController {

    @GetMapping("/chatbot")
    public String chatbotPage() {
        return "chatbot";
    }
}
