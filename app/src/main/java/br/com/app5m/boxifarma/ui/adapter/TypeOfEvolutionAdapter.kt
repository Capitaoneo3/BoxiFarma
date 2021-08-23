package br.com.app5m.boxifarma.ui.adapter

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import br.com.app5m.boxifarma.Helper.RecyclerItemClickListener
import br.com.app5m.boxifarma.R
import br.com.app5m.boxifarma.model.Model

class TypeOfEvolutionAdapter(private val context: Context, private val listPounch: List<Model>,
                             private val clickOnListener: RecyclerItemClickListener
)
    : RecyclerView.Adapter<TypeOfEvolutionAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val listItem: View = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.adapter_type_of_evolution,
                parent,
                false
            ) // vai conectar com os ids abaixo
        return ViewHolder(listItem)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pounch = listPounch[position]

        /* holder.productNameCartTv.text = "Nome do produto"
 */
        holder.itemView.setOnClickListener { clickOnListener.onClickListenerTypeOfEvolution(Model()) }

    }

    override fun getItemCount(): Int {
        return listPounch.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        /*       val card: LinearLayout
               val dropDown: LinearLayout


               init {
                   card = itemView.findViewById(R.id.card)
                   dropDown = itemView.findViewById(R.id.dropDown)

               }*/
    }
}
