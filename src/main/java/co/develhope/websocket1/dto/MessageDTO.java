package co.develhope.websocket1.dto;

public class MessageDTO {

    private String type;
    private String message;

    public MessageDTO(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
                "type='" + type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}