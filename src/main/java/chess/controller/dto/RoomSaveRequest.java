package chess.controller.dto;

public class RoomSaveRequest {

    private String name;
    private String password;

    private RoomSaveRequest() {
    }

    public RoomSaveRequest(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
