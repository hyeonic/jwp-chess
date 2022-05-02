package chess.controller.dto;

public class ChessPieceMoveRequest {

    private String from;
    private String to;

    private ChessPieceMoveRequest() {
    }

    public ChessPieceMoveRequest(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
