package com.mostafadev.shoeappfirstsubmission.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.mostafadev.shoeappfirstsubmission.R
import com.mostafadev.shoeappfirstsubmission.databinding.FragmentShoeDetailsBinding
import com.mostafadev.shoeappfirstsubmission.model.Shoe
import com.mostafadev.shoeappfirstsubmission.viewmodel.ShoeViewModel

class ShoeDetailsFragment : Fragment() {
    private lateinit var binding: FragmentShoeDetailsBinding
    lateinit var dataFromViewModel: ShoeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_details, container, false)

        binding.listDetailsShoe = Shoe()

        dataFromViewModel = ViewModelProvider(requireActivity())[ShoeViewModel::class.java]

        binding.saveButton.setOnClickListener { view: View ->
            saveShoeDetails()

        }

        binding.cancelBtnDetails.setOnClickListener { view: View ->
            findNavController().navigateUp()

        }


        return binding.root
    }

    private fun saveShoeDetails() {


        val bindingData = binding.listDetailsShoe
        val name = bindingData?.name.toString()
        val size = bindingData?.size.toString()
        val company = bindingData?.company.toString()
        val description = bindingData?.description.toString()


        if (name.isEmpty() || size.isEmpty() || company.isEmpty() || description.isEmpty()) {

            Toast.makeText(context, "Please Fill The Empty Fields", Toast.LENGTH_SHORT).show()
        } else {
            dataFromViewModel.onSave("Name: $name", "Company: $company", "Size: $size", "Description: $description")

            findNavController().navigate(R.id.action_shoeDetailsFragment_to_shoeListFragment)
            Toast.makeText(context, "Saved", Toast.LENGTH_SHORT).show()

        }


    }


}