package progmatic;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String text,String authorName, String publicationDate, String title) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }
}
