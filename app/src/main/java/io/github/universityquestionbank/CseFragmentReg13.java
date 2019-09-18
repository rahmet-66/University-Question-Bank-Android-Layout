package io.github.universityquestionbank;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.nic.annauniversity2marks.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CseFragmentReg13 extends Fragment {


    public CseFragmentReg13() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.list_view, container, false);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("CSE");

        ListView semesterListView = view.findViewById(R.id.listView);

        ArrayList<String> semesterNumber = new ArrayList<>();
        semesterNumber.add("Semester 1");
        semesterNumber.add("Semester 2");
        semesterNumber.add("Semester 3");
        semesterNumber.add("Semester 4");
        semesterNumber.add("Semester 5");
        semesterNumber.add("Semester 6");
        semesterNumber.add("Semester 7");
        semesterNumber.add("Semester 8");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(), R.layout.sem_list_text, semesterNumber);

        semesterListView.setAdapter(arrayAdapter);

        semesterListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

             switch (i){

                 case 0:
                     Toast.makeText(getContext(),"Its working at" + i,Toast.LENGTH_SHORT).show();
                    break;

                 case 1:
                     Toast.makeText(getContext(),"Its working at" + i,Toast.LENGTH_SHORT).show();
                     break;

                 case 2:
                     Toast.makeText(getContext(),"Its working at" + i,Toast.LENGTH_SHORT).show();
                     break;
                 case 3:
                     Toast.makeText(getContext(),"Its working at" + i,Toast.LENGTH_SHORT).show();
                     break;
                 case 4:
                     Toast.makeText(getContext(),"Its working at" + i,Toast.LENGTH_SHORT).show();
                     break;
                 case 5:
                     Toast.makeText(getContext(),"Its working at" + i,Toast.LENGTH_SHORT).show();
                     break;

                 case 6:
                     Toast.makeText(getContext(),"Its working at" + i,Toast.LENGTH_SHORT).show();
                     break;

                 case 7:
                     Toast.makeText(getContext(),"Its working at" + i,Toast.LENGTH_SHORT).show();
                     break;
             }

            }
        });

        return view;
    }




    }


