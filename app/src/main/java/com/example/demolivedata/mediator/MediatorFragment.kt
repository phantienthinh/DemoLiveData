package com.example.demolivedata.mediator

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

class MediatorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mediator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(this)[MediatorViewModel::class.java]

        val textView = view.findViewById<TextView>(R.id.tvData)

        viewModel.liveDataMerger.observe(viewLifecycleOwner, {
            textView.text = it
        })

        view.findViewById<Button>(R.id.bt11).setOnClickListener {
            viewModel.updateLiveData1()
        }
        view.findViewById<Button>(R.id.bt22).setOnClickListener {
            viewModel.updateLiveData2()
        }
    }
}