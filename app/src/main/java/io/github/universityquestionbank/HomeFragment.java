package io.github.universityquestionbank;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.nic.annauniversity2marks.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("University Question Bank");

        android.support.v7.widget.GridLayout gridLayout = view.findViewById(R.id.gridLayout);

        setSingleEvent(gridLayout);

        return view;
    }

    public void onBackPressed()
    {
        // add code in super class when override
    }

    private void setSingleEvent(android.support.v7.widget.GridLayout gridLayout) {

        for (int i = 0; i < gridLayout.getChildCount(); i++) {

            CardView cardView = (CardView) gridLayout.getChildAt(i);
            final int finali = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    switch (finali) {

                        case (0):

                            CseFragmentReg13 cseFragmentReg13 = new CseFragmentReg13();
                            android.support.v4.app.FragmentTransaction fragmentTransaction =
                                    getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, cseFragmentReg13, null).addToBackStack(null);
                            fragmentTransaction.commit();

                            break;

                        case (1):
                            Toast.makeText(getContext(), "its working #1", Toast.LENGTH_SHORT).show();
                            break;

                        case (2):
                            Toast.makeText(getContext(), "its working #2", Toast.LENGTH_SHORT).show();
                            break;

                        case (3): //CSE

                            RegulationFragment regulationFragment = new RegulationFragment();
                            android.support.v4.app.FragmentTransaction fragmentTransaction1 =
                                    getFragmentManager().beginTransaction();
                            fragmentTransaction1.replace(R.id.fragment_container,regulationFragment,null).addToBackStack(null);
                            fragmentTransaction1.commit();

                            break;

                        case (4):
                            Toast.makeText(getContext(), "its working #4", Toast.LENGTH_SHORT).show();
                            break;

                        case (5):
                            Toast.makeText(getContext(), "its working #5", Toast.LENGTH_SHORT).show();
                            break;

                        case (6):
                            Toast.makeText(getContext(), "its working #6", Toast.LENGTH_SHORT).show();
                            break;

                        case (7):
                            Toast.makeText(getContext(), "its working #7", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            });
        }
    }



}
