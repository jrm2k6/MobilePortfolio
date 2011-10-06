package src.mp;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ExperienceListAdapter extends ArrayAdapter<ItemListExperience> {

	public ExperienceListAdapter(Context context, int textViewResourceId) {
		super(context, textViewResourceId);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		View resultView = convertView;
		ItemListExperience curreentItem = getItem(position);
		Log.i("check type internship", String.valueOf(curreentItem.getId()));
		if(convertView == null){
			resultView =  LayoutInflater.from(getContext()).inflate(R.layout.row_experience_list, parent, false);
			
		}
		
		ImageView typeExperience = (ImageView) resultView.findViewById(R.id.iv_type_experience_in_list_experience);
		TextView titleExperience = (TextView) resultView.findViewById(R.id.tv_item_experience_description);
		TextView placeExperience = (TextView) resultView.findViewById(R.id.tv_item_experience_place);
		titleExperience.setText(curreentItem.getTitle());
		placeExperience.setText(curreentItem.getPlace());
		
		switch (curreentItem.getTypeExperience()) {
		case 1:
			typeExperience.setImageBitmap(BitmapFactory.decodeResource(this.getContext().getResources(), R.drawable.type_internship));
			break;
		case 2:
			typeExperience.setImageBitmap(BitmapFactory.decodeResource(this.getContext().getResources(), R.drawable.type_school));
			break;
		case 3:
			typeExperience.setImageBitmap(BitmapFactory.decodeResource(this.getContext().getResources(), R.drawable.type_personal));
			break;

		default:
			break;
		}
		return resultView;
	}

}
