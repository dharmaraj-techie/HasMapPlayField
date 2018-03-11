
/**
 * Created by Dharmaraj on 10-03-2018.
 */

public class UserProfile {
    private int id;
    private String name;
    private String skills;
    private String imageUrl;

    public UserProfile(int id, String name, String skills,String imageUrl){
        this.id = id;
        this.name = name;
        this.skills =skills;
        this.imageUrl = imageUrl;
    }
    
    
    @Override
    public int hashCode() {
    	int hashCode = 0;
    	hashCode += name.hashCode();
    	hashCode += skills.hashCode();
    	hashCode += imageUrl.hashCode();
    	// TODO Auto-generated method stub
    	return hashCode;
    }
    
    
    @Override
    public boolean equals(Object obj) {
    	UserProfile profile = (UserProfile) obj;
    	if(this.id == profile.getUserId())
    		return true;
    	else{
    		if(this.name.equals(profile.getName())
    				&& this.skills.equals(profile.getSkills())
    				&& this.imageUrl.equals(profile.getImageUrl()))
				return true;
    	}
    	
    	return false;		
    }

    public int getUserId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSkills() {
        return skills;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
