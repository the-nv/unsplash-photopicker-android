package com.unsplash.pickerandroid.example

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.unsplash.pickerandroid.photopicker.data.UnsplashPhoto
import com.unsplash.pickerandroid.photopicker.presentation.UnsplashPickerActivity
import kotlinx.android.synthetic.main.activity_main.*
//"
class MainActivity : AppCompatActivity() {

    private lateinit var mAdapter: PhotoAdapter
    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        viewPager = findViewById<ViewPager>(R.id.viewPager)

        tabLayout!!.addTab(tabLayout!!.newTab().setText("1234"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("ABCD"))
        tabLayout!!.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = MyAdapter(this, supportFragmentManager, tabLayout!!.tabCount)
        viewPager!!.adapter = adapter

        viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager!!.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

        // result adapter
        // recycler view configuration
//        main_recycler_view.setHasFixedSize(true)
//        main_recycler_view.itemAnimator = null
//        main_recycler_view.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
//        mAdapter = PhotoAdapter(this)
//        main_recycler_view.adapter = mAdapter
//        // on the pick button click, we start the library picker activity
//        // we are expecting a result from it so we start it for result
////        main_pick_button.setOnClickListener {
//            startActivityForResult(
//                UnsplashPickerActivity.getStartingIntent(
//                    this,
//                    true
////                    !main_single_radio_button.isChecked
//                ), REQUEST_CODE
//            )
//        }


    }

    /*
    here we are receiving the result from the picker activity
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)
    if (resultCode == Activity.RESULT_OK && requestCode == REQUEST_CODE) {
    // getting the photos
    val photos: ArrayList<UnsplashPhoto>? = data?.getParcelableArrayListExtra(UnsplashPickerActivity.EXTRA_PHOTOS)
    // showing the preview
    mAdapter.setListOfPhotos(photos)
    // telling the user how many have been selected
    Toast.makeText(this, "number of selected photos: " + photos?.size, Toast.LENGTH_SHORT).show()
    }
    }
    */

//    companion object {
//        // dummy request code to identify the request
//        const val REQUEST_CODE = 123
//    }
}
