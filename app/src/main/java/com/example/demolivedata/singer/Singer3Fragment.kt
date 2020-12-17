package com.example.demolivedata.singer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.demolivedata.R

class Singer3Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_singer3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(requireParentFragment())[SingerViewModel::class.java]

        view.findViewById<Button>(R.id.btnShow).setOnClickListener {
            viewModel.showToast()
        }

        viewModel.showToast.observe(viewLifecycleOwner, {
            Toast.makeText(requireContext(), "show", Toast.LENGTH_SHORT).show()
        })
    }
}