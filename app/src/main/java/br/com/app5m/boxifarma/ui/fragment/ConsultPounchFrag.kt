package br.com.app5m.boxifarma.ui.fragment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import br.com.app5m.boxifarma.MainActivity
import br.com.app5m.boxifarma.R
import com.google.zxing.integration.android.IntentIntegrator
import com.google.zxing.integration.android.IntentResult
import kotlinx.android.synthetic.main.fragment_consult_pounch.*

class ConsultPounchFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_consult_pounch, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_leitura.setOnClickListener {
            val scanner = IntentIntegrator(activity)
            scanner.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE)
            scanner.setBeepEnabled(false) //retira o beep ao scannear
            scanner.initiateScan() // `this` is the current Activity
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            val result: IntentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
            if (result != null) {
                if (result.contents == null) {
                    Toast.makeText(context, "Cancelled", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(context, "Scanned: " + result.contents, Toast.LENGTH_LONG)
                        .show()
                }
            } else {
                super.onActivityResult(requestCode, resultCode, data)
            }
        }
    }
}