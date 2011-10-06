package src.mp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class EducationListAdapter extends ArrayAdapter<ItemListEducation> {

	public EducationListAdapter(Context context, int textViewResourceId) {
		super(context, textViewResourceId);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View resultView = convertView;
		ItemListEducation currentItem = getItem(position);
		if(convertView==null){
			resultView = LayoutInflater.from(getContext()).inflate(R.layout.row_education_list, parent,false);
		}
			TextView tvNameSchool = (TextView) resultView.findViewById(R.id.tv_education_name_school);
			TextView tvBeginYear = (TextView) resultView.findViewById(R.id.tv_school_begin);
			TextView tvEndYear = (TextView) resultView.findViewById(R.id.tv_school_end);
			TextView tvCitySchool = (TextView) resultView.findViewById(R.id.tv_education_city);
			TextView tvCountrySchool = (TextView) resultView.findViewById(R.id.tv_education_country);
			TextView tvMajorSchool = (TextView) resultView.findViewById(R.id.tv_education_major);
			TextView tvDegreeSchool = (TextView) resultView.findViewById(R.id.tv_education_degree);
			ImageView ivLogoSchool = (ImageView) resultView.findViewById(R.id.iv_education_logo);
			
			tvNameSchool.setText(currentItem.getNameSchool());
			tvBeginYear.setText(String.valueOf(currentItem.getBegin()));
			tvEndYear.setText(String.valueOf(currentItem.getEnd()));
			tvCitySchool.setText(currentItem.getCity());
			tvCountrySchool.setText(currentItem.getCountry());
			tvDegreeSchool.setText(currentItem.getDegree());
			tvMajorSchool.setText(currentItem.getMajor());
			ivLogoSchool.setBackgroundDrawable(new BitmapDrawable(makeThumbnail(currentItem.getImgSchool())));
		
		return resultView;
	}
	
	public Bitmap makeThumbnail(Drawable d){
        int newWidth = 240;
        int newHeight =60;
        
        Bitmap bitmapOrg = ((BitmapDrawable) d).getBitmap();
        int width = bitmapOrg.getWidth();
        int height = bitmapOrg.getHeight();
        float scaleWidth = ((float)newWidth)/width;
        float scaleHeight = ((float)newHeight)/height;

        Matrix matrix = new Matrix();
        matrix.postScale(scaleWidth, scaleHeight);
        Bitmap bmpResized = Bitmap.createBitmap(bitmapOrg, 0, 0, width, height, matrix, true);
        BitmapDrawable btmp = new BitmapDrawable(bmpResized);
        bmpResized = btmp.getBitmap();
        return bmpResized;

}


}
