package websoc;

import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;


@ServerEndpoint("/websocket")
public class MyWebSocketEndpoint extends Endpoint {
    @Override
    public void onOpen(Session session, EndpointConfig config) {
        session.addMessageHandler(new MessageHandler.Whole<String>() {
            @Override
            public void onMessage(String message) {
                try {
                    session.getBasicRemote().sendText("Received: " + message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
