package com.hdev.androidxylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int NR_OF_SIMULTANEOUS_SOUNDS =7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(7, AudioManager.STREAM_MUSIC,0);
        //whenever you create a soundPoll you have give maxStream ,streamType,and srcQuality.

        //Create sound ids.
        //load/assign the sound into it.
        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);

    /**
     * to play a sound using sound fool this...
     *
     * public final int play (int soundID,
     *                 float leftVolume,
     *                 float rightVolume,
     *                 int priority,
     *                 int loop,
     *                 float rate)
     *
     */

    }
    public void playC(View v){
        Log.d("Xylophone","Red button Clicked..!");
        //created constants use in here.
        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playD(View v){
        Log.d("Xylophone","orange button Clicked..!");
        mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playE(View v){
        Log.d("Xylophone","yellow button Clicked..!");
        mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playF(View v){
        Log.d("Xylophone","turquoise button Clicked..!");
        mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playG(View v){
        Log.d("Xylophone","green button Clicked..!");
        mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playA(View v){
        Log.d("Xylophone","blue button Clicked..!");
        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playB(View v){
        Log.d("Xylophone","purple button Clicked..!");
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
}
