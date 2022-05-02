package chess.controller.dto;

public class RoomDeleteRequest {

    private String password;

    private RoomDeleteRequest() {
    }

    public RoomDeleteRequest(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
