/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aarushi
 */
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.Page;
import com.restfb.types.Post;
import com.restfb.types.User;
import com.restfb.types.Venue;
import java.util.List;




public class Facebook { 
    
    /*
    public static void main(String args[])
    {
        FacebookClient facebookClient = new DefaultFacebookClient("CAACEdEose0cBAAXH6YK88hGrevuoeazsn568OnFAs5ZCC4dEZC9aVwwSsTQk66HVbWkgCj1ky2rHysDS0JwjXWFpVLiu8qBkItyTZCUq8px9E7F7YA0aGd0MZAxMnGyMcbaK7VwNMrX0SyEnTGZAlRG4IkCNDJlpxUXdZBgpcy0EbKkT4ksd6OaeSAFhcnB0YZD");
        User user = facebookClient.fetchObject("me", User.class);
        Page page = facebookClient.fetchObject("cocacola", Page.class);
        System.out.println("User name: " + user.getName());
        System.out.println("Page likes: " + page.getLikes());
        Connection<Post> publicSearch =
   facebookClient.fetchConnection("search", Post.class,
  Parameter.with("q", "friends"), Parameter.with("type", "post"));

Connection<User> targetedSearch =
  facebookClient.fetchConnection("search", User.class,
  Parameter.with("q", "Nikhil Kallani"), Parameter.with("type", "user"));

System.out.println("Public search: " + publicSearch.getData().get(0).getMessage());
System.out.println(targetedSearch.getData());

Connection<User> myFriends = facebookClient.fetchConnection("me/friends", User.class); 
   // Parameter.with("fields", "id,first_name,last_name,name,gender"));
     System.out.println("Count of my friends: " + myFriends.getData().size());
    List<User> users1=myFriends.getData();
        for (User users : users1) {
            System.out.println(users.getName());
        }

Connection<Venue> venueSearch =
  facebookClient.fetchConnection("search", Venue.class,
  Parameter.with("q", "Newyork"), Parameter.with("type", "venue"));
System.out.println(venueSearch.getData());

    
    }*/
   private static final String FACEBOOK_API_KEY = "1434183396831120";
	private static final String MY_APP_SECRET = "50a816efa259b3b5f75a6a8d5b107b4f";
	private static final String MY_ACCESS_TOKEN="CAACEdEose0cBAOSpo5RMZBFl77ZBBbUfxyEwD7ZBeecMRtWC5EIz4MfkLgL7Igzn8ERiB2JJlVpQAR3alNMvBhi8fBunqpUDjZAyZCLSOikV8uVCrUUDexg8xL2ggwir0ZATYZCjQzD5y89P5o6I2cmZBhZBOUP4EOXeiMf2XucLWNBYckaz1qp7S2j669LVKpAkZD";
        private static FacebookClient facebookClient;
	private static final String facebookAuthToken = null;
	private final String facebookSessionKey = null;
        

	 public static void main(String args[])
    {
        facebookClient = new DefaultFacebookClient("CAACEdEose0cBACzDx0Ew84eWzUCXEHM1IbPZBrBpfSXYrMdyIj6ZABZCYknlOYjY8ZCiwI0DilVMRQpttzteIws11xvb1zoZBgfBp0YRGBt9LyYk4fPzkMFZAtCUeUqDiNSUE4JV5y3eugCl5oLc2ZAcqFfyqw1luxQWV77EH1hKbesPZATmNn95qD8PDBKBi4UZD");
        User user = facebookClient.fetchObject("me", User.class);
        Page page = facebookClient.fetchObject("shopizard", Page.class);
        User user1 = facebookClient.fetchObject("me/friends/Shagun Beniwal", User.class);
        System.out.println("User name: " + user.getName());
        System.out.println("Page likes: " + page.getLikes());
        System.out.println("User name: " + user1.getName());
        
        //public search
        Connection<Post> publicSearch =facebookClient.fetchConnection("search", Post.class,
        Parameter.with("q", "friends"), Parameter.with("type", "post"));

        //targeted search
        Connection<User> targetedSearch =facebookClient.fetchConnection("search", User.class,
        Parameter.with("q", "Aarushi Karnany"), Parameter.with("type", "user"));

        System.out.println("Public search: " + publicSearch.getData().get(0).getMessage());
        System.out.println(targetedSearch.getData());

        Connection<User> myFriends = facebookClient.fetchConnection("me/friends", User.class); 
        //Parameter.with("fields", "id,first_name,last_name,name,gender"));
        System.out.println("Count of my friends: " + myFriends.getData().size());
        
         List<User> users1=myFriends.getData();
            for (User users : users1) 
            {
              System.out.println(users.getName());
            }

        //Read mailbox (needs permissions)
        //Connection<JsonObject> conversationsConnection = facebookClient.fetchConnection("me/inbox", JsonObject.class);
        //System.out.print(conversationsConnection);
        
       // My wall (working) 
        Connection<Post> rPosts = facebookClient.fetchConnection("me/feed", Post.class);
        System.out.println("Wall posts :" + rPosts);
        
        //Permission Level (Null result) 
        //Connection<Post> permissions = facebookClient.fetchConnection("me/permissions", Post.class);
        //System.out.println("Permission Level :" + permissions);
        
        Connection<Venue> venueSearch =facebookClient.fetchConnection("search", Venue.class,
        Parameter.with("q", "realmimagine"), Parameter.with("type", "venue"));
        System.out.println(venueSearch.getData());

    
    }


}
