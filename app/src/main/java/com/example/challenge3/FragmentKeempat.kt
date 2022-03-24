package com.example.challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.challenge3.databinding.FragmentKeempatBinding
import com.example.challenge3.databinding.FragmentKetigaBinding
import com.sennohananto.intent.EpParcelable


class FragmentKeempat : Fragment() {

    var _binding: FragmentKeempatBinding? = null
    val binding get() = _binding!!

    companion object{
        const val POTENSIAL = "POTENSIAL"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKeempatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBackScreen3.setOnClickListener{
            if (binding.etMassa.text.isNullOrEmpty() || binding.etGravitasi.text.isNullOrEmpty() || binding.etTinggi.text.isNullOrEmpty()){
                Toast.makeText(requireContext(), "Ada Kolom Yang Kosong", Toast.LENGTH_SHORT).show()
            }
            else {
                val massa = binding.etMassa.text.toString().toInt()
                val gravitasi = binding.etGravitasi.text.toString().toInt()
                val tinggi = binding.etTinggi.text.toString().toInt()
                val potensial = EpParcelable(massa, gravitasi, tinggi)
                val value = Bundle().apply {
                    putParcelable(POTENSIAL, potensial)
                }
                findNavController().navigate(R.id.action_fragmentKeempat_to_fragmentKetiga, value)
            }

        }

    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}