package Case_Study2.Rating_App;

public class Comment {
private int comment_id;
private String comment_text;
private int Likes;
private int Dislike;
private boolean report;
public Comment() {
	super();
	// TODO Auto-generated constructor stub
}
public Comment(int comment_id, String comment_text, int likes, int dislike, boolean report) {
	super();
	this.comment_id = comment_id;
	this.comment_text = comment_text;
	Likes = likes;
	Dislike = dislike;
	this.report = report;
}
public int getComment_id() {
	return comment_id;
}
public void setComment_id(int comment_id) {
	this.comment_id = comment_id;
}
public String getComment_text() {
	return comment_text;
}
public void setComment_text(String comment_text) {
	this.comment_text = comment_text;
}
public int getLikes() {
	return Likes;
}
public void setLikes(int likes) {
	Likes = likes;
}
public int getDislike() {
	return Dislike;
}
public void setDislike(int dislike) {
	Dislike = dislike;
}
public boolean isReport() {
	return report;
}
public void setReport(boolean report) {
	this.report = report;
}
}
