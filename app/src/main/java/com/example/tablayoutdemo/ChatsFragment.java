package com.example.tablayoutdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tablayoutdemo.Adapter.UserAdapter;
import com.example.tablayoutdemo.Model.User;
import com.example.tablayoutdemo.databinding.FragmentChatsBinding;


import java.util.ArrayList;
import java.util.List;

public class ChatsFragment extends Fragment {
private FragmentChatsBinding binding;
private RecyclerView recyclerViewRB;
List<User> userList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentChatsBinding.inflate(inflater,container,false);

        View view=binding.getRoot();
        recyclerViewRB=view.findViewById(R.id.recyclerView);
        userList=new ArrayList<>();

            User user = new User();
            user.setProfile(R.drawable.babu);
            user.setMessage("Hii");
            user.setName("Babu");
            user.setArrow(R.drawable.arowtick);
            user.setTime("10:20 am");
            userList.add(user);

        User user1 = new User();
        user1.setProfile(R.drawable.alexa);
        user1.setMessage("Hii Alexa");
        user1.setName("Alexa");
        user1.setArrow(R.drawable.doublecheck);
        user1.setTime("01:20 pm");
        userList.add(user1);

        User user2 = new User();
        user2.setProfile(R.drawable.sunanda);
        user2.setMessage("kya kr rhe ho");
        user2.setName("Archana");
        user2.setArrow(R.drawable.doublecheck);
        user2.setTime("12:20 pm");
        userList.add(user2);

        User user3 = new User();
        user3.setProfile(R.drawable.vidya);
        user3.setMessage("Im am good");
        user3.setName("Vidya");
        user3.setArrow(R.drawable.arowtick);
        user3.setTime("04:20 am");
        userList.add(user3);

        User user4= new User();
        user4.setProfile(R.drawable.radhika);
        user4.setMessage("Hello");
        user4.setName("Shivani");
        user4.setArrow(R.drawable.doublecheck);
        user4.setTime("10:20 am");
        userList.add(user4);

        User user5 = new User();
        user5.setProfile(R.drawable.jinifer);
        user5.setMessage("Hii jenifer");
        user5.setName("Jenifer");
        user5.setArrow(R.drawable.arowtick);
        user5.setTime("04:20 pm");
        userList.add(user5);

        UserAdapter userAdapter=new UserAdapter(userList);
        recyclerViewRB.setHasFixedSize(true);
        recyclerViewRB.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewRB.setAdapter(userAdapter);



        return view;
    }
}