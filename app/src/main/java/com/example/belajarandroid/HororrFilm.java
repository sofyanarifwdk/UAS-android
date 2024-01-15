
package com.example.belajarandroid;
        import androidx.appcompat.app.AppCompatActivity;

        import android.net.Uri;
        import android.os.Bundle;

        import com.google.android.exoplayer2.ExoPlayer;
        import com.google.android.exoplayer2.MediaItem;
        import com.google.android.exoplayer2.ui.PlayerView;

public class HororrFilm extends AppCompatActivity {



    ExoPlayer playerVideo;
    // Ubah nama video sesuai dengan yang ada di folder res/raw
    final String videoResourceName = "horror1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hororr_film);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        PlayerView player = findViewById(R.id.playerHorror);
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

