package kr.ac.kopo.dialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnDialog = findViewById<Button>(R.id.btnDialog)

        btnDialog.setOnClickListener {
            
            var dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("안내메시지")
            dialog.setMessage("오늘은 목요일입니다.")
            dialog.setIcon(R.drawable.logo)
            dialog.setPositiveButton("확인") { dialog1, which ->
                Toast.makeText(this@MainActivity,
                    "확인 버튼을 클릭했습니다.", Toast.LENGTH_SHORT).show()
            }
            dialog.show()
        }
    }
}