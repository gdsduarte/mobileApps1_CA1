package com.example.mobileapps1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val education = findViewById<Button>(R.id.education_btn)
        val skills = findViewById<Button>(R.id.skills_btn)
        val achievements = findViewById<Button>(R.id.achievements_btn)
        val exit = findViewById<Button>(R.id.exit_btn)

        education.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        })

        skills.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        })

        achievements.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, AchievementsActivity::class.java)
            startActivity(intent)
        })

        exit.setOnClickListener(View.OnClickListener {
            finish()
        })

    }

}