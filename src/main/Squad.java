package main;

import java.util.ArrayList;

public class Squad {
	
	private ArrayList<User> squadMembers = new ArrayList<>();
	
	public void addSquadMember(User newMember)
	{
		squadMembers.add(newMember);
	}
	
	public boolean removeSquadMember(User removeMember)
	{
		if(squadMembers.contains(removeMember))
		{
			squadMembers.remove(removeMember);
			return true;
		}
		else
		{
			return false;
		}
	}

}
