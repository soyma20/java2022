package lesson1;


import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = {"userId"})
@NoArgsConstructor
public class Post {
    private int id;
    private int userId;
    private String title;
    private String body;

    public String greetings(String msg) {
        return msg + "of post is " + this.title;
    }

//    public Post(int id, int userId, String title, String body) {
//        this.id = id;
//        this.userId = userId;
//        this.title = title;
//        this.body = body;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getBody() {
//        return body;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setBody(String body) {
//        this.body = body;
//    }
//
//    @Override
//    public String toString() {
//        return "Post{" +
//                "id=" + id +
//                ", userId=" + userId +
//                ", title='" + title + '\'' +
//                ", body='" + body + '\'' +
//                '}';
//    }

}
