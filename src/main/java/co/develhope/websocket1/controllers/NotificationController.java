package co.develhope.websocket1.controllers;

import co.develhope.websocket1.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NotificationController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @PostMapping("/broadcast-message")
    public ResponseEntity sendMessageToSubscribers(@RequestBody MessageDTO message) {
        simpMessagingTemplate.convertAndSend("/topic/broadcast", message);
        return ResponseEntity.ok("Message sent to subscribers on /topic/broadcast");
    }

}