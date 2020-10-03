package datnguyen.ute.oldmarket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SubjectAdapter extends BaseAdapter {
    private Context context;
    private int layout ;
    private List<Subject> subjectList;

    public SubjectAdapter(Context context, int layout, List<Subject> subjectList) {
        this.context = context;
        this.layout = layout;
        this.subjectList = subjectList;
    }

    @Override
    public int getCount() {
        return subjectList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout, null);
        TextView textViewSubjectName = (TextView) convertView.findViewById(R.id.txtSubjectName);
        TextView textViewMark = (TextView) convertView.findViewById(R.id.txtMark);
        ImageView imgSubject = (ImageView) convertView.findViewById(R.id.imgSubject);

        Subject subject = subjectList.get(position);

        textViewSubjectName.setText(subject.getNameSubject());
        textViewMark.setText(subject.getMark());
        imgSubject.setImageResource(subject.getImg());


        return convertView;
    }
}
