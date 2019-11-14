package com.masamtechnologies.simplestatelayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


fun ViewGroup.inflate(i:Int){
    LayoutInflater.from(context).inflate(i,this)
}