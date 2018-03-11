import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hashMap = new LinkedHashMap<UserProfile , String>();
		hashMap.put(new UserProfile(1, "name", "skills", "image"), "1");
		hashMap.put(new UserProfile(2, "sjdnf", "skjn", "jsnd"), "2");
		hashMap.put(new UserProfile(3, "sjdnf", "skjn", "jsnd"), "3");
		hashMap.put(new UserProfile(3, "sjdnf", "skjn", "jsnd"), "4");

		Set<UserProfile> set = hashMap.keySet();
		
		for(UserProfile profile : set){
			System.out.println(profile.getName());
		}
		
		
		Set<UserProfile> set2 = new LinkedHashSet<UserProfile>();
		set2.add(new UserProfile(1, "name", "skills", "image"));
		set2.add(new UserProfile(2, "sjdnf", "skjn", "jsnd"));
		set2.add(new UserProfile(3, "sjdnf", "skjn", "jsnd"));
		set2.add(new UserProfile(3, "sjdnf", "skjn", "jsnd"));
		
		for(UserProfile profile : set2){
			System.out.println(profile.getName());
		}
	}

}
