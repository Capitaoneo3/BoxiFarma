package br.com.app5m.boxifarma.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.app5m.boxifarma.Helper.RecyclerItemClickListener
import br.com.app5m.boxifarma.R
import br.com.app5m.boxifarma.model.Model

class patientsListAdapter  (private val context: Context, private val listPatients: List<Model>,
                            private val clickOnListener: RecyclerItemClickListener
)
    : RecyclerView.Adapter<patientsListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val listItem: View = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.adapter_patients_list,
                parent,
                false
            ) // vai conectar com os ids abaixo
        return ViewHolder(listItem)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val patient = listPatients[position]

        /* holder.productNameCartTv.text = "Nome do produto"
 */
        holder.itemView.setOnClickListener { clickOnListener.onClickListenerPatientsList(Model()) }

    }

    override fun getItemCount(): Int {
        return listPatients.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
/*        val productNameCartTv: TextView


        init {
            productNameCartTv = itemView.findViewById(R.id.productNameCartTv)

        }*/
    }
}