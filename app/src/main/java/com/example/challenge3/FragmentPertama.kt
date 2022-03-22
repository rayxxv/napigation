package com.example.challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.challenge3.databinding.FragmentPertamaBinding


class FragmentPertama : Fragment() {
    var _binding: FragmentPertamaBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPertamaBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnToScreen2.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragmentPertama_to_fragmentKedua2)
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }




}