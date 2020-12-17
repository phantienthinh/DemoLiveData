package com.example.demolivedata.LiveDataDefault

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.demolivedata.R

class LiveDataDefaultFragment : Fragment() {
    private lateinit var viewModel: DemoViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_live_data_default_fragmet, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textView = view.findViewById<TextView>(R.id.text)
        viewModel = ViewModelProvider(this)[DemoViewModel::class.java]

        viewModel.currentNumber.observe(viewLifecycleOwner, {
            textView.text = it
        })
    }
}