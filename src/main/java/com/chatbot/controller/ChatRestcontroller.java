package com.chatbot.controller;

import com.chatbot.service.ChatAiService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/chat")
public class ChatRestcontroller {

    private final ChatAiService chatAiService;

    @RequestMapping("/ask")
    public String ask(String question) {
        return chatAiService.ragChat(question);
    }


}

