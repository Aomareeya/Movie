package com.example.movie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.legacy.app.ActionBarDrawerToggle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.navDeepLink
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.movie.Adapter.ParentAdapter
import com.example.movie.databinding.ActivityMainBinding
import com.example.movie.model.Parent
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController: NavController
    private lateinit var binding:ActivityMainBinding
    lateinit var toggle: androidx.appcompat.app.ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)

//        val toolbarLayout = findViewById<Toolbar>(R.id.toolbarLayout)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

//        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
//        val imageList = ArrayList<SlideModel>()
//
//        imageList.add(SlideModel("https://image.bestreview.asia/wp-content/uploads/2020/08/The-King-The-Eternal-Monarch.jpg"))
//        imageList.add(SlideModel("https://s359.thaibuffer.com/pagebuilder/f9b2cf36-eb4a-4042-86d3-c0d836a573a8.jpg"))
//        imageList.add(SlideModel("https://s359.thaibuffer.com/pagebuilder/d239fea7-d647-4623-a5a7-a4f46dcfd0b0.jpg"))
//        imageList.add(SlideModel("https://s359.thaibuffer.com/pagebuilder/e60d830d-1e12-4af6-b84c-a4b14c9c36d0.jpg"))
//        imageList.add(SlideModel("https://s359.thaibuffer.com/pagebuilder/4d213651-d76d-4561-ad01-1aa36a227c05.jpg"))
//        imageList.add(SlideModel("https://s359.thaibuffer.com/pagebuilder/db1e2020-f26c-4dad-ae53-21c9797bc74a.jpg"))
//        imageList.add(SlideModel("https://s359.thaibuffer.com/pagebuilder/44393cca-c2ff-4c03-9639-7b12785303d6.jpg"))
//
//        imageSlider.setImageList(imageList,ScaleTypes.FIT)

        val bottom_navigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        val drawer_layout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navigation_view: NavigationView = findViewById(R.id.navigation_view)

        navController = findNavController(R.id.hostFragment)
        bottom_navigation.setupWithNavController(navController)

        val drawer_Layout: DrawerLayout = findViewById(R.id.drawer_layout)

        toggle = androidx.appcompat.app.ActionBarDrawerToggle(this,drawer_Layout,R.string.open,R.string.close)
        drawer_Layout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigation_view.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.homeFragment ->{
                    val intent = Intent(this,MainActivity::class.java)
                    startActivity(intent)
                    return@setNavigationItemSelectedListener true
                }
//                R.id.nav_login ->{
//                    val intent = Intent(this,LoginActivity::class.java)
//                    startActivity(intent)
//                    return@setNavigationItemSelectedListener true
//                }
            }
            true
        }



        appBarConfiguration = AppBarConfiguration(navController.graph,drawer_layout)
        NavigationUI.setupActionBarWithNavController(this,navController,drawer_layout)

        NavigationUI.setupWithNavController(navigation_view,navController)

        }

    override fun onSupportNavigateUp(): Boolean {
        return  NavigationUI.navigateUp(navController,appBarConfiguration)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.navigation_menu,menu)
        return true
    }

}