package src.mp;

import java.util.ArrayList;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

public class Education extends Fragment {
	static Education newInstance(){
		Education p = new Education();
		return p;
		
		
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		ItemListEducation univ1 = new ItemListEducation(getResources().getDrawable(R.drawable.ubs_logo),"University of South Brittany", 2006, 2009, "Computer science", "Bachelor degree with honors", "Vannes -", " France");
		ItemListEducation polytech = new ItemListEducation(getResources().getDrawable(R.drawable.polytech_logo), "Polytech Nantes", 2009, 2012, "Software and Networks", "Master's degree", "Nantes -", " France");
		ItemListEducation laval = new ItemListEducation( getResources().getDrawable(R.drawable.ulaval_logo),"Laval University", 2011, 2012, "Software engineering", "Exchange student", "Quebec -", " Canada");
		
		ArrayList<ItemListEducation> educations = new ArrayList<ItemListEducation>();
		
		educations.add(laval);
		educations.add(polytech);
		educations.add(univ1);
		
		LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.education_fragment, null);
		ListView lvEducation = (ListView) ll.findViewById(R.id.lv_education);
		lvEducation.setCacheColorHint(Color.WHITE);
		EducationListAdapter adapter = new EducationListAdapter(getActivity(), R.layout.row_education_list);
		
		for(ItemListEducation e : educations) adapter.add(e);
		
		lvEducation.setAdapter(adapter);
		return ll;
	}


}
