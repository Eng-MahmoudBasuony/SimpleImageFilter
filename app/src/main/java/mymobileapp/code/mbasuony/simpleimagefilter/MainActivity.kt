package mymobileapp.code.mbasuony.simpleimagefilter

import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //---Save Different Color in Array
        val arrayColorForImage= arrayOf(Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,Color.MAGENTA,Color.DKGRAY,Color.RED)
        val mode= arrayOf(PorterDuff.Mode.ADD,PorterDuff.Mode.CLEAR,PorterDuff.Mode.DARKEN,
                                                                       PorterDuff.Mode.DST,PorterDuff.Mode.DST_ATOP,PorterDuff.Mode.DST_IN,
                                                                       PorterDuff.Mode.XOR,PorterDuff.Mode.MULTIPLY,PorterDuff.Mode.DST_OVER,PorterDuff.Mode.SRC_ATOP)

        //-----------Event-------------//
        imageTest.setOnClickListener(
            {
                imageTest.setColorFilter(arrayColorForImage[getRandome(arrayColorForImage.size-1)], mode[getRandome(mode.size)]) //
            })
    }


    fun getRandome(arraySize:Int):Int
    {
           var randomNumber=Random().nextInt(arraySize) //Generate Number From 0 to randomNumber

        return randomNumber
    }





}
