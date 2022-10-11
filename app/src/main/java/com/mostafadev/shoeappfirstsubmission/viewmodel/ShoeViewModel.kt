package com.mostafadev.shoeappfirstsubmission.viewmodel

import androidx.databinding.BaseObservable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.mostafadev.shoeappfirstsubmission.model.Shoe



class ShoeViewModel :ViewModel(){






    //data class for shoes
    //private var shoe:Shoe = Shoe("", "", "", "")

    //mutable list for shoes
    private lateinit var _shoeList: MutableList<Shoe>


    private var shoesList = mutableListOf<Shoe>()



    //shoe LiveData get their data from MutableLiveData
    private var _shoes = MutableLiveData<List<Shoe>>()
    val shoes: LiveData<List<Shoe>>
        get() = _shoes

  /*  //initialize ShoeList with Data From Me
    init {
        setShoesList()
    }

    private fun setShoesList() {
        _shoeList = mutableListOf(Shoe("Dunk Low Se","35","Nike","Best Shoes In My Opinion"))
        _shoes.value=_shoeList

    }*/

    /*fun updateShoeList(shoeListData: Shoe){
        _shoeList = mutableListOf<Shoe>()
        _shoes.value = _shoeList
    }*/


    fun onSave(name: String ,comapnay: String ,size:String ,descriptopn: String){
        val newItem =Shoe(name ,comapnay,size,descriptopn)
        newItem.let {item ->
            shoesList.add(item)
            _shoes.value = shoesList
        }
    }

}