package com.example.restfulapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.restfulapp.databinding.CodeLayoutBinding

var code_req: String = "404";
var CodeList: MutableList<CodeOfHTTP> = mutableListOf<CodeOfHTTP>();
class CatAdapter : RecyclerView.Adapter<CatAdapter.TaskHolder>() {
    class TaskHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = CodeLayoutBinding.bind(item)
        fun bind(task: CodeOfHTTP, pos: Int) = with(binding) {
            binding.textViewCA.setText(task.urlpath);

            val txt = itemView.findViewById<TextView>(R.id.textView_CA)
            txt.setOnClickListener {
                code_req = task.urlpath;

                txt.findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            }



        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.code_layout, parent, false)
        return TaskHolder(view)
    }

    override fun getItemCount(): Int {
        return CodeList.size
    }

    override fun onBindViewHolder(holder: TaskHolder, position: Int) {
        //holder.bind(tdViewModel!!.notes.value!![position], position) { i -> removeTask(position) }
        holder.bind(CodeList[position], position)
    }

    fun Init(){
        CodeList.add(CodeOfHTTP("0"));
        CodeList.add(CodeOfHTTP( "100"));
        CodeList.add(CodeOfHTTP( "101"));
        CodeList.add(CodeOfHTTP("102"));
        CodeList.add(CodeOfHTTP( "103"));
        CodeList.add(CodeOfHTTP("200"));
        CodeList.add(CodeOfHTTP("201"));
        CodeList.add(CodeOfHTTP("202"));
        CodeList.add(CodeOfHTTP("203"));
        CodeList.add(CodeOfHTTP("204"));
        CodeList.add(CodeOfHTTP("205"));
        CodeList.add(CodeOfHTTP("206"));
        CodeList.add(CodeOfHTTP("207"));
        CodeList.add(CodeOfHTTP("208"));
        CodeList.add(CodeOfHTTP("214"));
        CodeList.add(CodeOfHTTP("226"));
        CodeList.add(CodeOfHTTP("300"));
        CodeList.add(CodeOfHTTP("301"));
        CodeList.add(CodeOfHTTP("302"));
        CodeList.add(CodeOfHTTP("303"));
        CodeList.add(CodeOfHTTP("304"));
        CodeList.add(CodeOfHTTP("305"));
        CodeList.add(CodeOfHTTP("307"));
        CodeList.add(CodeOfHTTP("308"));
        CodeList.add(CodeOfHTTP("400"));
        CodeList.add(CodeOfHTTP("401"));
        CodeList.add(CodeOfHTTP("402"));
        CodeList.add(CodeOfHTTP("403"));
        CodeList.add(CodeOfHTTP("404"));
        CodeList.add(CodeOfHTTP("405"));
        CodeList.add(CodeOfHTTP("406"));
        CodeList.add(CodeOfHTTP("407"));
        CodeList.add(CodeOfHTTP("408"));
        CodeList.add(CodeOfHTTP("409"));
        CodeList.add(CodeOfHTTP("410"));
        CodeList.add(CodeOfHTTP("411"));
        CodeList.add(CodeOfHTTP("412"));
        CodeList.add(CodeOfHTTP("413"));
        CodeList.add(CodeOfHTTP("414"));
        CodeList.add(CodeOfHTTP("415"));
        CodeList.add(CodeOfHTTP("416"));
        CodeList.add(CodeOfHTTP("417"));
        CodeList.add(CodeOfHTTP("418"));
        CodeList.add(CodeOfHTTP("420"));
        CodeList.add(CodeOfHTTP("421"));
        CodeList.add(CodeOfHTTP("422"));
        CodeList.add(CodeOfHTTP("423"));
        CodeList.add(CodeOfHTTP("424"));
        CodeList.add(CodeOfHTTP("425"));
        CodeList.add(CodeOfHTTP("426"));
        CodeList.add(CodeOfHTTP("428"));
        CodeList.add(CodeOfHTTP("429"));
        CodeList.add(CodeOfHTTP("431"));
        CodeList.add(CodeOfHTTP("444"));
        CodeList.add(CodeOfHTTP("450"));
        CodeList.add(CodeOfHTTP("451"));
        CodeList.add(CodeOfHTTP("497"));
        CodeList.add(CodeOfHTTP("498"));
        CodeList.add(CodeOfHTTP("499"));
        CodeList.add(CodeOfHTTP("500"));
        CodeList.add(CodeOfHTTP("501"));
        CodeList.add(CodeOfHTTP("502"));
        CodeList.add(CodeOfHTTP("503"));
        CodeList.add(CodeOfHTTP("504"));
        CodeList.add(CodeOfHTTP("506"));
        CodeList.add(CodeOfHTTP("507"));
        CodeList.add(CodeOfHTTP("508"));
        CodeList.add(CodeOfHTTP("509"));
        CodeList.add(CodeOfHTTP("510"));
        CodeList.add(CodeOfHTTP("511"));
        CodeList.add(CodeOfHTTP("521"));
        CodeList.add(CodeOfHTTP("522"));
        CodeList.add(CodeOfHTTP("523"));
        CodeList.add(CodeOfHTTP("525"));
        CodeList.add(CodeOfHTTP("530"));
        CodeList.add(CodeOfHTTP("599"));
    }
}