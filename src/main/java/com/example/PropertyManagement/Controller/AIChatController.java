package com.example.PropertyManagement.Controller;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIChatController {

    private final ChatClient chatClient;

    public AIChatController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/ai/chat")
    public String chat(
            @RequestParam(defaultValue = "Hello Iam USer")
            String message) {

        return chatClient.prompt()
                .user(message)
                .call()
                .content();
    }
}

