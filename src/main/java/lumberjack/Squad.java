package lumberjack;

import java.util.ArrayList;

public class Squad {
	
	private ArrayList<User> squadMembers = new ArrayList<User>();
	private User leadUser;
	private Bill bill;
	
	public Squad(double billSize)
	{
		bill = new Bill(billSize);
	}
	
	public void addSquadMember(User newMember)
	{
		squadMembers.add(newMember);
	}
	
	public boolean setLeadUser(User newLead)
	{
		if(squadMembers.contains(newLead))
		{
			leadUser = newLead;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public User getLeadUser()
	{
		if(leadUser!=null)
		{
			return leadUser;
		}
		else 
		{
			return null;
		}
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

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

}
