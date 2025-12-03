package com.example.ourbank

import androidx.appcompat.app.AlertDialog // Certifique-se de ter este import
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.ourbank.R

class TelaRegistro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_registro_activity)

        // 1. Encontrar o TextView pelo ID
        val politicaPrivacidadeTextView: TextView = findViewById(R.id.text_politica_privacidade)

        // 2. Adicionar o Listener de clique
        politicaPrivacidadeTextView.setOnClickListener {
            mostrarDialogPolitica()
        }
    }

    // 3. Função para mostrar o diálogo
    private fun mostrarDialogPolitica() {
        val titulo = "Política de Privacidade"
        val textoCompleto = getString(R.string.politica_de_privacidade_completa)

        // Cria e exibe o AlertDialog
        AlertDialog.Builder(this)
            .setTitle(titulo)
            .setMessage(textoCompleto)
            // Adiciona um botão para fechar
            .setPositiveButton("FECHAR") { dialog, which ->
                dialog.dismiss()
            }
            .show()
    }
}