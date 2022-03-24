package com.example.challenge3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.challenge3.databinding.FragmentPertamaBinding


class FragmentPertama : Fragment() {
    private var _binding: FragmentPertamaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPertamaBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnToScreen2.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentPertama_to_fragmentKedua2)
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }




}