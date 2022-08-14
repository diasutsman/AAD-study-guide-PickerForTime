package com.dias.pickerfortime

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showTimePickerDialog(view: View) {
        TimePickerFragment().show(supportFragmentManager, getString(R.string.txt_datepicker))
    }

    fun processTimePickerResult(hourOfDay: Int, minute: Int) {
        Toast.makeText(this, "Time: $hourOfDay:$minute", Toast.LENGTH_SHORT).show()
    }
}