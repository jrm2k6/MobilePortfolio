package src.mp;

import java.util.ArrayList;

import org.w3c.dom.Text;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentExperience extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.experience_detail);
		TextView tvTitle = (TextView) findViewById(R.id.tv_title_experience_content);
		TextView tvPeriod = (TextView) findViewById(R.id.tv_date_experience_content);
		TextView tvPlace = (TextView) findViewById(R.id.tv_place_experience_content);
		TextView tvCity = (TextView) findViewById(R.id.tv_city_experience_content);
		TextView tvBodyContent = (TextView)findViewById(R.id.tv_body_content_experience);
		TextView tvSkills = (TextView) findViewById(R.id.tv_skills_list_content_experience);
		/***
		 * Style with band at the top and bottom of the view
		 */
		TextView tvHeaderView = (TextView) findViewById(R.id.tv_band_top);
		TextView tvFooterView = (TextView) findViewById(R.id.tv_band_bottom);
		ImageView ivLogo = (ImageView)findViewById(R.id.iv_logo_company);
 		String itemTitle = this.getIntent().getStringExtra("item_title");
		String itemPlace = this.getIntent().getStringExtra("item_place");
		String itemCountry = this.getIntent().getStringExtra("item_country");
		String itemPeriod = this.getIntent().getStringExtra("item_date");
		String itemContent = this.getIntent().getStringExtra("item_content");
		ArrayList<String> skills = this.getIntent().getStringArrayListExtra("item_skills");
		int itemType = this.getIntent().getIntExtra("item_type",1000);
		int itemId = this.getIntent().getIntExtra("item_id", 1000);
		tvTitle.setText(itemTitle);
		tvBodyContent.setText(itemContent);
		tvCity.setText(itemCountry);
		tvPlace.setText(itemPlace);
		tvPeriod.setText(itemPeriod);
		String usedSkills = "";
		for(String s : skills) usedSkills = usedSkills+" "+s+"\n";
		tvSkills.setText(usedSkills);
		
		switch (itemType) {
		case 1:
			tvFooterView.setBackgroundColor(Color.RED);
			tvHeaderView.setBackgroundColor(Color.RED);
			break;
		case 2:
			tvFooterView.setBackgroundColor(Color.parseColor("#CD6600"));
			tvHeaderView.setBackgroundColor(Color.parseColor("#CD6600"));
			break;
		case 3:
			tvFooterView.setBackgroundColor(Color.GREEN);
			tvHeaderView.setBackgroundColor(Color.GREEN);
			break;
		default:
			break;
		}
		
		switch (itemId){
		case 1:
			ivLogo.setBackgroundResource(R.drawable.ucsc);
			break;
		case 2:
			ivLogo.setBackgroundResource(R.drawable.fizians);
			break;
		case 3:
			//ivLogo.setBackgroundResource(R.drawable.arcantique);
			break;
		case 4:
			ivLogo.setBackgroundResource(R.drawable.pdn);
			break;
		case 5:
			//ivLogo.setBackgroundResource(R.drawable.jurisoft);
			break;
		case 6:
			ivLogo.setBackgroundResource(R.drawable.shoppingday);
			break;
		default:
			
			break;
		}
		
		
		
		
	}
}