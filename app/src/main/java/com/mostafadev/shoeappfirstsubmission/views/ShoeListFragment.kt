package com.mostafadev.shoeappfirstsubmission.views

import android.os.Bundle
import android.view.*
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.mostafadev.shoeappfirstsubmission.R
import com.mostafadev.shoeappfirstsubmission.databinding.FragmentShoeListBinding
import com.mostafadev.shoeappfirstsubmission.databinding.ListViewBinding
import com.mostafadev.shoeappfirstsubmission.model.Shoe
import com.mostafadev.shoeappfirstsubmission.viewmodel.ShoeViewModel


class ShoeListFragment : Fragment() {
    private lateinit var _binding: FragmentShoeListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
                // Inflate the layout for this fragment
         _binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)
        setHasOptionsMenu(true)
        val viewModel = ViewModelProvider(requireActivity())[ShoeViewModel::class.java]

        viewModel.shoes.observe(viewLifecycleOwner,Observer{item ->
            shoeListView(item)
        })


        _binding.lifecycleOwner =viewLifecycleOwner
        _binding.floatingActionButton.setOnClickListener{
            view?.let { it1 -> Navigation.findNavController(it1).navigate(R.id.action_shoeListFragment_to_shoeDetailsFragment) }

        }
        return _binding.root
    }



    private fun shoeListView(item: List<Shoe>?){
        item?.forEach {
            val bindingView=ListViewBinding.inflate(LayoutInflater.from(requireContext()),_binding.linearLayoutList,false)
            with(bindingView){
                nameTv.text=it.name
                sizeTv.text=it.size
                companyTv.text=it.company
                descriptionTv.text=it.description
            }
            _binding.linearLayoutList.addView(bindingView.root)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.logout_menu, menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        findNavController().navigate(R.id.action_shoeListFragment_to_loginFragment)
                return super.onOptionsItemSelected(item)
    }
}

