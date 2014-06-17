
//import com.restfb.FacebookClient;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Place;
import facebook4j.Post;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aarushi
 */
public class Fb4j {
     private static final String FACEBOOK_API_KEY = "1434183396831120";
	private static final String MY_APP_SECRET = "50a816efa259b3b5f75a6a8d5b107b4f";
	private static final String MY_ACCESS_TOKEN="CAACEdEose0cBANRZAz841YF8h57LIWgG4i9L4TCzH20CJOSbFrLGUla9Ra9F6ZAWK44ycqSU0nsZA4KmLXnbZCCzc6Jk2bVwxPaVHXLbSIR1kl0mcf8bfikeqHoCYYa6bdxbZC2qzIIwiILkv3u2Ypryh9QHDmp3C4C7qDof40WVyZBSeW4XSmMDF80YcCAEQZD";
        //private static FacebookClient facebookClient;
	private static final String facebookAuthToken = null;
	private final String facebookSessionKey = null;
        

	 public static void main(String args[]) throws FacebookException
         {
            facebook4j.Facebook facebook = new FacebookFactory().getInstance();
            facebook.setOAuthAppId(FACEBOOK_API_KEY, MY_APP_SECRET);
            facebook.setOAuthPermissions("email,publish_stream,read_stream,name");
            facebook.setOAuthAccessToken(new AccessToken(MY_ACCESS_TOKEN, null));
          //  facebook.getOAuthAppAccessToken();
           ResponseList<Post> results = facebook.searchPosts("Bollywood");
         int i=0;
         for (i=0;i<results.size()-1;i++)
         {
          //  System.out.println(results.get(i).getName());
         }
         
         ResponseList<User> results2 = facebook.searchUsers("Pranay Karnany");
         
         for (i=0;i<results2.size()-1;i++)
         {
            System.out.println(results2.get(i).getName());
         }
         
         ResponseList<Place> results1 = facebook.searchPlaces("new york");
         for (i=0;i<results1.size()-1;i++)
         {
           //System.out.println(results1.get(i).getName());
         }
         
         
         
         }
}
