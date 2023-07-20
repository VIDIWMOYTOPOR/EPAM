package Archive;

import java.io.Serializable;

public class Response implements Serializable {
    private ResponseType type;
    private Object data;
    private String message;

    public Response(ResponseType type, Object data) {
        this.type = type;
        this.data = data;
    }

    public Response(ResponseType type, String message) {
        this.type = type;
        this.message = message;
    }

    public ResponseType getType() {
        return type;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
}
