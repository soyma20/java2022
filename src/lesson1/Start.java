package lesson1;

public class Start {
    public static void main(String[] args) {
        Post post = new Post(1, 1, "lorem", "ipsum dolor");
        System.out.println(post.getId());
        System.out.println(post);
        post.setBody("some text");
        System.out.println(post);

        String the_title = post.greetings("the title ");
        System.out.println(the_title);

        Comment comment = new Comment(1,2,"jdf","dkjfnk","fndklfnldkf");

        System.out.println(comment);
        System.out.println(comment.getBody());



    }
}
