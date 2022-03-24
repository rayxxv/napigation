package com.example.challenge3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.challenge3.databinding.FragmentKetigaBinding
import com.sennohananto.intent.EpParcelable

class FragmentKetiga : Fragment() {
    private var _binding: FragmentKetigaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentKetigaBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val aName = arguments?.getString(FragmentKedua.EXTRA_NAME)
        val model = arguments?.getParcelable<EpParcelable>(FragmentKeempat.POTENSIAL)

        if (aName != null){
            binding.tvEP.visibility = View.GONE
            binding.tvGravitasi.visibility = View.GONE
            binding.tvMassa.visibility = View.GONE
            binding.tvTinggi.visibility = View.GONE
            binding.tvName.text = "Selamat Datang $aName"
        }
        else{
           val energiPotensial = model?.massa.toString().toInt() * model?.gravitasi.toString().toInt() * model?.tinggi.toString().toInt()
            binding.tvName.visibility = View.GONE
            binding.btnToScreen4.visibility = View.GONE
            binding.tvMassa.text = "Nilai Massa Input = ${model?.massa}"
            binding.tvGravitasi.text = "Nilai Gravitasi Input = ${model?.gravitasi}"
            binding.tvTinggi.text = "Nilai Tinggi Input = ${model?.tinggi}"
            binding.tvEP.text = "Nilai Energi Potensial = $energiPotensial"

        }
        binding.btnToScreen4.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentKetiga_to_fragmentKeempat)
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}