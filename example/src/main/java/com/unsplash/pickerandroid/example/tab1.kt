package com.unsplash.pickerandroid.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.unsplash.pickerandroid.photopicker.presentation.UnsplashPickerActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.tab1.*

class tab1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        tab1_recycler_view.setHasFixedSize(true)
//        tab1_recycler_view.itemAnimator = null
//        tab1_recycler_view.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
//        var mAdapter: PhotoAdapter = PhotoAdapter(this.requireContext())
//        main_recycler_view.adapter = mAdapter
        // on the pick button click, we start the library picker activity
        // we are expecting a result from it so we start it for result
//        main_pick_button.setOnClickListener {
        startActivityForResult(
            UnsplashPickerActivity.getStartingIntent(
                this.requireContext(),
                true
//                    !main_single_radio_button.isChecked
            ), tab1.REQUEST_CODE
        )


//        }
        return inflater!!.inflate(R.layout.tab1, container, false)
    }


    companion object {
        // dummy request code to identify the request
        const val REQUEST_CODE = 123
    }
}// Required empty public constructor