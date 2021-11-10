package com.elramady.mechanic.Mechanic

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.*
import com.elramady.mechanic.R
import com.elramady.mechanic.databinding.ActivityMechanicMainBinding
import com.google.android.material.navigation.NavigationView

class MechanicMainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController: NavController
    lateinit var drawerLayout:DrawerLayout
    lateinit var navHostFragment:NavHostFragment
    private lateinit var binding: ActivityMechanicMainBinding
    private lateinit var navigationView: NavigationView


    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMechanicMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_mechanic_main)

        navigationView=findViewById(R.id.nav_view)




        var toolbar=findViewById<Toolbar>(R.id.toolbar_mechanic_main)

        setSupportActionBar(toolbar)

        supportActionBar!!.setHomeButtonEnabled(false);
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(false)



        navHostFragment=supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController=navHostFragment.navController

        drawerLayout=findViewById(R.id.drawer_layout)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.profile_mechanic_fragment,
                R.id.current_requests_mechanic_fragment,
                R.id.waiting_requests_mechanic_fragment,
                R.id.done_requests_mechanic_fragment,
                R.id.settings_mechanic_fragment
            ), drawerLayout)
        toolbar.setupWithNavController(navController,appBarConfiguration)
        setupActionBarWithNavController(navController, appBarConfiguration)

        navigationView.setupWithNavController(navController)


    }





    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }





}