package src.mp;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class ExperienceItemClickListener implements OnItemClickListener{
	private ArrayList<ItemListExperience>experiences;
	private Context context;
	public ExperienceItemClickListener(Context context,ArrayList<ItemListExperience> experiences){
		this.context = context;
		this.experiences = experiences;
	}
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		ItemListExperience exp = this.getItemFromList(arg2);
		Intent i = new Intent(this.context, ContentExperience.class);
		i.putExtra("item_title", exp.getTitle());
		i.putExtra("item_date", exp.getPeriod());
		i.putExtra("item_place", exp.getPlace());
		i.putExtra("item_content", exp.getContent());
		i.putExtra("item_country", exp.getCountry());
		i.putStringArrayListExtra("item_skills", exp.getSkills());
		i.putExtra("item_type", exp.getTypeExperience());
		i.putExtra("item_id", exp.getId());
		context.startActivity(i);
		
		
	}
	
	
	public ItemListExperience getItemFromList(int position){
		return experiences.get(position);
	}

}
