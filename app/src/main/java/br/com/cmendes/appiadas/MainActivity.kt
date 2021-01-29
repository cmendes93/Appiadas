package br.com.cmendes.appiadas

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showJoker()
        btTellJoker.setOnClickListener(){
            showJoker()
        }
    }

    fun showJoker(){
        val jokers  = resources.getStringArray(R.array.jokers)
        val numberJokers : Int = Random().nextInt(jokers.size)
        tvJoker.text = jokers[numberJokers]
        playSong()
    }

    private fun playSong(){
        val mediaPlayer = MediaPlayer.create(this,R.raw.badumtss)
        mediaPlayer.start()
    }
}