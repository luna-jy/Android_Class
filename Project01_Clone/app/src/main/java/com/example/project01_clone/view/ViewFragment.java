package com.example.project01_clone.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.example.project01_clone.R;
import com.example.project01_clone.common.CommonMethod;
import com.google.android.material.tabs.TabLayout;

public class ViewFragment extends Fragment {
    TabLayout tab_layout;
    RecyclerView recv_view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // ViewFragment를 붙임.
        View v = inflater.inflate(R.layout.fragment_view, container, false);
        tab_layout = v.findViewById(R.id.tab_layout);

        tab_layout.addTab(tab_layout.newTab().setText("My뷰"));
        tab_layout.addTab(tab_layout.newTab().setText("발견"));
        tab_layout.addTab(tab_layout.newTab().setText("카카오TV"));
        tab_layout.addTab(tab_layout.newTab().setText("코로나"));
        tab_layout.addTab(tab_layout.newTab().setText("잔여백신"));


        //탭이 선택/선택되지않았을때/재선택되었을때 에 대한 이벤트 생성
        tab_layout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.d("로그", "onTabSelected: "+tab.getPosition());
                //id를 부여 x, 탭이 가지고 있는 글자 또는 포지션으로 구분을 해서 사용

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        
        
        

        recv_view = v.findViewById(R.id.recv_view);
        recv_view.setLayoutManager(CommonMethod.getManager(getContext())); //메소드 호출함


        //Adapter나 모양은 직접 구현해야함.
        recv_view.setAdapter(new ViewAdapter(inflater));



        return v;


    }
}