package com.example.store;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import category.CategoryAdapter;


public class HomeFragment extends Fragment {
//    private static Context context;
private RecyclerView rcvCategory;
private CategoryAdapter categoryAdapter ;

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);


//        rcvCategory =findViewById(R.id.rcv_category);


//        HomeFragment.context = getApplicationContext();
//
//        VideoView videoView = videoView.findViewById(R.id.video_view);
//        String videoPath = "android.resource://" + context.getPackageName() + "/" + R.raw.video;
//        Uri uri = Uri.parse(videoPath);
//        videoView.setVideoURI(uri);
//
//
//        MediaController mediaController = new MediaController(this);
//        videoView.setMediaController(mediaController);
//        mediaController.setAnchorView(videoView);
//
//    }
//
//public  static Context getApplicationContext(){
//        return HomeFragment.context;
}

}
