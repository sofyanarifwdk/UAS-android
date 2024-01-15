package com.example.belajarandroid;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.PlayerView;

public class MovieDetail extends AppCompatActivity {

    ExoPlayer playerVideo;
    // Ubah nama video sesuai dengan yang ada di folder res/raw
    final String videoResourceName = "aksi1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        PlayerView player = findViewById(R.id.player);
        playerVideo = new ExoPlayer.Builder(this).build();
        player.setPlayer(playerVideo);

        // Buat Uri untuk merujuk ke video di folder raw
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/raw/" + videoResourceName);

        MediaItem mediaItem = MediaItem.fromUri(videoUri);
        playerVideo.setMediaItem(mediaItem);
        playerVideo.prepare();
        playerVideo.setPlayWhenReady(true);
    }

    @Override
    protected void onStop() {
        super.onStop();
        playerVideo.setPlayWhenReady(false);
        playerVideo.release();
        playerVideo = null;
    }
}
