package src.mp;

import java.util.ArrayList;

import android.graphics.drawable.Drawable;

public class ItemListExperience {
	private int id;
	private String period;
	private String content;
	private String title;
	private String place;
	private String country;
	private ArrayList<String> skills;
	private int typeExperience;
	
	
	public ItemListExperience(int id,String period, String content, String title,
			String place, String country, ArrayList<String> skills,
			 int typeExperience) {
		super();
		this.id = id;
		this.period = period;
		this.content = content;
		this.title = title;
		this.place = place;
		this.country = country;
		this.skills = skills;
		/** 1 : internship
		 * 2 : scholar project
		 * 3 : personal project
		 */
		this.typeExperience = typeExperience;
	}


	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public String getPeriod() {
		return period;
	}


	public void setPeriod(String period) {
		this.period = period;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public ArrayList<String> getSkills() {
		return skills;
	}


	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}


	


	public int getTypeExperience() {
		return typeExperience;
	}


	public void setTypeExperience(int typeExperience) {
		this.typeExperience = typeExperience;
	}
	
	
	
	
	
	
}
