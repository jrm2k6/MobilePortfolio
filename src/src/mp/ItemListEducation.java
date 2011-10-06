package src.mp;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;


public class ItemListEducation {
	private Drawable imgSchool;
	private String nameSchool;
	private int begin;
	private int end;
	private String major;
	private String degree;
	private String city;
	private String country;
	
	
	
	
	
	
	public ItemListEducation(Drawable _imgSchool, String nameSchool, int begin,
			int end, String major, String degree, String city, String country) {
		super();
		
		
		
		this.imgSchool = _imgSchool;
		this.nameSchool = nameSchool;
		this.begin = begin;
		this.end = end;
		this.major = major;
		this.degree = degree;
		this.city = city;
		this.country = country;
		
	}
	
	
	
        


	
	public Drawable getImgSchool() {
		return imgSchool;
	}
	public void setImgSchool(Drawable imgSchool) {
		this.imgSchool = imgSchool;
	}
	public String getNameSchool() {
		return nameSchool;
	}
	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}
	public int getBegin() {
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
