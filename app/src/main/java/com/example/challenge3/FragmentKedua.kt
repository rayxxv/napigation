package com.example.challenge3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.challenge3.databinding.FragmentKeduaBinding


class FragmentKedua : Fragment() {

    private var _binding: FragmentKeduaBinding? = null
    private val binding get() = _binding!!
    val name = binding.etNama.text.toString()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentKeduaBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnToScreen3.setOnClickListener {

            if (binding.etNama.text.isNullOrEmpty()) {
                Toast.makeText(context, "Harap Masukan Nama Anda!", Toast.LENGTH_SHORT).show()
            } else {
                val action = FragmentKeduaDirections.actionFragmentKedua2ToFragmentKetiga(name)
                findNavController().navigate(action)
            }

        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}