package com.example.test3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class OnlinePlayer extends AppCompatActivity  {
    int position=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_online_player2);

        String a[]={"https://firebasestorage.googleapis.com/v0/b/the-rolling-stone.appspot.com/o/Badnam.mp3?alt=media&token=ec270466-e92d-456e-bf48-fc603cab79d7",
                "https://firebasestorage.googleapis.com/v0/b/the-rolling-stone.appspot.com/o/BurjKhalifa%20-%20Laxmmi%20Bomb.mp3?alt=media&token=9a795aa7-c74c-42ce-aac0-3d685e21372c",
                "https://firebasestorage.googleapis.com/v0/b/the-rolling-stone.appspot.com/o/Despacito_320(PaglaSongs).mp3?alt=media&token=30466a66-b2c5-414f-8631-f724ab8421c5",
                "https://firebasestorage.googleapis.com/v0/b/the-rolling-stone.appspot.com/o/Dynamite%20-%20BTS.mp3?alt=media&token=76400a09-061e-487d-8dbb-6c36a658e2ee",
                "https://firebasestorage.googleapis.com/v0/b/the-rolling-stone.appspot.com/o/Life-Goes-On_BTS_OpraDre.com_.mp3?alt=media&token=19d23995-1419-44d4-b148-48cadc8a049f",
                "https://firebasestorage.googleapis.com/v0/b/the-rolling-stone.appspot.com/o/Naach%20Meri%20Rani%20-%20Guru%20Randhawa%20320%20Kbps.mp3?alt=media&token=f40e0ff8-672f-41a8-8502-db4326469c9b",
                "https://firebasestorage.googleapis.com/v0/b/the-rolling-stone.appspot.com/o/Shape%20of%20You%20Mp3%20Ed%20Sheeran.mp3?alt=media&token=d3ad16c0-f3c0-4d81-9555-d6e4de9bbe82",
                "https://firebasestorage.googleapis.com/v0/b/the-rolling-stone.appspot.com/o/The_Chainsmokers_Coldplay_-_Something_Just_Like_This.mp3?alt=media&token=7ca3639f-1aac-473c-bd46-e51905c9b02f",
                "https://firebasestorage.googleapis.com/v0/b/the-rolling-stone.appspot.com/o/Teri%20Mitti%20-%20Kesari.mp3?alt=media&token=55022685-b88a-4ac0-b0d0-84f34ce19ce4",
                "https://firebasestorage.googleapis.com/v0/b/the-rolling-stone.appspot.com/o/Akeboshi-Wind-(mp3ost.wapkiz.com).mp3?alt=media&token=3f2811f0-ddd9-4a36-9b31-5cf9e7e234c8"};

        String[] names = {"Badnam", "Burjkhalifa", "Despacito", "Dynamite", "LifeGoesOn",
                "NaachmeriRani", "ShapeOfYou", "SomethingJustLikeThis", "TeriMitti", "Wind"};





        //Log.isLoggable(TAG,position);


        JcPlayerView jcPlayerView=findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        for(int i=0;i<=9;i++) {
            jcAudios.add(JcAudio.createFromURL(names[i],a[i]));
        }


        jcPlayerView.initPlaylist(jcAudios, null);
        jcPlayerView.createNotification();




       /* switch (position){
            case "Badnam"://{jcPlayerView.playAudio(JcAudio.createFromURL("","https://firebasestorage.googleapis.com/v0/b/the-rolling-stone.appspot.com/o/Badnam.mp3?alt=media&token=ec270466-e92d-456e-bf48-fc603cab79d7"));





            case "Burjkhalifa":


            case "Despacito":{try{
            mediaPlayer.setDataSource(a[2]);
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });
            mediaPlayer.prepare();} catch (IOException e){e.printStackTrace();}}
            case "Dynamite":{
            try{
                mediaPlayer.setDataSource(a[3]);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });
                mediaPlayer.prepare();} catch (IOException e){e.printStackTrace();}
        }

            case "LifeGoesOn":{try{
                mediaPlayer.setDataSource(a[4]);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });
                mediaPlayer.prepare();} catch (IOException e){e.printStackTrace();}}

            case "NaachmeriRani":{try{
                mediaPlayer.setDataSource(a[5]);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });
                mediaPlayer.prepare();} catch (IOException e){e.printStackTrace();}}





            case  "ShapeOfYou":{try{
                mediaPlayer.setDataSource(a[6]);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });
                mediaPlayer.prepare();} catch (IOException e){e.printStackTrace();}}

            case  "SomethingJustLikeThis":{try{
                mediaPlayer.setDataSource(a[7]);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });
                mediaPlayer.prepare();} catch (IOException e){e.printStackTrace();}}
            case"TeriMitti":{try{
                mediaPlayer.setDataSource(a[8]);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });
                mediaPlayer.prepare();} catch (IOException e){e.printStackTrace();}}
            case "Wind":{try{
                mediaPlayer.setDataSource(a[9]);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });
                mediaPlayer.prepare();} catch (IOException e){e.printStackTrace();}}



        }*/
        jcPlayerView.initPlaylist(jcAudios, null);



    }
}