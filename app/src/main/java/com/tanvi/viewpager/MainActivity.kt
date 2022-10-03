package com.tanvi.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var iv1: ImageView
    private lateinit var iv2: ImageView
    private lateinit var iv3: ImageView
    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iv1 = findViewById(R.id.iv1)
        iv2 = findViewById(R.id.iv2)
        iv3 = findViewById(R.id.iv3)
        viewPager2 = findViewById(R.id.view_pager2)
        val images = listOf(R.drawable.img_1, R.drawable.img_2, R.drawable.img_2)
        val adapterClass = ViewPagerAdapterClass(images)
        viewPager2.adapter = adapterClass
        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {

            override fun onPageScrollStateChanged(state: Int) {
                changeColor()
                super.onPageScrollStateChanged(state)
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                changeColor()
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }
        })
    }

    fun changeColor()
    {
        when (viewPager2.currentItem) {
            0->
            {
            iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.teal_700))
            iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
            iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
        }
            1->
            {    // kro lo kam byrok byee
                iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.teal_700))
                iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
            }
            2->
            {
                iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.teal_700))
            }
    }
}
    }
