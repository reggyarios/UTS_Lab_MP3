package com.lab.myapplication

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lab.myapplication.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    lateinit var secRecyclerView: RecyclerView
    lateinit var secAdapter: MealAdapter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        setupActionBarWithNavController(navController)
        navView.setupWithNavController(navController)

        init()
        secInit()

        secRecyclerView.layoutManager= LinearLayoutManager(this)
        secRecyclerView.adapter = secAdapter

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun secInit(){
        secRecyclerView = findViewById(R.id.recycler_view_2)

        var data = ArrayList<MealPlans>()
        data.add(MealPlans(R.drawable.greek_salad,"Greek Salad with lettuce, green onion","150kcal"))
        data.add(MealPlans(R.drawable.fresh_salad,"Salad of fresh vegetables","270kcal"))

        secAdapter = MealAdapter(data)
    }

    private fun init(){
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<AdditionalExercise>()
        data.add(AdditionalExercise(R.drawable.latihan_satu,"Exercise with Jumping Rope","110 kcal", "10 min", "Beginner"))
        data.add(AdditionalExercise(R.drawable.latihan_dua,"Exercise with Holding Jumping Rope","135 kcal", "8 min", "Beginner"))
        data.add(AdditionalExercise(R.drawable.latihan_tiga,"Exercise with Sitting Dumbells","135 kcal", "5 min", "Beginner"))

        adapter = MyAdapter(data)
    }
}