package Jar.controller;

import Jar.payload.ShapeEvent;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WhiteBoardController {

    // Klienci wysyłają wiadomości na adres: /app/draw
    @MessageMapping("/draw")
    // Serwer automatycznie odsyła wynik do wszystkich nasłuchujących na: /topic/board
    @SendTo("/topic/board")
    public ShapeEvent handleDrawAction(ShapeEvent event) {
        // Na razie tylko logujemy w konsoli, żeby widzieć, że działa
        System.out.println("✏️ Odebrano kształt: " + event.getType() + " na pozycji: " + event.getX() + ", " + event.getY());

        // W przyszłości tutaj dodamy zapis do bazy MongoDB 💾

        return event; // To, co zwracamy, trafia prosto do innych użytkowników
    }
}

