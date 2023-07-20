package Notebook;

public class Note {
    private String theme;
    private String date;
    private String email;
    private String message;

    public Note(String theme, String date, String email, String message) {
        this.theme = theme;
        this.date = date;
        this.email = email;
        this.message = message;
    }

    public String getTheme() {
        return theme;
    }

    public String getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Note{" +
                "theme='" + theme + '\'' +
                ", date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
