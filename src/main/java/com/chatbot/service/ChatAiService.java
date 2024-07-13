package com.chatbot.service;

import com.vaadin.hilla.BrowserCallable;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Service
@BrowserCallable
@AnonymousAllowed
public class ChatAiService {
        private  final ChatClient chatClient;

        public ChatAiService(ChatClient.Builder chatClient) {
                this.chatClient = chatClient.build();
        }


        public String ragChat(String question) {
                return chatClient.prompt()
                        .user(question)
                        .call()
                        .content();
        }



}
