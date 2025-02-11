package edu.temple.simplerecyclerview

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val _numbers: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {


    class NumberViewHolder (textView: TextView) : RecyclerView.ViewHolder (textView)
    {
        val numberView = textView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            TextView(
                parent.context
            ).apply {
                setPadding(10,10,10,10)
            }
        )
    }

    override fun getItemCount(): Int {
        return _numbers.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
       holder.numberView.text =_numbers[position].toString()
        holder.numberView.textSize = _numbers[position].toFloat()
    }

}