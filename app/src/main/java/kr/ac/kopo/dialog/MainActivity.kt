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
            // 라디오 버튼 목록 대화상자
            var placesArr = arrayOf("에펠탑", "빅뱅", "자유의 여신상")
            var selectArr = booleanArrayOf(false, true, false)
            var dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("좋아하는 핫플")
            dialog.setIcon(R.drawable.logo)
            dialog.setSingleChoiceItems(placesArr, 1) { dialog1, which ->
                btnDialog.text = placesArr[which]
            }
            dialog.setPositiveButton("닫기", null)
            dialog.show()
        }
    }
}