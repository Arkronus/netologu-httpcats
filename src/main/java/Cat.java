import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {
    private String _id;
    private String text;
    private String type;
    private String user;
    private int upvotes;
    private int userUpvoted;

    public Cat(
            @JsonProperty("id") String _id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes,
            @JsonProperty("userUpvoted") int userUpvoted) {
        this._id = _id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
        this.userUpvoted = userUpvoted;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "_id='" + _id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes=" + upvotes +
                ", userUpvoted=" + userUpvoted +
                '}';
    }
}
