package com.example.demolivedata.swichMap

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.demolivedata.R
import kotlin.random.Random


class SwitchMapFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(this)[SwitchMapViewModel::class.java]
        val textView = view.findViewById<TextView>(R.id.text3)

        view.findViewById<Button>(R.id.btUpdate).setOnClickListener {
            val random = Random.nextInt(0,500)
            viewModel.setUserId(User(idUser = random))
        }

        viewModel.liveData.observe(viewLifecycleOwner, {
            textView.text = it.toString()
        })


    }
}