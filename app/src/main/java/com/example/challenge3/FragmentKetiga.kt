package com.example.challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.challenge3.databinding.FragmentKeduaBinding

class FragmentKetiga : Fragment() {
    var _binding: FragmentKeduaBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ketiga, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val aName = arguments?.getString(FragmentKedua.EXTRA_NAME)
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}