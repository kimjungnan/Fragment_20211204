package com.neppplus.fragment_20211204.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.neppplus.fragment_20211204.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragemnt : Fragment() {

//    xml을 연결해주는 역할만 담당
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)

        return inflater.inflate(R.layout.fragment_first, container, false)


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnToast.setOnClickListener {

            Toast.makeText(requireContext(), "토스트 띄우기", Toast.LENGTH_SHORT).show()
            //Log.d("프래그먼트", "프래그먼트 로그")

        }

    }


}