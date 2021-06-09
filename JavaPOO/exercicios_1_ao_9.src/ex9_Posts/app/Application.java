package ex9_Posts.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import ex9_Posts.entities.Comment;
import ex9_Posts.entities.Post;

public class Application {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Show!");
		Comment c2 = new Comment("ihuu");
		Post p1 = new Post(
				sdf.parse("21/04/2016 08:15:00"), "Michaelsoft Binbows", "Epic", 12);
		p1.addComment(c1);
		p1.addComment(c2);

		System.out.println(p1);

	}
}