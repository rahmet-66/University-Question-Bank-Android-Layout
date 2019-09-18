package io.github.universityquestionbank;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.nic.annauniversity2marks.R;

public class CseReg13sem1Subs extends Fragment {

    public CseReg13sem1Subs(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view, container,false);

        ListView subLiatView = view.findViewById(R.id.listView);


        return view;
    }
}
