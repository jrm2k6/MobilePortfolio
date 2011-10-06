package src.mp;

import java.util.ArrayList;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

public class Experience extends Fragment {
	static Experience newInstance(){
		Experience e = new Experience();
		return e;
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
		ArrayList<String> ucscSkills = new ArrayList<String>();
		String[] uscstmp = {"Android/Java","Web development", "UML", "Redaction", "User interface"};
		for(String s : uscstmp) ucscSkills.add(s);
		ItemListExperience ucsc = new ItemListExperience(1, "May - September 2011", "- Developed mainly two applications for people with Alzheimer's and aphasia disease.\n- Participated in redaction of scientific papers.", " Conception/Development in Android", " University of California Santa Cruz", "Santa Cruz - USA",ucscSkills , 1);
		
		ArrayList<String> jurisoftSkills = new ArrayList<String>();
		String[] jurisofttmp = {"Delphi", "Web development", "UML", "Documentation", "Latex", "Webservices", "IIS"};
		for(String s : jurisofttmp) jurisoftSkills.add(s);
		ItemListExperience jurisoft = new ItemListExperience(5, "June - September 2010", "- Development of upgrades for the company's main software.\n- Use of Delphi language with webservices for securing user registration, " +
				"and to managing software updating.\n- Use of webservices in PHP5 to control access to the downloads parts of the website, with user authentication.", " Conception/Development in Delphi", " Jurisoft Applications", "Nantes - France", jurisoftSkills, 1);
		
		String[] fizianstmp = {"Project management", "C", "Python", "Django", "XML-RPC", "Documentation"};
		ArrayList<String>fiziansSkills = new ArrayList<String>();
		for(String s : fizianstmp)fiziansSkills.add(s);
		ItemListExperience fizians = new ItemListExperience(2, "September 2010 - May 2011", "- A binomial studying project consisting of a project management from the beginning to the end. We had to develop administration modules"+
				"for a cloud storage solution, in Python.\n - We also developed a web interface in Django to make the solution easily manageable.", "Development/Project management", "Polytech Nantes - Fizians", "Nantes - France", fiziansSkills, 2);
		
		
		String[] arcantiquetmp = {"Documentation", "User observation", "Redaction"};
		ArrayList<String>arcantiqueSkills = new ArrayList<String>();
		for(String s: arcantiquetmp) arcantiqueSkills.add(s);
		ItemListExperience arcantique = new ItemListExperience(3, "January - March 2011", "- Analysis of a GED software used by the company. It was getting old, so I was in charge to find a replacement solution, and to manage the backup of all data of the company (10/15 years of data).", "Contractor", "Arc'Antique", "Nantes - France", arcantiqueSkills, 3);
		
		
		ArrayList<String> pdnSkills = new ArrayList<String>();
		pdnSkills.add("Android");
		pdnSkills.add("Google API");
		ItemListExperience pdn = new ItemListExperience(4, "February - April 2011", "- Developed the geolocation part of an android application for a famous music festival.", "Android development", "\"Papillons de nuit\" festival", "France", pdnSkills, 3);
		
		ArrayList<String> sdSkills = new ArrayList<String>();
		sdSkills.add("Android");
		sdSkills.add("SQL");
		ItemListExperience sd = new ItemListExperience(6, "March - May 2010", "- Developed an android application to manage shopping lists and recipes.", "Android development", "Polytech Nantes", "Nantes - France", sdSkills, 3);
		
		ExperienceListAdapter adapter = new ExperienceListAdapter(getActivity(), R.layout.row_experience_list);
		
		adapter.add(ucsc);
		adapter.add(fizians);
		adapter.add(arcantique);
		adapter.add(pdn);
		adapter.add(jurisoft);
		adapter.add(sd);
		
		ArrayList<ItemListExperience>experiences = new ArrayList<ItemListExperience>();
		
		experiences.add(ucsc);
		experiences.add(fizians);
		experiences.add(arcantique);
		experiences.add(pdn);
		experiences.add(jurisoft);
		experiences.add(sd);
		
		LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.experience_fragment, null);
		ListView lvExperience = (ListView) ll.findViewById(R.id.lv_experience);
		lvExperience.setAdapter(adapter);
		lvExperience.setCacheColorHint(Color.WHITE);
		ExperienceItemClickListener listener = new ExperienceItemClickListener(getActivity(), experiences);
		lvExperience.setOnItemClickListener(listener);
		return ll;
	}
}
